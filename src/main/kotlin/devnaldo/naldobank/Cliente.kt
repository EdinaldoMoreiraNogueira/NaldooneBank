package devnaldo.naldobank

class Cliente {
    var name: String = "Edinaldo"
    var cpf: String = "123.123.123.88"
}

fun main(){
    val edinaldo = Cliente()

    println(edinaldo.name)
    println(edinaldo.cpf)
}