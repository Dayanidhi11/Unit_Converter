package com.dayanidhi.calculator.activity
import android.content.Intent
import android.os.Bundle
import android.view.View
import androidx.appcompat.app.AppCompatActivity
import androidx.appcompat.widget.Toolbar
import com.dayanidhi.calculator.*


class UnitCoverter : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_unit_coverter)
        val toolbar: Toolbar = findViewById<View>(R.id.toolbar) as Toolbar
        setSupportActionBar(toolbar)
    }

    fun onClick(v: View) {
        val i: Intent
        when (v.id) {
            R.id.area -> {
                i = Intent(this, UnitArea::class.java)
                startActivity(i)
            }
            R.id.length -> {
                i = Intent(this, UnitLength::class.java)
                startActivity(i)
            }
            R.id.weight -> {
                i = Intent(this, UnitWeight::class.java)
                startActivity(i)
            }
            R.id.tempearture -> {
                i = Intent(this, UnitTemperature::class.java)
                startActivity(i)
            }
        }
    }
}
