package com.dayanidhi.calculator.activity
import android.os.Bundle
import android.view.View
import android.widget.ArrayAdapter
import android.widget.ListView
import androidx.appcompat.app.AppCompatActivity
import androidx.appcompat.widget.Toolbar
import com.dayanidhi.calculator.DBHelper
import com.dayanidhi.calculator.R


class History : AppCompatActivity() {
    private var lv: ListView? = null
    private var dbHelper: DBHelper? = null
    private var list: ArrayList<String>? = null
    private var adapter: ArrayAdapter<String>? = null
    private var calcName = ""
    private val EmptyList =
        arrayOf("There is  no history yet")

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_history)
        val toolbar: Toolbar = findViewById<View>(R.id.toolbar) as Toolbar
        setSupportActionBar(toolbar)
        lv = findViewById<View>(R.id.listView) as ListView
        dbHelper = DBHelper(this)
        calcName = intent.getStringExtra("calcName")
        list = dbHelper!!.showHistory(calcName)
        adapter = if (!list!!.isEmpty()) ArrayAdapter(
            this,
            android.R.layout.simple_list_item_1,
            list!!
        ) else ArrayAdapter(this, android.R.layout.simple_list_item_1, EmptyList)
        lv!!.setAdapter(adapter)
    }

    fun onClick(v: View?) {
        dbHelper!!.deleteRecords(calcName)
        adapter = ArrayAdapter(this, android.R.layout.simple_list_item_1, EmptyList)
        lv?.setAdapter(adapter)
    }
}
