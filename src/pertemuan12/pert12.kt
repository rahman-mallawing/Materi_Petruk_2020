/*
/   Pertemuan 12 Function:
/   - Function asa variabel
/   - Function as argument
/   - Fungsi Anonim

 */
package pertemuan12

fun main(args: Array<String>){
    // deklarasi fungsi anonim lamda
    var fungsi = { namaDepan: String, namaBelakang: String -> String
        "Nama Lengkap: $namaDepan $namaBelakang"
    }
    // variabel fungsi adalah variabel bertipe fungsi lamda yang bisa dieksekusi
    var nama = fungsi("Andi", "Imran")
    println(nama)

    // Berikut ini contoh memanggil fungsi lokal dengan fungsi anonim sebagai argumen
    // fungsi anonim ini berfungsi sebagai callback yang memanggil kembali
    //var angkaTerima: Double
    lokalFungsi(12) { angkaTerima ->
        println("Angka Terima adalah: $angkaTerima")
    }
}


/* Deklarasi fungsi yang menerima fungsi anonim sebagai argumen
    Fungsi funAnonim adalah fungsi anonim yang berfungsi sebagai callback
 */
fun lokalFungsi(angka: Int, funAnonim: (Double) -> Unit){
    println("Nilai argument Angka: $angka")
    var angkaKirimBalik: Double = (angka*2).toDouble()
    funAnonim((angkaKirimBalik)) // Baris ini akan memanggil balik dan mencetak angka terima
    println("Nilai argument Angka * 3: ${angka*3}")
}

