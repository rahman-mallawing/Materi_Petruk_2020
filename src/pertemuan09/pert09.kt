/*
/   Pertemuan 9 Nullable type:
/   - Null
/   - Nulltype

 */

package pertemuan09

fun main(args: Array<String>){
    // Berikut cara deklarasi nullable type
    // angka adalah variabel bertipe nullable
    var angka: Int?
    angka = 100
    println("Nilai angka: $angka")
    angka = angka + 12
    println("Nilai angka: " + (angka + 3))

    // berikut adalah deklarasi nullable string
    var nama: String? = null
     var identitas = nama ?: "Dikenali"
    println(identitas)
}