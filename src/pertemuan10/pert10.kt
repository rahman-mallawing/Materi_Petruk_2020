package pertemuan10

/*
/   Pertemuan 10 Array dan List type:
/   - Array/List integer/String
/   - Cetak array/List

 */

fun main(args: Array<String>){
    // Array integer
    var inisialSama = Array(7, { 11 })
    // set indeks ke 5
    inisialSama.set(4, 12)
    for (i in inisialSama){
        println("Nilai: $i")
    }

    // Array string
    var nama_nama = arrayOf("Agus", "Eko", "Iwan", "Ondel", "Juminten")
    // set indeks ke 2
    nama_nama[1] = "Cundekke"
    for (nama in nama_nama){
        println("Nama: $nama")
    }

    // Array double
    var arrayNol = DoubleArray(4)
    arrayNol[1] = 123.4567
    for (nilai in arrayNol){
        println("Nilai Array: $nilai")
    }

    // Deklarasi List immutable LIST atau constant list
    val innerPlanets = listOf("Mercury", "Venus", "Earth", "Mars")
    // cetak list
    for (planet in innerPlanets) {
        println("Planet: $planet")
    }

    // innerPlanets tidak bisa dimodifikasi karena termasuk tipe immutable list

    // Deklarasi mutable list
    val outerPlanets = mutableListOf("Jupiter", "Uranus",
        "Neptune")

    // cetak list
    for (planet in outerPlanets) {
        println("Outer Planet: $planet")
    }

    // outerPlanets dapat diubah, ditambah karena mutable
    outerPlanets.add("Pluto")
    outerPlanets.set(1, "Saturn")
    // cetak list stelah modifikasi
    println("Cetak setelah modifikasi:")
    for (planet in outerPlanets) {
        println("Outer Planet: $planet")
    }
}