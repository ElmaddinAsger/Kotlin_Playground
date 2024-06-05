fun main () {
    //val myList1 = listOf(10,12,11,10,8,4,21,8)
    //println( cloneControl(myList).toString())

    //val myList2 = listOf(111,2221,332,567,778,321,232 )
   // println(removeUnical(myList))

    //val myLsit5 = listOf(10,20,30,10,20,30,40,10,20)
    //println(cloneSum(myLsit5))



}


//3.8 olculu mapListi verilb ve bu listde Key olarak studentId ve onun qiymeti saxlanilir
//Hemin listi kıymete uygun olarak artan sirada nizamlayın
//4.8 olculu setListi verilib ve bu listde 2 ve 8 bölünen ededlerin cemini tapan
//Hair funksiyalardan istifade etmeyin

//task One
//1.8 olculu list verilir.Hemin listde duplicate olan elementleri silmek
//Numune:1,2,3,5,7,3,2 Netice 1,5,7
fun cloneControl (inputList: List <Int>) : List <Int> {
    val myList = mutableListOf<Int>()
    val controller = mutableSetOf<Int>()

    for (i in inputList) {
        controller.add(i)
    }
    for (i in controller) {
        myList.add(i)
    }

    return myList
}

//2.8 olculu list verilir.Hemin liste unikal ededleri listden silmek.
//Numune:111,2221,332,567,778,321,232 Netice 567,321
fun removeUnical (inputList: List<Int>) : List<Int> {

   val myList = mutableListOf<Int>()

    for (i in inputList){
        val string = i.toString()
        var control = true

        outer@for (index in string.indices) {
            inner@for (indexTwo in index+1..<string.length){
                if (string[index] == string[indexTwo]){
                    control = false
                    break@outer
                }
            }
        }

        if (!control) //unical reqemleri silinmis hal
            myList.add(i)

        /*if (control) //unical reqemleri saxlanmis hal
            myList.add(i) */
    }
    return myList
}

//5.8 olculu list verilir ve bu listde tekrar olan ededlerin cemini tapan
//10,20,30,10,20,30,40,10,20  Netice:10+20+30=60
fun cloneSum (inputList: List<Int>) : Int {

    var sum = 0

    for (index in inputList.indices) {
        var count = 0

        for (indexNext in index+1..<inputList.size) {
            if (inputList[index] == inputList[indexNext]) count++
        }
        if (count == 1) sum += inputList[index]
    }

    return sum
}