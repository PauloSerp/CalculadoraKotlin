package com.example.calculadorakotlin

import android.os.Build
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.view.View
import android.widget.Toast
import androidx.core.graphics.toColor
import com.google.android.material.snackbar.Snackbar
import kotlinx.android.synthetic.main.activity_main.*

class MainActivity : AppCompatActivity() {
    var cont = 0
    var numeroF: Int = 0
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

    }

    fun ClickAction(view: View) {
        when(view.id){
            R.id.float_um_id ->     adicionaNumero(1)
            R.id.float_dois_id ->   adicionaNumero(2)
            R.id.float_tres_id ->   adicionaNumero(3)
            R.id.float_quatro_id -> adicionaNumero(4)
            R.id.float_cinco_id ->  adicionaNumero(5)
            R.id.float_seis_id ->   adicionaNumero(6)
            R.id.float_sete_id ->   adicionaNumero(7)
            R.id.float_oito_id ->   adicionaNumero(8)
            R.id.float_nove_id ->   adicionaNumero(9)
            R.id.float_zero_id ->   adicionaNumero(0)

            R.id.float_delete_id -> {
                text_number_id.setText("")
                numeroF = 0
                cont = 0

            }

            else -> Toast.makeText(this, "Error", Toast.LENGTH_LONG).show()

        }

        /*
        val numero = 1f
        if(numeroF == 0f) {
            numeroF = numero
            text_number_id.setText("$numeroF")
            numeroF = text_number_id.text.toString().toFloat()
        }else{
            text_number_id.setText("$numeroF" + numero)
            numeroF = text_number_id.text.toString().toFloat()
        }*/

        }


    fun adicionaNumero(numero: Int){

        if (cont <= 9) {
            if (numeroF == 0) {
                numeroF = numero
                text_number_id.setText("$numeroF")
                numeroF = text_number_id.text.toString().toInt()
            } else {
                text_number_id.setText("$numeroF" + numero)
                numeroF = text_number_id.text.toString().toInt()
            }
            cont++
        }else{
            Toast.makeText(this, "numero maior que o permitido", Toast.LENGTH_SHORT).show()
        }

    }

    fun ClickActionSoma(view: View) {}
    fun ClickActionSubtracao(view: View) {}
    fun ClickActionMultiplicacao(view: View) {}
    fun ClickActionDivisao(view: View) {}
    fun ClickActionResultado(view: View) {}

}


