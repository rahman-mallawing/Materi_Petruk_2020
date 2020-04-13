/*
/   Pertemuan 2 membahas:
/   - Visibility
/   - Scope
/   - Paket dan Namespace
/   - Variabel Camel Case
/   - Variabel scope.
 */

// Deklarasi paket
package pertemuan02

// Import fungsi dari file terpisah dalam paket tersendiri
import pertemuan02.library_fungsi.fungsiPaket

// Deklarasi variable scope global
var scopeAngka: Int = 100

fun main(args: Array<String>){
    println("Hasil pemanggilan fungsi lokal: ")
    fungsiLokal()
    println("===================================")
    println()
    println("Hasil pemanggilan fungsi dalam paket library_fungsi: ")
    var teksTerima: String = fungsiPaket()
    println("Teks Terima dari fungsi: " + teksTerima)
    println("===================================")
    println()
}

// Deklarasi fungsi lokal tanpa opsi return atau prosedur
fun fungsiLokal(){
    println("Scope Angka sebelum deklarasi lokal: " + scopeAngka)

    // Deklarasi variabel dengan scope lokal pada fungsi
    var scopeAngka: Int = 20
    println("Scope Angka setelah deklarasi lokal: " + scopeAngka)
}

