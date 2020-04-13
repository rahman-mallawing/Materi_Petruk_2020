/*
/   Pertemuan 1 membahas:
/   - Statement
/   - Komentar
/   - String literal dan Number type
/   - Output
/   - Operasi aritmetika.
 */


package pertemuan01

fun main(args: Array<String>){
    // Bagian komentar pada program menggunakan tanda // untuk komentar satu baris
    /*
        Untuk komentar lebih dari satu baris,
        menggunakan format seperti komentar ini.
     */

    /*
        Statemen atau pernyataan kode yang akan dieksekusi dalam kotlin
        bisa berupa statemen deklarasi variable, operasi matematika,
        maupun output program seperti print dan println
        Selanjutnya kita contohkan di kode selanjutnya
     */

    // Deklarasi variabel String literal
    var welcome: String = "Halo Selamat Datang Pada Pemrograman KOTLIN"

    // Statemen menampilkan output
    println(welcome)

    // Deklarasi CONSTANT bertipe data number Double
    val hargaBarang: Double = 2500.0

    // Deklarasi variable tipe data number jumlah barang dan harga total
    var jumlahBarang: Int
    var hargaTotal: Double

    // Memberi nilai variabel jumlahBarang
    jumlahBarang = 10

    // Operasi matematika hitung hargaTotal
    hargaTotal = jumlahBarang * hargaBarang

    // Cetak output
    println("Harga total sejumlah " + jumlahBarang + " barang: " + hargaTotal)

}