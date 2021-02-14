package devnaldo.naldobank.testes

import devnaldo.naldobank.Analista
import devnaldo.naldobank.Cliente
import devnaldo.naldobank.Funcionário
import java.math.BigDecimal


fun main(){

    val wiviane= Analista("Wiviane", "123.123.123.88", 86572.0)

    ImprimeRelatorioFuncionario.imprime(wiviane)
}
