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
    var primeiroNumero: Int = 0
    var operador: Int = 0
    var numero: Int = 0
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
                this.numero = 0
                cont = 0

            }

            else -> Toast.makeText(this, "Error", Toast.LENGTH_LONG).show()

            }
        }


    fun adicionaNumero(numero: Int){

        if (cont <= 9) {
            if (this.numero == 0) {
                this.numero = numero
                text_number_id.setText("${this.numero}")
                this.numero = text_number_id.text.toString().toInt()
            } else {
                text_number_id.setText("${this.numero}" + numero)
                this.numero = text_number_id.text.toString().toInt()
            }
            cont++
        }else{
            Toast.makeText(this, "numero maior que o permitido", Toast.LENGTH_SHORT).show()
        }

    }

    fun ClickActionSoma(view: View) {
        primeiroNumero = numero
        numero = 0
        operador = 1
    }
    fun ClickActionSubtracao(view: View) {
        primeiroNumero = numero
        numero = 0
        operador = 2
    }
    fun ClickActionMultiplicacao(view: View) {
        primeiroNumero = numero
        numero = 0
        operador = 3
    }
    fun ClickActionDivisao(view: View) {
        if(numero!=0){
        primeiroNumero = numero
        numero = 0
            operador = 4
        }else{

            Toast.makeText(this, "1º mandamento da matemática: Não dividiras por 0", Toast.LENGTH_LONG).show()
        }
    }
    fun ClickActionResultado(view: View) {
        val calcLogic = CalcLogic(primeiroNumero, numero)
        var resultado = 0
        when(operador){
            1 -> {
            resultado = calcLogic.calculaSoma()
            text_number_id.setText("$resultado")
        }
            2 -> {
            resultado = calcLogic.calculaSubtracao()
            text_number_id.setText("$resultado")
        }
            3 -> {
            resultado = calcLogic.calculaMultiplicacao()
            text_number_id.setText("$resultado")
        }
            4 -> {
            resultado = calcLogic.calculaDivisao()
            text_number_id.setText("$resultado")
        }

        else -> {
            Toast.makeText(this, "Aconteceu algum erro inesperado", Toast.LENGTH_SHORT).show()
        }

    }

    }

}


