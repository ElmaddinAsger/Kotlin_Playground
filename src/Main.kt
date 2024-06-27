import kotlin.Array

fun main () {
   val myString = "0123456789"
    println(myString.replace('1','3'))
    println(myString)
    val myString2 = MyString("0123456789")
    println(myString2.replace('0','2').text)
    println(myString2.text)

    println(Math.pow(4.0,2.0))
    println(MyMath().pow(4.0,2.0))

    val myArray = arrayOf(10,20,330,40)
    myArray.sort()
    println(myArray.contentToString())

    val myArray3 = arrayOf(-22,-54,15,10,330,20,330,40)

    println(myArray3.max())

    val myArray2 = MyArray(myArray3)
    println(myArray2.max())
    myArray2.sort()
    println(myArray2.inputArray.contentToString())

    val mutList = mutableListOf(-22,-54,15,10,330,20,330,40)
    //println(mutList.set(3,32))
    //println(mutList)
    //println( mutList.remove(330))
    //println(mutList)

    val myMutableList = MyMutableList(mutList)
    println(myMutableList.size)
    println( myMutableList.remove(12))
    println(myMutableList.inputList)
    println(myMutableList.size)

}

// 1.Inheritance aid 3 numune yazmaa ve her numunede en azı 3 class olmalıdır
/* abstract class Languages {

    abstract  val nativeSpeaker : Int

    abstract val learned : Int

    abstract val learningTime : Double

    abstract val location : String

    abstract fun forWhom ()

    fun population(nativeSpeaker: Int, learned: Int): Int {
        return nativeSpeaker + learned
    }

    abstract fun learnability ()

}

abstract class SpokenLang : Languages () {

    override fun forWhom() {
        println("For those who are not hearing or speech impaired.")
    }
}

abstract class SignLang : Languages () {
    override fun forWhom() {
        println("For those with hearing and speech impairments.")
    }
}

class Afroasiatic(override val nativeSpeaker: Int,
                  override val learned: Int,
                  override val location: String,
                  override val learningTime: Double ) : SpokenLang () {

    override fun learnability() {
        println("Learnability: Hard")
    }
}

class Turkic(
                override val nativeSpeaker: Int,
                override val learned: Int,
                override val learningTime: Double,
                override val location: String ) : SpokenLang() {
    override fun learnability() {
        println("Learnability: Easy")
    }
}

class IndoEuropean(
                        override val nativeSpeaker: Int,
                        override val learned: Int,
                        override val learningTime: Double,
                        override val location: String) : SpokenLang() {
    override fun learnability() {
        println("Learnability: Medium")
    }

}

class FrenchSign(
                        override val nativeSpeaker: Int,
                        override val learned: Int,
                        override val learningTime: Double,
                        override val location: String) : SignLang () {
    override fun learnability() {
        println("Learnability: Medium")
    }
}

class BritishSign(
                        override val nativeSpeaker: Int,
                        override val learned: Int,
                        override val learningTime: Double,
                        override val location: String) : SignLang () {
    override fun learnability() {
        println("Learnability: Hard")
    }
}

class ArabSign(
                    override val nativeSpeaker: Int,
                    override val learned: Int,
                    override val learningTime: Double,
                    override val location: String) : SignLang() {
    override fun learnability() {
        println("Learnability: Hard")
    }

}

abstract class Marketplace () {
    abstract val size : Int
    abstract val location: String
    abstract val openingTime : String
    abstract val closingTime : String

    abstract fun workingType ()
    abstract fun workingHour (openingTime : String, closingTime : String )
    abstract fun products ()
}

class Pharmacy(
    override val size: Int,
    override val location: String,
    override val openingTime: String,
    override val closingTime: String
) : Marketplace() {
    override fun workingType() {
        println("7/24")
    }

    override fun workingHour(openingTime: String, closingTime: String) {
        println("Working hours: Everytime")
    }

    override fun products() {
        println("Drugs and medical products")
    }

}

class DressShop(
    override val size: Int,
    override val location: String,
    override val openingTime: String,
    override val closingTime: String
) : Marketplace() {
    override fun workingType() {
        println("Full-time")
    }

    override fun workingHour(openingTime: String, closingTime: String) {
        println("Working hours: open: $openingTime close: $closingTime")
    }

    override fun products() {
        println("Clothes and accessory ")
    }
}

class VapeShop(
    override val size: Int,
    override val location: String,
    override val openingTime: String,
    override val closingTime: String
) : Marketplace () {
    override fun workingType() {
        println("Part-time")
    }

    override fun workingHour(openingTime: String, closingTime: String) {
        println("Working hours: open: $openingTime close: $closingTime")
    }

    override fun products() {
        println("Vape and accessory ")
    }

} */

//2.String classi yarding ve bu metodlar string classinin dahilinde olmalıdi.
// Adini String qoymuya bilersiz cunki String class var.
// Meqsed stringe aid olan funksiyalari bir yere yigmaqdi.
// Hemcinin constructor metod ile edin.
// Yeni hangi metniki substring etmek isteyirsiniz onu constructor vasitesi ile gönderin.
// Substring sadece o metni kesmekle meşgul olsun yeni metnin ozun qebul etmesin.
// Hemcinin burda length propertiside olsun metnin uzunluğunu versin.Bu constructorda olmalı değil
//1.Stringin substring metodunu yazın və ən azı bir dəfə overloading edin.
//2.Stringin indexof metodunu yazan.
//3.String replace metodunu yazın.
class MyString (val text: String) {
    var length = 0

    init {
        for (i in text)
            length++
    }

    fun substring (range: IntRange) : MyString {
        var result = ""

            for (i in range)
                result += text[i]
        return MyString(result)
    }


    fun substring (startIndex: Int) : MyString {
        var result = ""

            for (i in startIndex..<length)
                result += text[i]
        return MyString(result)
    }

    fun substring (startIndex: Int, endIndex: Int) : MyString {
        var result = ""

        if (endIndex<=length)
            for (i in startIndex..<endIndex)
                result += text[i]
        return MyString(result)
    }

    fun indexOf (char: Char, startIndex: Int = 0) : Int {
        var result = -1
        for (i in startIndex..<length)
            if (char == text[i]) {
                result = i;
                break
            }
        return result
    }

    fun indexOf(string: String, startIndex: Int = 0) : Int {

        var result = -1
        var controller = 0
        var startPoint = 0

       outher@ for (textIndex in startIndex..<length)
            for (stringIndex in startPoint..<string.length )
                if ( string[stringIndex] == text[textIndex]){
                    controller++
                    if (controller == 1) result = textIndex
                    if (string.length == controller) return result
                    startPoint++
                    continue@outher
                } else {
                    controller = 0
                    startPoint = 0
                }
        return -1

    }

    fun replace (oldValue: String, newValue: String) : MyString {

    val startIndex = indexOf(oldValue)
    var result = ""
    if (startIndex != -1) {
        for (i in 0..<startIndex)
            result += text[i]
        for (i in 0..<newValue.length)
            result += newValue[i]
        for (i in (startIndex+newValue.length)..<length)
            result += text[i]
    }

    return MyString(result)
}

    fun replace (oldChar: Char, newChar: Char) : MyString {

        val startIndex = indexOf(oldChar)
        var result = ""
        if (startIndex != -1) {
            for (i in 0..<startIndex)
                result += text[i]

            result += newChar

            for (i in startIndex+1..<length)
                result += text[i]
        }

        return MyString(result)
    }

}

//3.-----------------Math classi olsun.Eyni ile yukarıdaki kimi edin.
// Ancaq deyer constructorda yox ele funksiyanin ozunde olsun-------------------
//5.Math.pow funksiyasinin metodunu yazın.Eger overloading varsa overloading edin.
class MyMath {
    fun pow (a: Double, b: Double) : Double {
            var result = 1.0

            if (b > 0) {

                for (i in 1..b.toInt()) {

                    result *= a

                }
            } else if ( b < 0) {

                for (i in b.toInt()..-1) {

                    result *= a
                }

                result = 1 / result
            }
            return result

    }
}

//4.--------------------Array classi olsun ve constructor parameter olaraq array qebul etsin.
// Onun length propertisi olsun.
//6.Massivin sortalasdirma alqoritminin metodunu yazın
//7.Massivin max elementini tapan funksiya olsun
class MyArray (val inputArray: Array<Int>){
   var size = 0
    init {
       for (i in inputArray)
           size++
    }

    fun sort (){

        val firstIndex = 0
        val lastIndex = size-1
        quickSort(inputArray,firstIndex,lastIndex)


    }

    private fun quickSort (list: Array<Int>, first: Int, last: Int) {

        if (first < last){
            val pi = partition(list,first,last)
            quickSort(list,first,pi-1)
            quickSort(list,pi+1,last)
        }
    }

    private fun partition (list: Array<Int>, first: Int, last: Int): Int {
        val pivot = list[last]
        var i = first-1

        for (index in first..last)
            if (list[index] < pivot){
                i++
                val temp = list[i]
                list[i] = list[index]
                list[index] = temp
            }

        val temp = list[i+1]
        list[i+1] = list[last]
        list[last] = temp
        return i+1

    }

    fun max () : Int {
        var max = -1
        for (i in inputArray)
            if (max < i)
                max = i
        return max

    }

}


//5.--------------------Lisr classi olsun ve
// constructor parameter olaraq list(mutableListOf) qebul etsin. +
// Onun size propertisi olsun. +
//6.Add metodu olsun.Bu hemin liste ilave etsin eleve etdikde sizenin olcusu artmalidi
//7.update metodu olsun.Bu hemin listeden elementi silsin.Ve sizeni azaltsın
//8.Get metodu olsun verilmiş indexe uygun vatani kaytarsın
//9.Set metodu olsun verilmiş elementi hemin index uygun deyişsin.

class MyMutableList (val inputList: MutableList<Int>) {
    var size = 0

    init {
        for (i in inputList)
            size++
    }

    fun add (element: Int) : Boolean{
        size++
        return inputList.add(element)
    }
    fun add (index: Int, element: Int) {
        inputList.add(index,element)
        size++
    }
    fun remove (element: Int) : Boolean {
        if (inputList.remove(element)){
            size--
            return true
        }

        return false
    }
    fun get (index: Int) : Int {
        return inputList[index]
    }
    fun set (index: Int,element: Int) : Int {
        val oldElement = inputList[index]
        inputList[index] = element
        return oldElement
    }
}