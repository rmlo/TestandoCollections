package rmlo.collections

class Repositorio<T> {
    private val map = mutableMapOf<String, T>()

    fun criacao(id: String, value: T){
        map[id] = value
    }

    fun remover(id: String) = map.remove(id)

    fun findById(id: String) = map[id]
    fun findALL() = map.values
    }
