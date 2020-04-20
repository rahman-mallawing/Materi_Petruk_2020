package pertemuan07.modul.input

import java.util.*
import kotlin.Exception

fun getAngkaInteger(): Int {
    var integer:Int = 0
    val reader = Scanner(System.`in`)
    print("Masukan angka: ")
    try {
        integer  = reader.nextInt()
        return integer
    } catch (e: Exception){
        throw Exception(e.toString())
    }

}