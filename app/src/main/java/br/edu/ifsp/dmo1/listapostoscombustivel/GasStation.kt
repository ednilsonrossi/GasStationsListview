package br.edu.ifsp.dmo1.listapostoscombustivel

class GasStation (
    val name: String,
    val address: String,
    val gas: Double,
    val etha: Double) {

    override fun toString(): String {
        return "$name \n$address"
    }
}