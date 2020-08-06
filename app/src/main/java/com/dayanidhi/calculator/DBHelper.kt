package com.dayanidhi.calculator

import android.content.ContentValues
import android.content.Context
import android.database.Cursor
import android.database.sqlite.SQLiteDatabase
import android.database.sqlite.SQLiteOpenHelper
import android.util.Log


class DBHelper(context: Context?) :
    SQLiteOpenHelper(
        context,
        database_Name,
        null,
        database_Version
    ) {
    var db: SQLiteDatabase? = null
    override fun onCreate(db: SQLiteDatabase) {
        db.execSQL(create_Table)
        Log.i(TAG, "Table Created")
    }

    fun insert(calcName: String?, expression: String?) {
        db = writableDatabase
        val contentValues = ContentValues()
        contentValues.put(column1, calcName)
        contentValues.put(column2, expression)
        db?.insert(table_Name, null, contentValues)
        db?.close()
    }

    fun showHistory(calcName: String): ArrayList<String> {
        db = readableDatabase
        val cursor: Cursor
        val list = ArrayList<String>()
        val selectionArgs = arrayOf(calcName)
        //cursor=db.query(table_Name,columns,column1+" LIKE ?",selectionArgs,null,null,null);
        cursor = db?.rawQuery(
            "select * from $table_Name where $column1 = ?",
            selectionArgs
        )!!
        if (cursor.moveToFirst()) {
            do {
                val expression: String = cursor.getString(1)
                list.add(expression)
            } while (cursor.moveToNext())
        }
        db?.close()
        return list
    }

    fun deleteRecords(calcName: String) {
        db = writableDatabase
        val value = arrayOf(calcName)
        val i =
            db?.delete(table_Name, "$column1=?", value)
        db?.close()
    }

    override fun onUpgrade(
        db: SQLiteDatabase,
        oldVersion: Int,
        newVersion: Int
    ) {
    }

    companion object {
        private const val database_Name = "HISTORY.DB"
        private const val database_Version = 1
        private const val TAG = "DATABASE OPERATIONS"
        private const val table_Name = "history"
        private const val column1 = "calculator_name"
        private const val column2 = "expression"
        private const val create_Table =
            "CREATE TABLE $table_Name($column1 TEXT,$column2 TEXT);"
    }

    init {
        Log.i(TAG, "Database Created / Opened")
    }
}
