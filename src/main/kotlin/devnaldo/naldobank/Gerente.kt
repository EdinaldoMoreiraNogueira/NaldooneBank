package devnaldo.naldobank

class Gerente(name: String,
                       cpf: String,
                       salario: Double,
                     val senha: String) :
    Funcionário(name = name, cpf = cpf, salario = salario), Logave {
    override fun calculoDeBonus(): Double = salario * 0.4;
    override fun login(): Boolean {
        TODO("Not yet implemented")
    }

    override fun login(senha: String): Boolean = "03wiarpe" == senha




}