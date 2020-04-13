/*
/   Pertemuan 4 membahas:
/   - Advanced Flow.
 */

package pertemuan04




fun main(args: Array<String>){
    // Alur looping FOR... LOOPS
    println("Alur looping FOR... LOOPS. \n")
    val count = 10
    var sum = 0
    for (i in 1..count) {
        println(sum)
        sum += i
    }

    // Alur looping FOR... LOOPS STEP 2
    println("Alur looping FOR... LOOPS STEP 2. \n")
    sum = 0
    for (i in 1..count step 2) {
        println(sum)
        sum += i
    }

    // Alur looping repeat
    println("Alur looping repeat. \n")
    sum = 1
    var lastSum = 0
    repeat(10) {
        println(sum)
        val temp = sum
        sum += lastSum
        lastSum = temp
    }

    // Alur seleksi when
    println("Alur seleksi when. \n")
    var hewan = "Sapi"
    when (hewan) {
        "Sapi", "Kucing" -> println("Jenis Hewan Mamalia.")
        else -> println("Bukan Mamalia.")
    }

    // Alur when mengembalikan nilai seleksi
    var number: Int = 6
    var numberName = when (number) {
        2 -> "two"
        4 -> "four"
        6 -> "six"
        8 -> "eight"
        10 -> "ten"
        else -> {
            println("Unknown number")
            "Unknown"
        }
    }
    println(numberName)
}

