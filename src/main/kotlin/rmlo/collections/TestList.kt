package rmlo.collections

fun main() {
    val romulo = Funcionario(nome = "Romulo", salario = 2500.0, tipoContratacao = "CLT")
    val rafaela = Funcionario(nome = "Rafaela", salario = 2800.0, tipoContratacao = "PJ")
    val claudio = Funcionario(nome = "claudio", salario = 3000.0, tipoContratacao = "CLT")

    val funcionarios = listOf(romulo, rafaela, claudio)

    funcionarios.forEach{ println(it) }
    println("------------")
    println(funcionarios.find { it.nome == "claudio" })
}

