/*
/   Pertemuan 14 File IO:
/   - Creating
/   - Writing
/   - Reading

 */

package pertemuan14

import java.io.File
import java.util.*

fun main(args: Array<String>){
    val filename = "contoh.txt"
    var fileObject = File(filename)
    var fileSudahAda = fileObject.exists()
    if(fileSudahAda){
        println("$filename file sudah ada. Berikut konten file:")
        fileObject.forEachLine { println(it) }
    } else {
        println("$filename file belum ada.")
        println("Membuat file: $filename")
        fileObject.createNewFile()
    }
    println()
    val reader = Scanner(System.`in`)
    print("Input teks ke file: ")
    var data: String = reader.nextLine()
    // Menambah teks kedalam file
    fileObject.appendText(data)
    fileObject.appendText("\n")
}

