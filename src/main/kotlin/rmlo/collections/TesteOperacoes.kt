package rmlo.collections

fun main() {
    val salarios = doubleArrayOf(1500.0, 2000.0, 4200.0)

    for (salario in salarios) println(salario)

    println("----")

    println("maior salario: ${salarios.max()}")
    println("menor salario: ${salarios.min()}")
    println("media salario: ${salarios.average()}")

    val buscaDeSalario = salarios.filter { it > 2500.0 }
    println("----------")
    buscaDeSalario.forEach{println(it)}

    println("----------")
    println(salarios.count { it in 1700.0..4500.0 })
    println("----------")
    println(salarios.find { it == 1500.0 })
    println("----------")
    println(salarios.any { it == 1500.0 })

}