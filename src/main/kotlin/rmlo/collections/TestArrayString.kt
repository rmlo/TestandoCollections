package rmlo.collections

fun main() {
    val nomes = Array(4){""}
    nomes [0] = "rafa"
    nomes [1] = "afaela"
    nomes [2] = "fa da silva"
    nomes [3] = "finha"

    for (nome in nomes) {
    println(nome)
    }

    nomes.sort()
    nomes.forEach {
        println(it)
    }

    val nome = arrayOf("Romulo", "Claudio","Vanessa")
    nome.sort()
    nome.forEach {println(it)}
}