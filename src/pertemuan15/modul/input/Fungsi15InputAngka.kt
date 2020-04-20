package pertemuan15.modul.input

import java.util.*
import kotlin.Exception

fun getInputAngka(): Int {
    var integer:Int = 0

    while (true){
        val reader = Scanner(System.`in`)
        print("Masukan angka: ")
        try {
            integer  = reader.nextInt()
            break

        } catch (e: Exception){
            println("error: ${e.toString()}")
        }
    }
    return integer

}