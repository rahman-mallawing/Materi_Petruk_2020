/*
/   Pertemuan 11 Map / Set:
/   - Map/Set
/   - Mutable dan Immutable
/   - Cetak Map/Set

 */

package pertemuan11


fun main(args: Array<String>){
    // Immutable map
    var asalDaerah = mapOf("Aco" to "Bone", "Wawan" to "Gowa", "Cundekke"
            to "Sinjai", "Juminten" to "Jeneponto")
    // cetak
    for ((nama, daerah) in asalDaerah){
        println("Nama: $nama -> $daerah")
    }

    // Mutable map
    var umurKaryawan = mutableMapOf("Joko" to 35, "Cundekke" to 27,
        "Delon" to 28, "Irwan" to 26)
    println()
    println(umurKaryawan)
    println()
    println(umurKaryawan["Delon"])
    umurKaryawan.put("Tuming", 67)
    umurKaryawan.remove("Cundekke")
    println(umurKaryawan)


    // deklarasi SET imuutable
    val nama_nama = setOf("Jono", "Tukin", "Wawan", "Juminten")
    println(nama_nama)

    // deklarasi array dengan nilai 1 berulang
    val someArray = arrayOf(1, 2, 3, 1)

    // mutable set dari array
    var someSet = mutableSetOf(*someArray)
    // nilai 1 dalam array akan dijadikan 1 meskipun ada 2 pada array asal, SET adalah koleksi nilai unik
    println(someSet)
    //akses elemen
    someSet.add(123)
    someSet.remove(2)
    println(someSet)
}