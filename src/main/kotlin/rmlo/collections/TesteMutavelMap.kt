package rmlo.collections

fun main() {
    val romulo = Funcionario(nome = "Romulo", salario = 2500.0,"CLT")
    val rafaela = Funcionario(nome = "Rafaela", salario = 2800.0,"PJ")
    val claudio = Funcionario(nome = "claudio", salario = 3000.0,"CLT")

    val repositorio = Repositorio<Funcionario>()

    repositorio.criacao(romulo.nome, romulo)
    repositorio.criacao(rafaela.nome, rafaela)
    repositorio.criacao(claudio.nome, claudio)

    println(repositorio.findById(romulo.nome))
    println("----------")

    repositorio.findALL().forEach{ println(it) }
    println("----------")

    repositorio.remover(romulo.nome)
    repositorio.findALL().forEach{ println(it) }
}