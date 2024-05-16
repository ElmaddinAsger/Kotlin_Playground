import java.util.Scanner

fun main() {

    //taskOne()

    //taskThree()

    //taskFour()

    //taskFive()

    //taskSix()

    taskSeven()

}

//6 olculu int tipinde massiv verilib.Bu massive ededler ekrandan daxil edilir.Bu massivin elemenlerinin ededi ortasini tapin.
//5.//6.1-100 kimi ededlerin icinden hem 3 hemde 9 bolunen ededlerin cemini cixardin
//7."Bugun  28.03.2023 tarixinde 27 qeza bas vermisdir" cumlesinde ededlerin cemini tapın(Dovr ile)
//8.1-100 kimi ededlerin icinden sade ededlerin cemini tapin
//9.1-100 kimi ededlerin icinden murekkeb ededlerin cemini tapin
//10.1-100 kimi ededlerin icinden hem 3 ve ya 8 bolunen ededlerin cemini tapin.
//11.

//6 olculu int tipinde massiv verilib.
// Bu massive ededler ekrandan daxil edilir.
// Bu massivin min elementini tapin.
fun taskOne () {

    print ("Enter the size of Array: ")
    val size = Scanner(System.`in`).nextInt()

    val myArray = Array (size) {
        print("Enter the ${it+1}-th element")
        Scanner(System.`in`).nextInt()
    }

    println(myArray.contentToString())

    //qəbul edirəm ki 0-cı element ən kiçik element olacaq.
    // (bu belə olada biıər olmayada bilər aşağəda bunu yoxlayacayıq.)
    var min = myArray[0]
    //For vasitəsi ilə bütün arrayın bütün elementlərini tək tək alır
    for (item in myArray){
        // hər dövrdə əlimizə gələn bu elementin  bizim təyin etdiyimiz min-dən kiçik olub olmadığını yoxlayırıq.
        if (min > item) {
            //əgər ki kiçik olsa min variablemizin yeni dəyəri olaraq bunu təyin edirik.
            min = item
            // tərsi ən böyük dəyəri tapmaq istədiyimiz zaman isə if daxilində bizə gələn elementdən kiçik olub olmadığını yoxlayacayıq.

        }
    }
    println(min)

}

//6 olculu int tipinde massiv verilib.
// Bu massive ededler ekrandan daxil edilir.
// Bu massivin max elementini tapin.
fun taskTwo () {

    print("Enter the size of Array: ")
    val size = Scanner(System.`in`).nextInt()
    val myArray = Array (size) {
        print("Enter the ${it+1}-th element: ")
        Scanner(System.`in`).nextInt()
    }

    var max = myArray[0]

    for (item in myArray) {
        if (max < item) {
            max = item

        }
    }
    println(max)
}

//100-1000 kimi ededlerin icinden unikal ededleri ekrana cixardin.
// Numune 123,653 reqemler tekrarlanmir
fun taskThree () {
    //sərhədləri (üst və alt sərhəddi) istifadəçidən alaq
    print("first element: ")
    val firstElement = Scanner(System.`in`).nextInt()
    print("Enter last element: ")
    val lastElement = Scanner(System.`in`).nextInt()

    //for vasitəsi ilə sərhədlər arasında dövr edək
    for (element in firstElement..lastElement) {

        //dövrlərdən aldığımız elementləri hər dövrdə string edək
        // (Strign bir array olduğu üçün hədlərinə index ilə əlçatan edə bilərik)
        val text = element.toString()
        //bir elementə nəzarət üçün control variablesi yaradaq və default olaraq bir dəyər verək
        // ən sonda əgər ki bu string array indexlərindən biri təkrarlanarsa bu zaman bu defaulte dəyəri əksi ilə əvəz edərik (false) edrik
        // ki bu dəyər əksi ilə əvəz olnamazsa sonda hazırda element variablesinin saxladığı stringə çevirdiyimiz varibale demək ki UNİKALDIR
        var control = true
        //Hər dövrdə aldığımız elementin hədlərinin for vasitəsi ilə indexini alaq
        for (firsIndex in text.indices) {
            //aldığımız indexdən sonrakı (özü özü ilə müqaisə etməsin deyə) və uzunluqdan bir kiçik (uzunluq son  intexdən bir böyük olur)
            //indexlər arasında qalan elementləri for ilə dönək
            for (secondindex  in firsIndex+1..<text.length){
                //hazırda əlimizdə olan index ilə müqaisə edək
                if (text[firsIndex] == text[secondindex]) {
                    //if daxilinə girərsə deməli hədlərin biri öncəki fordan aldığımız ilk həd ilə bənzərdir və bu ədəd bizə lazım deyil.
                    control = false
                    //burada əgər funksiya bura giribsə digər hədləri yoxlamağa ehtiyac yoxdur çünki
                   // bu həddə bərabərlik var buna görə də break deyə bilərik
                    break
                }
            }

        }
        //bütün bunlardan sonra əgər ki control hələdə true qalıbsa demək if aktiv olmayıb Demək bu ədəddə təkrar rəqəm yoxdur
        //deməli bu ədəd unikaldır
        if (control) {
            println(text)
        }

    }

}

//Verilmis aralıqda bütün hedleri eyni olan ededleri ekrana yazdirin
fun taskFour () {

    print("Enter first element: ")
    val firstElement = Scanner(System.`in`).nextInt()
    print("Enter last elemnet: ")
    val lastElement = Scanner( System.`in`).nextInt()

    for (item in firstElement..lastElement) {
        val text = item.toString()
            //burada da eynilə biraz öncəki kimi bir dəyişən tyin edilir
            //lakin bu dəfə count olaraq verilir və bu dəfə ilkin dəyər olaraq 0 int dəyəri verilir
        var count = 0

        for (firstIndex in text.indices) {
            for (secondIndex in firstIndex+1..<text.length) {
                //burada hər dəfə hədlərin birinin digəri ilə bərabər olma şərti yoxlanır və əgər ki bir həd digəri ilə bərabər olarsa
                //if aktiv olur və count bir artır
                if (text[firstIndex] == text[secondIndex]){
                    count++
                }
            }
        }
        //nəticədə əgər ki yuxarıdakı if countun ölçüsü qədər aktiv olarsa
        //yəni bütün elementlər bir birinə bərabər olarsa bu if işə düşür və item ekrana yazdırılır
        if (count == text.length) {
            println(item)
        }
    }
}

//100-1000 kimi ededlerin icinden polindrom ededler ekrana cixardin:Numune 121,242,111 soldan ve sagdan eyni cur oxunur
fun taskFive () {

    print("first element: ")
    val firstElement = Scanner(System.`in`).nextInt()
    print("last element: ")
    val lastElement = Scanner(System.`in`).nextInt()

    for (item in firstElement .. lastElement) {
        val text = item.toString()
        var result = ""

        for (element in text.length-1 downTo 0) {
            result += text[element]
        }

        if (result == text) {
            println(text)
        }
    }
}

fun taskSix () {
    print("Enter first element: ")
    val firstElement = Scanner(System.`in`).nextInt()
    print("Enter last element:")
    val lastElement = Scanner(System.`in`).nextInt()

    for (item in firstElement..lastElement){

        var control = true

        for (item1 in firstElement..<item) {
            if (item%item1 == 0){
                control = false
                break
            }
        }

        if (control) {
            println(item)
        }
    }
}

//6 olculu int tipinde massiv verilib.Bu massive ededler ekrandan daxil edilir.Bu massivi artan sirada duzun.
fun taskSeven () {
    print("Size of Array:")
    val size = Scanner(System.`in`).nextInt()
    val myArray = Array(size) {
        print("Neter ${it+1}th element: ")
        Scanner(System.`in`).nextInt()

    }
    println(myArray.contentToString())

    for (index in myArray.indices){
        for (index2 in myArray.indices) {
            if (myArray[index] > myArray[index2]){
                val result = myArray[index]
                myArray[index] = myArray[index2]
                myArray[index2] = result

            }
        }
    }
    println(myArray.contentToString())
}