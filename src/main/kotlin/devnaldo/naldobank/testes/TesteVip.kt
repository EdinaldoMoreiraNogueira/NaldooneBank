package devnaldo.naldobank.testes

import devnaldo.naldobank.TipoCliente
import devnaldo.naldobank.Vip

fun main(){

        val Pedro = Vip(
            name = "Pedro Nogueira",
            cpf = "000.000.000.00",
            tipoCliente = TipoCliente.PF,
            senha = "123456"
        )
    println(Pedro)
    TesteAutentificacao().autentica(Pedro)

}
