import java.time.Period

fun main () {

    //Task One

    val myListOne = listOf(3,5,12,16,23,15,24,17)
    println(myListOne.single { it % 3 == 0 && it % 5 == 0 })
    println(myListOne.mySingle {it % 3 == 0 && it % 5 == 0 })


    /* Task Two
    val myList = listOf(20,33,45,30,57,65,80,72)
    println(myList.findLast { it % 10 == 0 })
    println(myList.myFindLast { it % 10 == 0 }) */

    /* Task Three
     val customerOne = Customer("Jack",21,185)
    val customerTwo = Customer("Jhon",19,182)
    val customerThree = Customer("Dick",27,174)
    val customerFour = Customer("Melisa",23,165)

    val customers = listOf(customerOne,customerTwo,customerThree,customerFour)

    println( customers.count { it.age > 20 && it.height >170 && it.height < 190 })

    println(customers.myCount { it.age > 20 && it.height > 170 && it.height < 190 })*/

     //Task Four
    /* val personOne = Person(12,"Jack")

    val myListFour = listOf(
        personOne,
        Person(19,"George"),
        Person(84,"Orwell"),
        Person(12,"Tesla"),
        Person(84,"Saramago")
    )

    println(myListFour.distinctBy { it.id })
    println(myListFour.myDistinctBy { it.id }) */

    
    //Task Five

    val numbers = listOf(1, 2, 3, 4, 5, 6, 7, 8, 9)
    println(numbers.dropWhile { it % 2 == 0})
    println(numbers.myDropWhile { it % 2 == 0 })





}
//1.single funksiyasinin analoqunu yazmaq.Cagirilan hissede 5 ve 3 bölünen ededi tapmaq
fun List<Int>.mySingle (predicate: (Int) -> Boolean) : Int {
    var result = 0
    for (item in this)
        if (predicate(item)){
            result = item
            break
        }
    return  result
}



//Tast Two
//2.findlast funksiyasinin analoqunu yazmaq.
// Cagirilan hissede 10 bölünen ededlerin icinden en sonuncusunu tapm
fun List<Int>.myFindLast (predicate: (Int) -> Boolean) : Int {

    for (item in this.size-1 downTo 0)
        if (predicate(this[item]))
            return this[item]
    return 0
}

//Taslt Three
//3.count funksiyasinin analoqunu yazmaq.
// Customer(name,age,height) modeli olsun.
// List bu tipde olsun.Yasi 20-den boyuk boyu ise
// 170-den boyuk 190-dan kicik müşterinin sayini tapsın.
data class Customer (val name: String, val age: Int, val height: Int)

fun List<Customer>.myCount ( predicate: (Customer) -> Boolean) : Int {

    val resultList = mutableListOf<Customer>()

    for (item in this)
        if (predicate(item))
            resultList.add(item)
    return resultList.size
}


// Task Four
//4.distinctBy funksiyasinin analoqunu yazmaq.
//Person(id,name) modeli olsun.List bu tipde olsun.
//Cagirilan hissede name ore distinct etmek mümkün olsun.

data class Person (val id: Int, val name: String)

fun List<Person>.myDistinctBy (predicate: (Person) -> Any) : List<Person> {
    val mySet = mutableSetOf<Any>()
    val resultList = mutableListOf<Person>()

    for (item in this) {
        val controller = predicate(item)
        if (mySet.add(controller)) {
            resultList.add(item)
            mySet.add(controller)
        }
    }

    return resultList
}

//5.dropWhile funkasiyasinin analoqunu yazmak.Cagirilan hissede cut ededi silmek.

fun List<Int>.myDropWhile (predicate: (Int) -> Boolean) : List<Int> {
    val result = mutableListOf<Int>()

    for (item in this)
        if (!predicate(item))
            result.add(item)
    return result
}









