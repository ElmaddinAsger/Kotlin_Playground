import javax.sql.rowset.Predicate

fun main () {

    val myList = mutableListOf(10,12,15,24,22,17,54,68,32,19,29)

    //myList.replaceAll { 5 }
    //println(myList)
    //myList.myReplaceAll {12}
    //println(myList)
    //myList.myReplaceAll(12)
    //println(myList)

    //myList.myForEach{ println(it * 5 )}
    //myList.forEach {println( it * 5 )}

    myList.removeIf { it < 15 }
    println(myList)
    myList.myRemoveIf { it > 35 }
    println(myList)
}





//ReplaceAll metodunun anoloqunu yazmaq
/*fun MutableList<Int>.myReplaceAll (item: Int) {

    for (index in this.indices)
        this[index] = item
} */

fun MutableList<Int>.myReplaceAll (operator: (Int) -> Int) {

    for (index in this.indices)
        this[index] = operator(this[index])
}

//ForEach metodunun anoloqunu yazmaq
fun List<Int>.myForEach (predicate: (Int) -> Unit) {
    for (item in this)
        predicate(item)

}

//RemoveIf metodunun anoloqunu yazmaq
fun MutableList<Int>.myRemoveIf(filter: (Int) -> Boolean){

    val mylist = mutableListOf<Int>()
    for (i in this){
        mylist.add(i)
    }


    for (item in mylist){
        if (filter(item)) {
           this.removeAt(indexOf(item))

        }
    }
}

