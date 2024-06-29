fun main () {
    val myList = mutableListOf<Int>(3,1,75,32)

    //println( myList.myFind { it < -30 })

    //println(myList.myFindLast { it < -50 })

    //println(myList.myRemoveFirstOrNull())

    //println(myList.myFirstOrNull{ it > 5})

    println(myList.maxOrNull())



}

//1.Type a analog of .find function
fun <T> Iterable<T>.myFind (predicate: (T) -> Boolean) : T? {

    for (element in this)
        if (predicate(element))
            return element
    return null

}

//2. .findLast type a analog
fun <T> Iterable<T>.myFindLast (predicate: (T) -> Boolean) : T? {

    for (index in this.count() - 1 downTo 0)
        if (predicate(this.elementAt(index)))
            return this.elementAt(index)
    return null
}

//3.removeFirstorNull
fun <T> MutableList<T>.myRemoveFirstOrNull () : T? {

    if (isEmpty())
        return null
    else
        return this.removeAt(0)

}

//4.FirstOrNull
fun <T> List<T>.myFirstOrNull () : T? {

    if (isEmpty()) return null
    else return this.first()
}

fun <T> List<T>.myFirstOrNull (predicate: (T) -> Boolean) : T? {
    if (isNotEmpty())
        for (element in this)
            if (predicate(element))
                return element
    return null
}

//5.maxByOrNull
fun <T : Comparable<T>> Iterable<T>.maxOrNull(): T? {
    val iterator = iterator()
    if (!iterator.hasNext()) return null
    var max = iterator.next()
    while (iterator.hasNext()) {
        val e = iterator.next()
        if (max < e) max = e
    }
    return max
}