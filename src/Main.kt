import java.util.*

fun main () {

    taskOne()

    //taskTwo()

    //taskThree()

    //taskFour()

    //taskFive()

   // taskSix()
}

//100-1000 araliginda butun reqemleri tekrar olan ededlerin ededi ortasini tapin.
// Numune:111,222 111+222/2 2 burda el ile yazilmasin bu 4,5,6 reqemler ucunde odensin
fun taskOne () {
    print("First object: ")
    val firstObject = Scanner(System.`in`).nextInt()
    print("Last object: ")
    val lastObject = Scanner(System.`in`).nextInt()

    var count = 0
    var sum = 0

    for (element in firstObject..lastObject) {
        val text = element.toString()
        var controller = true
        val indexOne = text[0]
            for (index2 in 1 ..<text.length) {
                if (indexOne != text[index2]) {
                    controller = false
                }
            }

        if (controller && text.length >= 2) {
            println(element)
            count++
            sum += element
        }
    }
    println(sum.toDouble() / count)
}



//100-1000 araliginda butun sade ve murekkeb ededlerin sayini tapan proqram yazin. Her ikisinin sayini
fun taskTwo () {

        print("Enter first element: ")
        val firstElement = Scanner(System.`in`).nextInt()
        print("Enter last element:")
        val lastElement = Scanner(System.`in`).nextInt()

        var primeNumbers = 0
        var compositeNumbers = 0

        for (item in firstElement..lastElement){

            var control = true

            for (item1 in 2..<item) {
                if (item%item1 == 0){
                    control = false
                    break
                }
            }

            if (item != 0 && item != 1)
                when(control) {
                    true -> primeNumbers++
                    else -> compositeNumbers++
                }
        }

    println(primeNumbers)
    println(compositeNumbers)
}


//100-1000 araliginda reqemlerinin cemi 10-dan boyuk olan ededlerin ededi ortasini tapin.Numune 945=17(true) 123=6(false)
fun taskThree () {

    print("First Element: ")
    val firstElement = Scanner(System.`in`).nextInt()
    print("Last Element: ")
    val lastElement = Scanner(System.`in`).nextInt()

    var sumOfElements = 0
    var count = 0
    for (element in firstElement..lastElement) {
        val text = element.toString()

        var sumOfItems = 0

        for (item in text) {
            sumOfItems += item.toString().toInt()
        }

        if (sumOfItems > 10) {

            println(element)
            sumOfElements += element
            count++


        }
    }
    println("Average of elements: ${sumOfElements.toDouble()/count}")
}

//100-1000 araliginda ededin tersi cut olan ededlerin cemini tapin. 123=321(false) 442=244(true)
fun taskFour () {
    print("First Element: ")
    val firstElement = Scanner(System.`in`).nextInt()
    print("Last Element: ")
    val lastElement = Scanner (System.`in`).nextInt()

    var sumOfElements = 0

    for (element in firstElement..lastElement){
        val text = element.toString()

        if (text[0].toString().toInt() % 2 == 0) {
            println(element)
            sumOfElements += element
        }
    }

    println(sumOfElements)
}

//10 olculu massiv verilmisdir massivde duplikat olan ededlerin cemini tapin.
// Numune 10 20 10 40 50 20 70 70 70 -5  Result:10+20+70=100
fun taskFive () {
    print("Enter size of Array: ")
    val size = Scanner(System.`in`).nextInt()
    val myArray = Array (size) {
        print("Enter ${it+1}th element: ")
        Scanner(System.`in`).nextInt()
    }
    println(myArray.contentToString())
    var result = 0

    for (index in myArray.indices) {

        var count = 0

        for (indexTwo in index+1..<myArray.size) {
            if (myArray[index] == myArray[indexTwo]) {
                count++
            }
        }
        if (count == 1){
            print("${myArray[index]} ")
            result+= myArray[index]
        }
    }
    println("= $result")
}

//10 olculu massiv verilmisdir ikinci en boyuk elementi tapin
fun taskSix() {
    print("Size of Array: ")
    val size = Scanner(System.`in`).nextInt()
    val myArray = Array(size){
        print("Enter ${it+1}th element: ")
        Scanner(System.`in`).nextInt()
    }
    println(myArray.contentToString())

    var firstMax = myArray[0]
    var secondMax = myArray[0]
    for (element in myArray) {
        if (firstMax < element ) {
            firstMax = element
        }
    }
    println(firstMax)

    for (element in myArray) {
        if (element in (secondMax + 1)..<firstMax) {
            secondMax = element
        }
    }
    println(secondMax)
}