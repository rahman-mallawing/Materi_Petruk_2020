/*
/   Pertemuan 6 membahas:
/   - Exception
/   - Throwing Exception
/   - Hanlding exception
/   - Custom exception.
 */

package pertemuan06

import java.lang.Exception
import java.util.*


fun main(args: Array<String>){
    // Memanggil fungsi Contoh Handling Eksepsi
    contohHandlingException()

    println()
    println("=========================")

    // Berikut cara memanggil fungsi yang melempar eksepsi
    try {
        contohThrowCustomException(0)
    } catch (e: Exception){
        println("Error thrown: ${e.toString()}")
    }
}


fun contohHandlingException(): Unit {
    // Operasi yang memunculkan eksepsi: input yang salah
    println()
    var integer:Int = 0
    val reader = Scanner(System.`in`)
    print("Masukan angka: ")

    // Jika pengguna menginput karakter maka muncul eksepsi
    // Try catch untuk handling eksepsi
    try {
        integer  = reader.nextInt()
        println("Anda menginput: $integer")
    } catch (e: Exception){
        println("Error: ${e.toString()}")
        println("Input anda keliru")
    }

}

fun contohThrowCustomException(pilih: Int) {
    if(pilih==1){
        // Lempar eksepsi
        throw Exception("Ini adalah Custom Exception")
    } else {
        println("Teks ini dijalankan di dalam fungsi contohThrowCustomException")
    }
}