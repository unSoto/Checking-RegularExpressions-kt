package com.example.checking_regularexpressions_kt

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.view.View
import android.widget.EditText
import android.widget.TextView

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
    }

    //ENG: Removing vowel letters from a string //RUS: Удаление английских гласных из строки

    fun onClick(view: View){

        var edit: EditText = findViewById(R.id.text)
        var textView2: TextView = findViewById(R.id.text2)

        var txt = edit.text
        textView2.text = txt.replace("[EYUIOAeyuioaЁёУуЕеЫыАаОоЭэЯяИиЮю]".toRegex(), "") //rus and eng
    }

    //ENG: Removing even numbers from a string //RUS: Удаление четных чисел из строки

    fun onClick2(view: View) {

        var edit: EditText = findViewById(R.id.text4)
        var textView2: TextView = findViewById(R.id.text5)

        var txt = edit.text
        textView2.text = txt.replace("[2468]".toRegex(), "")
    }

    //ENG: Number of words per line //RUS: Посчитать кол-во слов в строке

    fun onClick3(view: View) {

        var edit: EditText = findViewById(R.id.text6)
        var textView2: TextView = findViewById(R.id.text7)

        val words = edit.text
        val totalWords = Regex("""(\s+|(\r\n|\r|\n))""").findAll(words.trim()).count() + 1
        textView2.text = totalWords.toString()
    }

}