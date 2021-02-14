package devnaldo.naldobank



abstract class Funcionário(
    override val name: String,
    override val cpf: String,
    val salario: Double,
) : Cliente(name,  cpf) {
   protected abstract fun calculoDeBonus() : Double

    override fun toString(): String = """
        Nome: $name
        Cpf: $cpf
        Salario: $salario
        Bonus: ${calculoDeBonus()}
    """.trimIndent()}