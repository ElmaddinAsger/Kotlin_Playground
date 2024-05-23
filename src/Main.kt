import java.util.*
val scanner = Scanner(System.`in`)

fun main () {
    //taskOne()

    //taskTwo()

    //taskThree()

    //taskFour()

    //taskFive()
}

// Ekrandan daxil edilmiş cut reqemlerin ededi ortasini tapin(While ile)
fun taskOne () {
    var sumOfEven = 0
    var countOfEven = 0

    print("Enter a non-zero number for start calculation: ")
    var input = scanner.nextInt()

    while (input != 0) {
        if (input % 2 == 0){
            sumOfEven += input
            countOfEven ++
        }
        println("Zero for Calculation & Oder for Continue")
        print("Enter a number: ")
        input = scanner.nextInt()
    }

    println(sumOfEven)
    println(countOfEven)
    println(sumOfEven.toDouble()/countOfEven)
}

//Ekrandan reqemlerinin sayi tek olan eded dahil edilir.
//Hemin ededin sag ve solunun beraber olub olmadigini yohlayin.
//Numune: 121 1=1 1234123 123=123
fun taskTwo () {

    print("Enter a number: ")

    val input = scanner.nextInt()
    var count = 0
    var number = input
    var leftSide = input


    while (number != 0) {
        count++
        number /= 10
    }

    val sizeOfSide = count/2
    var rightSide = 0.0

    for (i in 1..sizeOfSide){

        val lastElement = leftSide % 10
        rightSide = (rightSide + lastElement)/10
        leftSide /= 10
    }

    for (i in 1..sizeOfSide) {
        rightSide *= 10
    }

    if (leftSide/10 == rightSide.toInt())  println("left and right side of $input is equal.")
    else  println("left and right side of $input is NOT equal.")


}

//1-1000 kimi ededlerin 3 ve 8 bolunen ededleri nezere almayin(continue)
fun taskThree () {
    val firstInput = scanner.nextInt()
    val lastInput = scanner.nextInt()
    var sum = 0

    for (element in firstInput..lastInput){
        if (element % 3 == 0 && element % 8 == 0) {
            continue
        }
        sum += element
        println(element)
    }
    println(sum)

}

//1-1000 kimi ededlerin hasili reqemlerinin cemi 20 -den boyuk olan hali tapana kimi davam etsin(break)
fun taskFour () {

    print("Enter first element: ")
    val firstInput = scanner.nextInt()
    print("Enter last number: ")
    val lastInput = scanner.nextInt()
    print("Enter a number for comparison: ")
    val compElement = scanner.nextInt()

    var itemMult = 1

    outer@for (element in firstInput..lastInput) {

        if (element != 0) {

            itemMult *= element
            var controller = itemMult
            var sumOfDigits = 0
            inner@while (controller != 0) {

                sumOfDigits += ( controller % 10)
                controller /= 10

                if (sumOfDigits > compElement) {
                    println("${element-1}  ${itemMult/element}")
                    println("$element $itemMult")
                    break@outer
                }
            }
        }
    }
}

//1-1000 kimi ededlerin kvadratlari 600-den boyuk olduqda ilk hemin ededi versin(break)
fun taskFive () {

    print("Enter first number: ")
    val firstInput = scanner.nextInt()
    print("Enter lat number: ")
    val lastInput = scanner.nextInt()
    print("Enter a number for comparison: ")
    val compElement = scanner.nextInt()

    for (element in firstInput..lastInput) {
        if( (element*element) > compElement ) {
            println(element)
            break
        }
    }
}
