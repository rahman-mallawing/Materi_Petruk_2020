/*
/   Pertemuan 15 program modular:
/   - Modular
/   - Paket dan Namespace
/   - Function/Procedure
/   - Advanced Flow
/   - Exception Handling.
/   - Collection
/   - Data class

- Soal:
    Buatlah sebuah program untuk memeriksa apakah bilangan X
    adapakah bilangan ganjil, genap, bilangan positif atau bilangan negatif.
    Bilangan X diinput pengguna. Contoh A = -3, maka A adalah bilangan negatif dan ganjil.

 */

package pertemuan15

import pertemuan15.modul.check.periksaGanjilGenap
import pertemuan15.modul.check.periksaPositifNegatif
import pertemuan15.modul.input.getInputAngka
import java.util.*

// deklarasi koleksi custom data
data class Bilangan(val bil: Int, var ketGG: String = "", var ketPN: String = "")
var koleksiBilangan = mutableListOf<Bilangan>()


fun main(args: Array<String>){
    var konfirmasi: Char = 'y'
    var bilangan: Int
    while (konfirmasi.equals('Y', true)){
        var reader = Scanner(System.`in`)

        // dapatkan bilangan dari input
        bilangan = getInputAngka()

        // Masukan bilangan ke dalam koleksi data
        koleksiBilangan.add(Bilangan(bilangan))

        print("Input data lagi?[Y/T]: ")
        konfirmasi = reader.next().first()
    }

    // Proses koleksi bilangan
    for (bilang in koleksiBilangan){
        // Proses periksa ganjil genap dengan menggunakan modul periksaGanjilGenap
        bilang.ketGG = periksaGanjilGenap(bilang.bil)

        // Proses periksa positif negatif  dengan menggunakan modul periksaPositifNegatif
        bilang.ketPN = periksaPositifNegatif(bilang.bil)

        // cetak bilangan
        println(bilang)
    }
}
