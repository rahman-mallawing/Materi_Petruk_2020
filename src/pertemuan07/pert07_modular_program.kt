/*
/   Pertemuan 7 program modular:
/   - Modular
/   - Paket dan Namespace
/   - Function/Procedure
/   - Advanced Flow
/   - Exception Handling.

- Soal:
    Buatlah sebuah program untuk memeriksa apakah bilangan X
    adapakah bilangan ganjil, genap, bilangan positif atau bilangan negatif.
    Bilangan X diinput pengguna. Contoh A = -3, maka A adalah bilangan negatif dan ganjil.

 */

package pertemuan07

import pertemuan07.modul.check.checkGanjilGenap
import pertemuan07.modul.check.checkPositifNegatif
import pertemuan07.modul.input.getAngkaInteger


fun main(args: Array<String>){
    // Deklarasi variabel X
    println("Program Cek Bilangan")
    var X: Int
    // Input bilangan X
    while (true){
        try {
            X = getAngkaInteger()
            break
        } catch (e: Exception) {
            println("Error input: ${e.toString()} ")
        }
    }

    checkGanjilGenap(X)
    checkPositifNegatif(X)

}