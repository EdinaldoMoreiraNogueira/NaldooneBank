package devnaldo.naldobank

 class Vip(name: String,
                   cpf: String,
                   val tipoCliente: TipoCliente,
          val senha: String): Cliente(name, cpf ), Logave {
     override fun login(senha: String): Boolean {
         TODO("Not yet implemented")
     }

     override fun login(): Boolean = "senha123" == senha

    override fun toString(): String = """
        Nome: $name
        Cpf:  $cpf
        Tipo: $tipoCliente
      
    """.trimIndent()}

