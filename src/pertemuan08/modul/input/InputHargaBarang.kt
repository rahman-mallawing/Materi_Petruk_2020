package pertemuan08.modul.input

import java.util.*

fun getHargaBrang(): Double {
    var hargaBrang: Double
    while (true){
        try {
            hargaBrang = getInputHargaBarang()
            break
        } catch (e: Exception) {
            println("Error: ${e.toString()}")
        }
    }
    return hargaBrang
}

fun getInputHargaBarang(): Double{
    var inputHarga: Double
    val reader = Scanner(System.`in`)
    print("Masukan jumlah barang: ")
    try {
        inputHarga = reader.nextDouble()
        return inputHarga
    } catch (e: Exception){
        throw  Exception("Kesalahan input harga barang")
    }
}