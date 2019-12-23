package com.example.calculadorakotlin

class CalcLogic(val primeiroNumero: Int, val segundoNumero: Int) {



    fun calculaSoma(): Int { return primeiroNumero+segundoNumero}

    fun calculaSubtracao(): Int { return primeiroNumero - segundoNumero}

    fun calculaMultiplicacao(): Int { return primeiroNumero*segundoNumero}

    fun calculaDivisao(): Int { return primeiroNumero/segundoNumero}
}