import javax.sql.rowset.Predicate

fun main () {

    val restricts = mutableListOf(12,18,25,40,65)

    //println(restricts.last { it < 40 })
    //println(restricts.myLast { it < 40 })

    //restricts.removeAll { it >27 }
    //println(restricts)
    //restricts.myRemoveAll { it > 12 }
    //println(restricts)

    //println( restricts.filter {  it > 25})
    //println(restricts)
    //println(restricts.myFilter { it > 25 })

    //restricts.removeIf { it % 2 != 0 }
    //restricts.myRemoveIf { it % 2 != 0  }
    //println(restricts)


}

//type algorithm of .last{} with generics
fun <E> List<E>.myLast(predicate: (E) -> Boolean) : E {

    for (index in this.size - 1 downTo 0 )
        if (predicate(this[index]))
                return this[index]
    return this[size]

}

//type algorithm of .removeAll{} with generics
fun <T> MutableList<T>.myRemoveAll(predicate: (T) -> Boolean) : Boolean {
    var result = false
    var index = 0

        while(index < this.size) {
            if (predicate (this[index])){

                this.removeAt(index)
                result = true

            } else index++
    }
    return result
}

//type algorithm of .filter{} with generics
fun <T> List<T>.myFilter(predicate: (T) -> Boolean) : List<T> {
    val result = mutableListOf<T>()

    for ( item in this)
        if (predicate(item))
            result.add(item)
    return result
}

//type algorithm of .removeIf{} with generics (with iterator)
fun <T> MutableList<T>.myRemoveIf (filter: (T) -> Boolean) : Boolean {
    val iterator = this.iterator()
    var control = false
    while (iterator.hasNext())
        if (filter(iterator.next())) {
            iterator.remove()
            control = true
        }
    return control
}

//type algorithm of .single{} with generics
fun <T> List<T>.mySingle () {

}

//type algorithm of .count{} with generics

//type algorithm of .replaceAll{} with generics

//type algorithm of .forEach{} with generics

//type algorithm of .findLast{} with generics

//type algorithm of .distinctBy{} with generics

//type algorithm of .dropWhile{} with generics



