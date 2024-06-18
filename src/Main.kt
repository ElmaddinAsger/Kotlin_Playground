fun main () {
    //tasOne(Month.JANUARY)

}


//Exercises
//1.Aylarin enumunu yaradın.When ile hemin aya uygun olaraq hemin aya uygun olarak hangi fesil oldugunu ekrana cixardın
fun tasOne (month : Month) {

    when(month){
        Month.DECEMBER,Month.JANUARY,Month.FEBRUARY -> println("Winter")
        Month.MARCH,Month.APRIL,Month.MAY -> println("Spring")
        Month.JUNE,Month.JULY,Month.AUGUST -> println("Summer")
        Month.SEPTEMBER,Month.OCTOBER,Month.NOVEMBER -> println("Autumn")
    }

}

enum class Month {
    JANUARY,
    FEBRUARY,
    MARCH,
    APRIL,
    MAY,
    JUNE,
    JULY,
    AUGUST,
    SEPTEMBER,
    OCTOBER,
    NOVEMBER,
    DECEMBER
}


//2.WorkStatus enumu olsun(meselen:Mezuniyyetdedi,Ezamiyyetdedi,Online isleyis,Isde degil)
//VE Day enumu olsun.
//Ilk 5 gun is guns olduguna gore bir deyer yaradan meselen Maas meselen ucun 1000 verin.
//Eger is gunuduse Maas olarak hemin degeri qaytaracaq.
//Eger is günü deyilse meselen ucun Isci ezamiyyetdedise maasinin ustune 50 manat.
//Onlinedise ustune 20 manat,Isde deyilse hemin degeri,
//Mezuniyyetdedise onun maasinin gününe nece manat düsürsem
//onun üstüne gelecek.(nece mana düşmeyiniz hesablamaq mecburi değil)

enum class WorkStatus {
    VACATION,
    JOURNEY,
    ONLINE,
    ONSIDE,
    NOTWORK
}
enum class Week {
    MONDAY,
    TUESDAY,
    WEDNESDAY,
    THURSDAY,
    FRIDAY,
    SATURDAY,
    SUNDAY
}

fun salary (day: Week, workStatus: WorkStatus) {
    var salary = 1000
    when(day){
        Week.MONDAY, Week.TUESDAY, Week.WEDNESDAY, Week.THURSDAY, Week.FRIDAY -> println("Salary: $salary")
        Week.SATURDAY,Week.SUNDAY -> when {
          workStatus == WorkStatus.ONSIDE -> println("Salary = ${salary + 50}")
          workStatus == WorkStatus.ONLINE -> println("Salary = ${salary + 20}")
        }
    }

    when (workStatus) {
        WorkStatus.VACATION -> println("Salary: ${salary + 50}")
        WorkStatus.JOURNEY -> println("Salary: ${salary + 20}")
        //WorkStatus.ONSIDE -> println("Salaty: $salary")
        //WorkStatus.ONLINE -> println("Salary: $salary")
        //WorkStatus.NOTWORK -> println("Salary: $salary")
        else -> println("Salary: $salary")
    }
}