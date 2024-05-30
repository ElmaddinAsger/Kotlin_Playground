fun main () {
    println(taskOne(50))
}

//1.Faktoriali hesablayan rekursiv funksiya yazin
fun taskOne (mult: Int) : Long {
    return if (mult == 1) mult.toLong() else mult * taskOne(mult - 1)
}

//2.1-100 kimi ededlerin cemini hesablayan rekursiv funksiya yazin
fun taskTwo (sum: Int) : Int {
    return if (sum == 1) sum else sum + taskTwo(sum-1)
}

//3.1-99999 kimi ededlerin cemini hesablayan tail rekursiv funksiya yazin
tailrec fun taskThree (num: Long, sum: Long) : Long {
    return if (num == 1L) sum else taskThree(num-1,num+sum)
}