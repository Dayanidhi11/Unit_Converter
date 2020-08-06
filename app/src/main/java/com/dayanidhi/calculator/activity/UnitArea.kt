package com.dayanidhi.calculator.activity
import android.os.Bundle
import android.view.View
import android.widget.EditText
import android.widget.Spinner
import androidx.appcompat.app.AppCompatActivity
import androidx.appcompat.widget.Toolbar
import com.dayanidhi.calculator.ConvertingUnits
import com.dayanidhi.calculator.R


class UnitArea : AppCompatActivity() {
    private var e1: EditText? = null
    private var e2: EditText? = null
    private var s1: Spinner? = null
    private var s2: Spinner? = null
    private var count1 = 0
    private var ca: ConvertingUnits.Area? = null
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_unit_area)
        val toolbar: Toolbar = findViewById<View>(R.id.toolbar) as Toolbar
        setSupportActionBar(toolbar)
        e1 = findViewById<View>(R.id.item1) as EditText
        e2 = findViewById<View>(R.id.item2) as EditText
        s1 = findViewById<View>(R.id.spinner1) as Spinner
        s2 = findViewById<View>(R.id.spinner2) as Spinner
        ca = ConvertingUnits.Area()
    }

    fun onClick(v: View) {
        when (v.id) {
            R.id.num0 -> e1!!.setText(e1!!.text.toString() + "0")
            R.id.num1 -> e1!!.setText(e1!!.text.toString() + "1")
            R.id.num2 -> e1!!.setText(e1!!.text.toString() + "2")
            R.id.num3 -> e1!!.setText(e1!!.text.toString() + "3")
            R.id.num4 -> e1!!.setText(e1!!.text.toString() + "4")
            R.id.num5 -> e1!!.setText(e1!!.text.toString() + "5")
            R.id.num6 -> e1!!.setText(e1!!.text.toString() + "6")
            R.id.num7 -> e1!!.setText(e1!!.text.toString() + "7")
            R.id.num8 -> e1!!.setText(e1!!.text.toString() + "8")
            R.id.num9 -> e1!!.setText(e1!!.text.toString() + "9")
            R.id.dot -> if (count1 == 0) {
                e1!!.setText(e1!!.text.toString() + ".")
                count1++
            }
            R.id.clear -> {
                e1!!.setText("")
                e2!!.setText("")
                count1 = 0
            }
            R.id.backSpace -> if (e1!!.length() != 0) {
                val text = e1!!.text.toString()
                if (text.endsWith(".")) count1 = 0
                val newText = text.substring(0, text.length - 1)
                e1!!.setText(newText)
            }
            R.id.equal -> {
                val item1 = s1!!.selectedItemPosition
                val item2 = s2!!.selectedItemPosition
                val value1 = e1!!.text.toString().toDouble()
                val result = evaluate(item1, item2, value1)
                e2!!.setText(result.toString() + "")
            }
        }
    }

    fun evaluate(item1: Int, item2: Int, value: Double): Double {
        var temp = 0.0
        return if (item1 == item2) value else {
            when (item1) {
                0 -> temp = ca!!.sqMilliToMeter(value)
                1 -> temp = ca!!.sqCentiToMeter(value)
                2 -> temp = value
                3 -> temp = ca!!.sqKiloToMeter(value)
                4 -> temp = ca!!.AcreToMeter(value)
                5 -> temp = ca!!.HectareToMeter(value)
            }
            when (item2) {
                0 -> temp = ca!!.sqMeterToMilli(temp)
                1 -> temp = ca!!.sqMeterToCenti(temp)
                3 -> temp = ca!!.sqMeterToKilo(temp)
                4 -> temp = ca!!.sqMeterToAcre(temp)
                5 -> temp = ca!!.sqMeterToHectare(temp)
            }
            temp
        }
    }
}
