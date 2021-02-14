package devnaldo.naldobank.testes

import devnaldo.naldobank.Funcionário

class ImprimeRelatorioFuncionario {
    companion object {
        fun imprime(funcionario: Funcionário){
            println(
                funcionario.toString()
            )
        }
    }
}