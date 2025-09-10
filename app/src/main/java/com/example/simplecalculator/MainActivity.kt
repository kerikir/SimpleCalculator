package com.example.simplecalculator

import android.os.Bundle
import android.widget.TextView
import androidx.activity.enableEdgeToEdge
import androidx.appcompat.app.AppCompatActivity
import androidx.core.view.ViewCompat
import androidx.core.view.WindowInsetsCompat

class MainActivity : AppCompatActivity()
{
    override fun onCreate(savedInstanceState: Bundle?)
    {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        // Привязка переменных к кнопкам
        val textViewSqrt: TextView = findViewById(R.id.btnSqrt)
        val textViewLog: TextView = findViewById(R.id.btnLog2)
        val textViewLn: TextView = findViewById(R.id.btnLn)
        val textViewLeftBracket: TextView = findViewById(R.id.btnLeftBracket)
        val textViewRightBracket: TextView = findViewById(R.id.btnRightBracket)

        val textViewPow = findViewById<TextView>(R.id.btnPow)
        val textViewClear = findViewById<TextView>(R.id.btnClear)
        val textViewBack = findViewById<TextView>(R.id.btnBack)
        val textViewPercent = findViewById<TextView>(R.id.btnPercent)
        val textViewDiv = findViewById<TextView>(R.id.btnDiv)

        val textViewSin = findViewById(R.id.btnSin) as TextView
        val textViewSeven = findViewById(R.id.btnSeven) as TextView
        val textViewEight = findViewById(R.id.btnEight) as TextView
        val textViewNine = findViewById(R.id.btnNine) as TextView
        val textViewTimes = findViewById(R.id.btnTimes) as TextView

        val textViewCos: TextView = findViewById<TextView>(R.id.btnCos)
        val textViewFour: TextView = findViewById<TextView>(R.id.btnFour)
        val textViewFive: TextView = findViewById<TextView>(R.id.btnFive)
        val textViewSix: TextView = findViewById<TextView>(R.id.btnSix)
        val textViewMinus: TextView = findViewById<TextView>(R.id.btnMinus)

        val textViewPi: TextView = findViewById(R.id.btnPi)
        val textViewOne: TextView = findViewById(R.id.btnOne)
        val textViewTwo: TextView = findViewById(R.id.btnTwo)
        val textViewThree: TextView = findViewById(R.id.btnThree)
        val textViewPlus: TextView = findViewById(R.id.btnPlus)

        val textViewExp = findViewById<TextView>(R.id.btnExp)
        val textViewThousand = findViewById<TextView>(R.id.btnThousand)
        val textViewPoint = findViewById<TextView>(R.id.btnPoint)
        val textViewZero = findViewById<TextView>(R.id.btnZero)
        val textViewCalculate = findViewById<TextView>(R.id.btnCalculate)


        // Привязка обработчика нажатий к кнопке
        // Отрисовка на дисплее калькулятора
        val textViewOperation: TextView = findViewById(R.id.operation) as TextView

        textViewSqrt.setOnClickListener { textViewOperation.append("sqrt(") }
        textViewLog.setOnClickListener { textViewOperation.append("log2(") }
        textViewLn.setOnClickListener { textViewOperation.append("ln(") }
        textViewLeftBracket.setOnClickListener { textViewOperation.append("(") }
        textViewRightBracket.setOnClickListener { textViewOperation.append(")") }

        textViewPow.setOnClickListener { textViewOperation.append("^") }
        textViewPercent.setOnClickListener { textViewOperation.append(" % ") }
        textViewDiv.setOnClickListener { textViewOperation.append(" / ") }

        textViewSin.setOnClickListener { textViewOperation.append("sin(") }
        textViewSeven.setOnClickListener { textViewOperation.append("7") }
        textViewEight.setOnClickListener { textViewOperation.append("8") }
        textViewNine.setOnClickListener { textViewOperation.append("9") }
        textViewTimes.setOnClickListener { textViewOperation.append(" * ") }

        textViewCos.setOnClickListener { textViewOperation.append("cos(") }
        textViewFour.setOnClickListener { textViewOperation.append("4") }
        textViewFive.setOnClickListener { textViewOperation.append("5") }
        textViewSix.setOnClickListener { textViewOperation.append("6") }
        textViewMinus.setOnClickListener { textViewOperation.append(" - ") }

        textViewPi.setOnClickListener { textViewOperation.append("pi") }
        textViewOne.setOnClickListener { textViewOperation.append("1") }
        textViewTwo.setOnClickListener { textViewOperation.append("2") }
        textViewThree.setOnClickListener { textViewOperation.append("3") }
        textViewPlus.setOnClickListener { textViewOperation.append(" + ") }

        textViewExp.setOnClickListener { textViewOperation.append("e") }
        textViewThousand.setOnClickListener { textViewOperation.append("000") }
        textViewPoint.setOnClickListener { textViewOperation.append(".") }
        textViewZero.setOnClickListener { textViewOperation.append("0") }
        textViewCalculate.setOnClickListener { textViewOperation.append(" =") }

        // Кнопка назад
        textViewBack.setOnClickListener {
            val s = textViewOperation.text.toString()
            if (s != "")
            {
                textViewOperation.text = s.substring(0, s.length - 1)
            }
        }

        // Кнопка очистки
        val textViewResult = findViewById<TextView>(R.id.result)
        textViewClear.setOnClickListener {
            textViewOperation.text = ""
            textViewResult.text = ""
        }
    }
}