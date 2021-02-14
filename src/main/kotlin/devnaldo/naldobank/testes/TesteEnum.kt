package devnaldo.naldobank.testes

import devnaldo.naldobank.TipoCliente

fun main(){
   TipoCliente.values().forEach { elemento ->
       println("${elemento.name} - ${elemento.descricao}")
   }

    TipoCliente.values().forEach {
        println("${it.name} - ${it.descricao}")
    }
}