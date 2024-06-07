

fun main () {

    val string = Text("This is a test text.")
   println( string.lenght)
    println(string.substring(12,18))

    println(string.lastIndexOf("tes"))

    val myLsit = mutableListOf( "byyyy","bbaa","azzz")
    val listMy = Collection("byyyy","bbaa","azzz")
    listMy.sort()
    println(listMy.myList)
    println(myLsit[0]<myLsit[1])


    myLsit.sort()
    println(myLsit)

    val text = "asasasa"


    val myList4 = listOf(12,4589,34,555,66,78,13)
    println(taskTwo(myList4))





}




//1.String kimi bir class yaratmaq ve constructorda metni qebul eder.
// Hemcinin bunu length kimi propertisi olur hemin texte uygun onun uzunluğu saxliyir.
// Substringin iki overload olunmuş metodu ve
//lastIndexofun iki overload olunmuş metodu olsun.
// Her birini main classinda cagirib istifade edin.
class Text (val text : String) {

    //count() ve lenght
    fun count (string: String = text) : Int {
        var size = 0
        for (i in string){
            size++
        }
        return size
    }
    val lenght = count()

    //substring
    fun substring (range: IntRange) : String {

        var result = ""
        if ( range.last < lenght )
            for (i in range.first..<range.last) {
                result+=text[i]
            }

        return result
    }

    fun substring(startIndex: Int) : String {

        var result = ""

        if (startIndex < lenght)
            for (i in startIndex..<lenght){
                result += text[i]
            }
        return result
    }

    fun substring (startIndex: Int, lastIndex: Int) : String{
        var result =""

        if (lastIndex in (startIndex + 1)..<lenght){
            for (i in startIndex..<lastIndex){
                result += text[i]
            }
        }

        return result
    }

    //lastIndexOf
    fun lastIndexOf (char: Char) : Int{
        var result = 0

        for (i in lenght-1 downTo 0){
            if (text[i]==char){
                result = i
            }
        }

        return result
    }

    fun lastIndexOf (string: String) : Int {
        var result = 0

        var count = 0
        var searchPoint = string.length-1
        outer@for (indexText in lenght-1 downTo 0){
            innder@for (indexSearch in searchPoint downTo 0 ){
                if (string[indexSearch] == text[indexText]){
                    count++
                    searchPoint = indexSearch - 1
                    if (count == string.length){
                        result = indexText
                        break@outer
                    }
                    break@innder
                } else {
                    count = 0
                    searchPoint = string.length -1
                    break@innder
                }
            }
        }

        return result
    }

}

//2.List classiniz olsun ve bu vararak ile string tipinde kıymetler qebul etsin.
// Bu classin icinde bir list sağlayın ve constructor metod cagirilan zaman
// bunu o liste ilave edin ve burada size propertisi olsun.
// Bu listin add funksiyasi ve remove funksiyasi olsun.liste elave etnikde
// ve sildikde size propertisi artmalı ve ya azalmalidi ve elave olaraq bunun sort funksiyasi olsun.
class Collection (vararg input: String) {
    var size = input.size
    var myList = mutableListOf<String>()
    init {
        myList.addAll(input)
    }
    fun add (element: String) {
        myList.add(element)
        size++
    }

    fun remove (elmement: String) : Boolean{
        return myList.remove(elmement)
        size--
    }

    fun sort () {
        for (indexFirst in myList.indices){
            for (indexSecond in indexFirst+1..<size){
                if (myList[indexFirst]>myList[indexSecond]){
                    val result = myList[indexFirst]
                    myList[indexFirst] = myList [indexSecond]
                    myList [indexSecond] = result
                }
            }
        }
    }
}


//3.3.8 olculu mapListi verilb ve bu listde Key olarak studentId ve onun qiymeti saxlanilir
//Hemin listi kıymete uygun olarak artan sirada nizamlayın
//4.8 olculu string listi verilir,Hemin mentrleri birinci harflerine gore elifba sırası ile duzun.

//1.8 olculu list verilir.Sade ededlerin cemini tapan

//2.8 olculu list verilir.Elementin reqemlerinin cemi 10-dan boyuk olan ededlerin ededi ortasını tepin
fun taskTwo (inputList: List<Int>) : Int {

    var sum = 0
    var count = 0

    for (element in inputList){
        var digitSum = 0
        var number = element
        while (number>0){
            digitSum += number % 10
            number /= 10
        }
        if (digitSum > 10 ){
            //println(element)
            sum += element
            count++
        }
    }

    return sum / count

}




