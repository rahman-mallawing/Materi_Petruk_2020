package pertemuan08.modul.input

import java.util.*

fun getNamaBarang(): String {
    var barang : String
    val reader = Scanner(System.`in`)

    do {
        try {
            print("Masukan nama barang: ")
            barang = reader.nextLine()
            break
        } catch (e: Exception) {
            println("Error: ${e.toString()}")
            println("Input anda salah!")
        }
    } while (true)
    return barang
}