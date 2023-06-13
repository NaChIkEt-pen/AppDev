package com.nachiket.calculator

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button
import android.widget.EditText
import android.widget.TextView
import android.widget.Toast
import java.sql.Types.NULL
import kotlin.math.log

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
        val plus_btn = findViewById<Button>(R.id.plusBtn)
        val minus_btn = findViewById<Button>(R.id.minusBtnn)
        val multi_btn=findViewById<Button>(R.id.multiplyBtn)
        val divide_btn=findViewById<Button>(R.id.divideBtn)

        var et_num1=findViewById<EditText>(R.id.num1)
        var et_num2=findViewById<EditText>(R.id.num2)
        var result=findViewById<TextView>(R.id.tvResult)




        plus_btn.setOnClickListener {
            var num1=et_num1.text.toString()
            var num2=et_num2.text.toString()

            if(num1.toInt()==NULL || num2.toInt()==NULL )
            {   var msg = "Enter numbers"
                Toast.makeText(this,msg,Toast.LENGTH_SHORT)
            }
            else {
                result.text = (num1.toInt() + num2.toInt()).toString()
            }
        }

        minus_btn.setOnClickListener {
            var num1=et_num1.text.toString()
            var num2=et_num2.text.toString()

            if(num1.toInt()==NULL || num2.toInt()==NULL )
            {   var msg = "Enter numbers"
                Toast.makeText(this,msg,Toast.LENGTH_SHORT)
            }
            else
            result.text=(num1.toInt()-num2.toInt()).toString()
        }

        multi_btn.setOnClickListener {
            var num1=et_num1.text.toString()
            var num2=et_num2.text.toString()

            if(num1.toInt()==NULL || num2.toInt()==NULL )
            {   var msg = "Enter numbers"
                Toast.makeText(this,msg,Toast.LENGTH_SHORT)
            }
            else
                result.text=(num1.toInt()*num2.toInt()).toString()
        }

        divide_btn.setOnClickListener {
            var num1=et_num1.text.toString()
            var num2=et_num2.text.toString()

            if(num1.toInt()==NULL || num2.toInt()==NULL )
            {   var msg = "Enter numbers"
                Toast.makeText(this,msg,Toast.LENGTH_SHORT)
            }
            else
            result.text=(num1.toFloat()/num2.toFloat()).toString()
        }
    }
}