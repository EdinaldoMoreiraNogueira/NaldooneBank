package devnaldo.naldobank.testes

import devnaldo.naldobank.Banco

fun main(){
    val naldoBankOne = Banco("NaldoBankOne", 12 )

    println(naldoBankOne.nome)
    println(naldoBankOne.numero)
}