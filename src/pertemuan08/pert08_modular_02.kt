/*
    2.	Buatlah program untuk menghitung besarnya diskon harga yang didapatkan pembeli
    jika setiap barang yang dibeli mendapatkan diskon 5%

    Catatan:
    a)	Harga barang dan jumlah barang diinput pengguna.
    b)	Output program menampilkan besarnya potongan diskon dari harga total barang belanja.
    c)	Selesaikan program anda dengan menggunakan prosedur program.

 */

package pertemuan08

import pertemuan08.modul.hitung.hitungDiskon
import pertemuan08.modul.hitung.hitungHargaTotal
import pertemuan08.modul.hitung.hitungTotalBayar
import pertemuan08.modul.input.getHargaBrang
import pertemuan08.modul.input.getJumlahBrang
import pertemuan08.modul.input.getNamaBarang

fun main(args: Array<String>){
    println("Program Hitung Pembelanjaan")
    val namaBarang: String = getNamaBarang()
    val hargaBarang: Double = getHargaBrang()
    val jumlahBarang: Int = getJumlahBrang()
    val hargaTotal: Double = hitungHargaTotal(hargaBarang, jumlahBarang)
    val diskon: Double = hitungDiskon(hargaTotal)
    var hargaBayar: Double = hitungTotalBayar(hargaTotal, diskon)

    println("Nama barang: $namaBarang")
    println("Harga item barang: $hargaBarang")
    println("Jumlah item barang: $jumlahBarang")
    println("Harga total: $hargaTotal")
    println("Diskon harga: $diskon")
    println("Total bayar: $hargaTotal")
}