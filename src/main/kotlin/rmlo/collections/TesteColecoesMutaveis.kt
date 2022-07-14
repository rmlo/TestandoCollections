package rmlo.collections

fun main() {
    val romulo = Funcionario(nome = "Romulo", salario = 2500.0, tipoContratacao = "CLT")
    val rafaela = Funcionario(nome = "Rafaela", salario = 2800.0, tipoContratacao = "PJ")
    val claudio = Funcionario(nome = "claudio", salario = 3000.0, tipoContratacao = "CLT")

    println("------------")
    val funcionarios = mutableListOf(romulo, rafaela)
    funcionarios.add(claudio)
    funcionarios.forEach{ println(it) }

    println("------------")
    funcionarios.remove(romulo)
    funcionarios.forEach{ println(it) }

    println("------------")
    val funcionarioSET = mutableSetOf(rafaela)
    funcionarioSET.forEach{ println(it) }

    println("------------")
    funcionarioSET.add(romulo)
    funcionarioSET.add(claudio)
    funcionarioSET.forEach{ println(it) }

    println("------------")
    funcionarioSET.remove(claudio)
    funcionarioSET.forEach{ println(it) }
}