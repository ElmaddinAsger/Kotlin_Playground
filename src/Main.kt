import javax.sql.rowset.Predicate

fun main () {

    val restricts = mutableListOf(12,18,36,25,40,65,36)

    println(restricts.myDropWhile { it % 2 ==0  })

    val names = listOf("Alice", "Bob", "Charlie", "David", "Eva", "Eleanor")
    val distinctInitials = names.distinctBy { it.first() }
    println(distinctInitials)

    //val people = listOf(
     //   Person(1, "Alice"),
     //   Person(2, "Bob"),
     //   Person(3, "Alice"),
    //    Person(4, "Charlie")
    //)
    //val distinctNames = people.distinctBy { it.name }
    //println(distinctNames)


    //println( restricts.myFindLast { it < 40 })

    //restricts.myReplaceAll { if (it >25) 5 else it}
    //println(restricts)

    //println(restricts.myCount { it % 5 == 0 })

    //println(restricts.single{it == 18})
    //println(restricts.mySingle { it % 2 == 0 })

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
data class Person(val id: Int, val name: String)

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
fun <T> List<T>.mySingle (predicate: (T) -> Boolean) : T {

    var count = 0
    var element : T? = null

    for (item in this)
        if (predicate(item)) {
            element = item
            count++
        }
    if (count == 1 && element != null) return element
    return this[this.size]
}

//type algorithm of .count{} with generics
fun <T> MutableList<T>.myCount (predicate: (T) -> Boolean): Int {

    var count = 0
    for (item in this)
        if (predicate(item))
            count++
    return count
}

//type algorithm of .replaceAll{} with generics
fun <T> MutableList<T>.myReplaceAll (predicate: (T) -> T) {

    for ((index,element) in this.withIndex())
        this[index] = predicate(element)
}

//type algorithm of .forEach{} with generics
fun <T> MutableList<T>.myForEach (action: (T) -> Unit) {
    for (element in this) {
        action(element)
    }
}

//type algorithm of .findLast{} with generics
fun <T> MutableList<T>.myFindLast ( predicate: (T) -> Boolean) : T {

    for (index in this.size -1 downTo 0)
        if (predicate(this[index]))
            return this[index]
    return this[this.size]
}

//type algorithm of .distinctBy{} with generics
fun <T,K> MutableList<T>.myDistinctBy (selector: (T) -> K) : List<T> {
    val keys = mutableSetOf<K>()
    val myList = mutableListOf<T>()

    for (item in this)
        if(keys.add(selector(item)))
            myList.add(item)
    return myList
}

//type algorithm of .dropWhile{} with generics
fun <T> MutableList<T>.myDropWhile(predicate: (T) -> Boolean) : List<T>{
    val result = mutableListOf<T>()

    for (outerIndex in this.indices)
        if (!predicate(this[outerIndex])) {
            for (innerIndex in outerIndex..<this.size)
                result.add(this[innerIndex])
        break
        }

    return result
}




