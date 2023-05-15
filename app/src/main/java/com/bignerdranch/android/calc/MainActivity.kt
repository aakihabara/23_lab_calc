package com.bignerdranch.android.calc

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.EditText
import android.widget.TextView

class MainActivity : AppCompatActivity() {

    private lateinit var textView: TextView
    private lateinit var oneButton: androidx.appcompat.widget.AppCompatButton
    private lateinit var twoButton: androidx.appcompat.widget.AppCompatButton
    private lateinit var threeButton: androidx.appcompat.widget.AppCompatButton
    private lateinit var fourButton: androidx.appcompat.widget.AppCompatButton
    private lateinit var fiveButton: androidx.appcompat.widget.AppCompatButton
    private lateinit var sixButton: androidx.appcompat.widget.AppCompatButton
    private lateinit var sevenButton: androidx.appcompat.widget.AppCompatButton
    private lateinit var eightButton: androidx.appcompat.widget.AppCompatButton
    private lateinit var nineButton: androidx.appcompat.widget.AppCompatButton
    private lateinit var zeroButton: androidx.appcompat.widget.AppCompatButton
    private lateinit var plusButton: androidx.appcompat.widget.AppCompatButton
    private lateinit var minusButton: androidx.appcompat.widget.AppCompatButton
    private lateinit var multiplyButton: androidx.appcompat.widget.AppCompatButton
    private lateinit var divButton: androidx.appcompat.widget.AppCompatButton
    private lateinit var solveButton: androidx.appcompat.widget.AppCompatButton
    private lateinit var rebuildButton: androidx.appcompat.widget.AppCompatButton

    private var result = 0
    private var first_number = 0
    private var second_number = 0
    private var solve_index = 0

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        rebuildButton = findViewById(R.id.button_rebuild)
        textView = findViewById(R.id.text_text)
        oneButton = findViewById(R.id.button_one)
        twoButton = findViewById(R.id.button_two)
        threeButton = findViewById(R.id.button_three)
        fourButton = findViewById(R.id.button_four)
        fiveButton = findViewById(R.id.button_five)
        sixButton = findViewById(R.id.button_six)
        sevenButton = findViewById(R.id.button_seven)
        eightButton = findViewById(R.id.button_eight)
        nineButton = findViewById(R.id.button_nine)
        zeroButton = findViewById(R.id.button_zero)
        plusButton = findViewById(R.id.button_plus)
        minusButton = findViewById(R.id.button_minus)
        multiplyButton = findViewById(R.id.button_multiply)
        divButton = findViewById(R.id.button_div)
        solveButton = findViewById(R.id.button_solve)

        oneButton.setOnClickListener{
            textView.text = if(textView.text == "0") "1" else {textView.text.toString() + "1"}
        }

        twoButton.setOnClickListener{
            textView.text = if(textView.text == "0") "2" else {textView.text.toString() + "2"}
        }

        threeButton.setOnClickListener{
            textView.text = if(textView.text == "0") "3" else {textView.text.toString() + "3"}
        }

        fourButton.setOnClickListener{
            textView.text = if(textView.text == "0") "4" else {textView.text.toString() + "4"}
        }

        fiveButton.setOnClickListener{
            textView.text = if(textView.text == "0") "5" else {textView.text.toString() + "5"}
        }

        sixButton.setOnClickListener{
            textView.text = if(textView.text == "0") "6" else {textView.text.toString() + "6"}
        }

        sevenButton.setOnClickListener{
            textView.text = if(textView.text == "0") "7" else {textView.text.toString() + "7"}
        }

        eightButton.setOnClickListener{
            textView.text = if(textView.text == "0") "8" else {textView.text.toString() + "8"}
        }

        nineButton.setOnClickListener{
            textView.text = if(textView.text == "0") "9" else {textView.text.toString() + "9"}
        }

        zeroButton.setOnClickListener{
            textView.text = if(textView.text == "0") "0" else {textView.text.toString() + "0"}
        }

        plusButton.setOnClickListener {
            first_number = textView.text.toString().toInt()
            textView.text = "0"
            solve_index = 1
        }

        minusButton.setOnClickListener {
            first_number = textView.text.toString().toInt()
            textView.text = "0"
            solve_index = 2
        }

        multiplyButton.setOnClickListener {
            first_number = textView.text.toString().toInt()
            textView.text = "0"
            solve_index = 3
        }

        divButton.setOnClickListener {
            first_number = textView.text.toString().toInt()
            textView.text = "0"
            solve_index = 4
        }

        solveButton.setOnClickListener{
            second_number = textView.text.toString().toInt()
            when(solve_index){
                1 -> {
                    result = first_number + second_number
                }
                2 -> {
                    result = first_number - second_number
                }
                3 -> {
                    result = first_number * second_number
                }
                4 -> {
                    result = first_number / second_number
                }
                else -> {
                    //nothing
                }
            }

            textView.text = result.toString()
            first_number = result
        }

        rebuildButton.setOnClickListener{
            first_number = 0
            second_number = 0
            result = 0
            solve_index = 0
            textView.text = first_number.toString()
        }
    }
}