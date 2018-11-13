package br.com.washington.polindromo

import android.support.v7.app.AppCompatActivity
import android.os.Bundle
import android.util.Log
import android.view.View
import android.widget.EditText
import android.widget.TextView

class MainActivity : AppCompatActivity() {

    private var editText: EditText? = null
    private var textView: TextView? = null

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        editText = findViewById<EditText>(R.id.polindromo)
        textView = findViewById<TextView>(R.id.resultado)
    }

    fun verificar(view: View) {
        var resultado = editText?.text.toString().trim()

        when {
            resultado.isEmpty() -> textView?.text = ""
            resultado.equals(resultado.reversed()) -> textView?.text = "$resultado é um Palíndromo"
            else -> textView?.text = "$resultado não é um Palíndromo"
        }

    }
}
