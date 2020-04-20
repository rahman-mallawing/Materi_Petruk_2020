package pertemuan08.modul.input

import java.util.*

fun getJumlahBrang(): Int {
    var jumlahBrang: Int
    while (true){
        try {
            jumlahBrang = getInputJumlahBarang()
            break
        } catch (e: Exception) {
            println("Error: ${e.toString()}")
        }
    }
    return jumlahBrang
}

fun getInputJumlahBarang(): Int{
    var inputJumlah: Int
    val reader = Scanner(System.`in`)
    print("Masukan jumlah barang: ")
    try {
        inputJumlah = reader.nextInt()
        return inputJumlah
    } catch (e: Exception){
        throw  Exception("Kesalahan input jumlah barang")
    }
}