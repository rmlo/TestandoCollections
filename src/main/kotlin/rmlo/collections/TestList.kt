package rmlo.collections

fun main() {
    val romulo = Funcionario(nome = "Romulo", salario = 2500.0)
    val rafaela = Funcionario(nome = "Rafaela", salario = 2800.0)
    val claudio = Funcionario(nome = "claudio", salario = 3000.0)

    val funcionarios = listOf(romulo, rafaela, claudio)

    funcionarios.forEach{ println(it) }
    println("------------")
    println(funcionarios.find { it.nome == "claudio" })
}

data class Funcionario(
    val nome: String,
    val salario: Double
) {
    override fun toString(): String =
        """
        Nome: $nome
        Salario: $salario
    """.trimIndent()
}