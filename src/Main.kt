import java.lang.reflect.Array
import java.util.*
import kotlin.contracts.contract
import kotlin.math.pow

fun main() {

    println( divisible(122,15,13,45,13,75,44,22,124,532).contentToString())

    val string = "Salam necesen"

    println(string.replace('a','e'))
    println(replace(string,'a','e'))



}

//Task One
//Stringin substring methodunu yazin ve en azi bir defe overloading edin.
// (hazir methoddan istifade edilmesin Substring methodunun algortimini yazin)

fun substring ( text: String, firstIndex: Int) : String {

    var result = ""

    for (index in firstIndex..<text.length) {
        result+=text[index]
    }

    return result
}

fun substring (text: String, firstIndex: Int, lastIndex: Int) : String {

    var result = ""

    for (index in firstIndex..<lastIndex) {
        result += text[index]
    }

    return result
}

//Task Two
//String-in drop methodunu yazin.
//(Hazir method-dan istifade olunmasin drop methodunun algoritmini yazin)
fun drop (text: String, index: Int) : String {
    var result = ""

    for (index in index..<text.length) {
        result += text[index]
    }

    return result
}

//Task Three
//String-in indexOf methodunu yazin.
//(Hazir methoddan istifade olunmasin indexOf methodunun algoritmini yazin)
fun indexOf (text: String, search: String, startIndex: Int = 0, ignoreCase: Boolean = false) : Int {

    var result = -1

    if (ignoreCase){
        //nezere alinmadi
    } else {
        var count = 0

        for (char in startIndex..<text.length) {

            if (text[char] == search[0+count]) {

                count++

                if (count == search.length) {
                    result = (char - (count-1))
                    break
                }

            }else {
                count = 0
            }
        }
    }
    return  result

}

//Task Four
//Stringin padStart ve padEnd methodunu yazin
//(Hazir methoddan istifade olunmasin padStart ve padEnd methodunun algoritmini yazin)
fun padStart (text: String, length: Int, padChar: Char = ' ') : String {

    var result = ""

    val extraSize = length - text.length

    for (i in 1..extraSize) {
        result += padChar
    }

    result+= text
    return result
}

fun padEnd (text: String, length: Int, padChar: Char = ' ') : String {

    var result = text
    val extraSize = length - text.length

    for (i in 1..extraSize) {
        result += padChar
    }

    return result
}

//Task Five
//Math.pow funksiyasinin methodunu yazin
fun pow (number: Double, n: Int) : Double {
    var result = 1.0

    if (n > 0) {

        for (i in 1..n) {

            result *= number

        }
    } else if ( n < 0) {

        for (i in n..-1) {

            result *= number
        }

        result = 1 / result
    }
    return result
}

//Task Six
//Massivin sortlasdirma algoritminin methodunu yazin
fun sort (myArray: kotlin.Array<Int>) : kotlin.Array<Int> {

    for (i in myArray.indices) {
        for (n in i+1..<myArray.size) {
            if (myArray[i] > myArray[n]) {
                val saver = myArray[i]
                myArray[i] = myArray[n]
                myArray[n] = saver
            }
        }
    }
    return myArray
}

//Task Seven
//Verilmsh ededin polindrom olub olmadigini yoxlayan metod yazin
// ve eger polyndromdursa true eks halda false qaytarsin
fun polyndrom (n: Int) : Boolean {

    var controlFromRight = 0
    var controlFormLeft = n

    while (controlFormLeft > 0) {
        controlFromRight = controlFromRight*10 + controlFormLeft%10
        controlFormLeft /= 10
    }

    return n == controlFromRight
}

//Task Eight
//Verilmish ededin unique eded olub olmadigini tapan method yazin
//ve geriye deyer qaytarmasin neticeni method icinde cixartsin
fun unique (n: Int) {

    val string = n.toString()
    var control = true
    outer@for (firstIndex in string.indices){
        inner@for (secondIndex in firstIndex+1..<string.length) {
            if (string[firstIndex]==string[secondIndex]){
                control = false
                break@outer
            }
        }
    }
    println(if(control)  "$n is Unique" else  "$n isn't Unique")
}

//Task Nine
//Method istenilen sayda argument qebul edir
//ve bu ededlerden hem 3 ve 5 bolunen ededleri geri qaytaran metod yazin
//Ededler bir-bir qayitmali deyil
fun divisible (vararg numbers: Int) : kotlin.Array<Int> {

    val firstArray = Array(numbers.size){0}
    var size = 0

    for (i in numbers) {
        if (i % 3 == 0 && i % 5 == 0){

            firstArray[size] = i
            size++
        }
    }

    val lastArray = Array(size){
        firstArray[it]
    }
    return lastArray
}

//Task Ten
//String replace methodunu yazin
fun replace (text: String, oldChar: Char, newChar: Char) : String {

    var newText = ""
    for (i in text){
        if (i == oldChar){
            newText += newChar
        }else {
            newText += i
        }
    }

    return newText
}






//String replace yoxladim tam alinmadi sonraya saxladim
/* fun replace (text: String,oldStrig: String, newString: String) : String {

    var newText = ""
    var count = 0
    var startingPoint = Array (text.length/oldStrig.length) {-1}
    var index = 0

    for (char in 0..<text.length) {

        if (text[char] == oldStrig[0+count]) {

            count++

            if (count == oldStrig.length) {
                startingPoint[index] = (char - (count-1))
                count = 0
                index++
            }

        }else {
            count = 0
        }
    }

    index = 0
    count = 0

    for (i in text.indices) {

        if (i == startingPoint[index]) {
            for (n in i..<oldStrig.length) {
                newText += newString[count]
                count++
            }
        }else {
            count = 0
            for (n in i..<startingPoint[index]) {
                newText += text[n]
            }
        }
    }


    return newText
} */