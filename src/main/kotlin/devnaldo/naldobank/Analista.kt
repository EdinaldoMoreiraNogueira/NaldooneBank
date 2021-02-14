package devnaldo.naldobank


class Analista(name: String, cpf: String, salario: Double): Funcionário(name, cpf, salario) {
    override fun calculoDeBonus() = salario + (salario * 0.1)
}