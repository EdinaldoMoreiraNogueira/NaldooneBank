package devnaldo.naldobank.testes

import devnaldo.naldobank.Analista
import devnaldo.naldobank.Cliente
import devnaldo.naldobank.Funcionário
import devnaldo.naldobank.Gerente
import java.math.BigDecimal


fun main() {

 val Edinaldo = Gerente(name = "Edinaldo", cpf = "000.000.000.00", salario = 100000.0, "03wiarpe")

  ImprimeRelatorioFuncionario.imprime(Edinaldo)
    TesteAutentificacao().autentica(Edinaldo)

}