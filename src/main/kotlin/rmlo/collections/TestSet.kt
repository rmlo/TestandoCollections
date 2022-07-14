package rmlo.collections

fun main() {
    val romulo = Funcionario(nome = "Romulo", salario = 2500.0,"CLT")
    val rafaela = Funcionario(nome = "Rafaela", salario = 2800.0,"PJ")
    val claudio = Funcionario(nome = "claudio", salario = 3000.0,"CLT")

    val funcionarios1 = setOf(romulo, rafaela)
    val funcionarios2 = setOf(claudio)

    val uniaoDosConjuntos = funcionarios1.union(funcionarios2)
    uniaoDosConjuntos.forEach{(println(it))}

    println("------------")
    val funcionarios3 = setOf(romulo, rafaela, claudio)
    val removendoDosConjuntos = funcionarios3.subtract(funcionarios1)
    removendoDosConjuntos.forEach{(println(it))}

    println("------------")
    val intersecaoDosConjuntos = funcionarios3.intersect(funcionarios2)
    intersecaoDosConjuntos.forEach{(println(it))}

}

