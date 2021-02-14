package devnaldo.naldobank.testes

import devnaldo.naldobank.Logave

class TesteAutentificacao {
    fun autentica(logave: Logave) = println(logave.login())
}