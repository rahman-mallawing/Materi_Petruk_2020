/*
/   Pertemuan 13 Custom Type:
/   - Data Class
/   - Data Class Collection
/   - Iteration Over

 */
package pertemuan13

// Deklarasi tipe data custom dengan property data
data class Mahasiswa(var nim: Int, var nama: String, var asal: String)

fun main(args: Array<String>){
    // Deklarasi variabel data class
    val aco = Mahasiswa(609001145, "Aco Subagyo", "Sinjai")
    println(aco)

    // Deklarasi koleksi data mahasiswa
    val grup = mutableListOf<Mahasiswa>()
    grup.add(Mahasiswa(609001146, "Juminten", "Bulukumba"))
    grup.add(aco)
    grup.add(Mahasiswa(609001147, "Safitri Nigrum", "Takalar"))

    // Iterasi
    for (mahasiswa in grup){
        println(mahasiswa)
    }
}