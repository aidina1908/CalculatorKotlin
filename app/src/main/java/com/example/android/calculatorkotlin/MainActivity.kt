package com.example.android.calculatorkotlin

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.view.View
import android.widget.Button
import android.widget.EditText
import android.widget.TextView
import kotlinx.android.synthetic.main.activity_main.*
import kotlinx.android.synthetic.main.activity_output.*

class MainActivity : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        val texView = findViewById<TextView>(R.id.textView)

        buttonPlus.setOnClickListener(){
            add()

            val intent = Intent(this, OutputActivity::class.java)
            intent.putExtra("output",textView.text.toString())
            startActivity(intent)
        }

        buttonMinus.setOnClickListener(){
            minus()

            val intent = Intent(this, OutputActivity::class.java)
            intent.putExtra("output",textView.text.toString())
            startActivity(intent)
        }

        buttonMultiply.setOnClickListener(){
            multiply()

            val intent = Intent(this, OutputActivity::class.java)
            intent.putExtra("output",textView.text.toString())
            startActivity(intent)
        }

        buttonDivide.setOnClickListener(){
            divide()

            val intent = Intent(this, OutputActivity::class.java)
            intent.putExtra("output",textView.text.toString())
            startActivity(intent)
        }
    }

    fun add(){
        val input1 = num1.text.toString().trim().toBigDecimal()
        val input2 = num2.text.toString().trim().toBigDecimal()
        textView.text = input1.add(input2).toString()
    }

    fun minus(){
        val input1 = num1.text.toString().trim().toBigDecimal()
        val input2 = num2.text.toString().trim().toBigDecimal()
        textView.text = input1.subtract(input2).toString()
    }

    fun multiply(){
        val input1 = num1.text.toString().trim().toBigDecimal()
        val input2 = num2.text.toString().trim().toBigDecimal()
        textView.text = input1.multiply(input2).toString()
    }

    fun divide(){
        val input1 = num1.text.toString().trim().toBigDecimal()
        val input2 = num2.text.toString().trim().toBigDecimal()
        textView.text = input1.divide(input2).toString()
    }
}




