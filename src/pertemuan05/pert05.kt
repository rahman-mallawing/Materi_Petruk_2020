/*
/   Pertemuan 5 membahas:
/   - Function vs Procedure
/   - Function parameter
/   - Return value.
 */

package pertemuan05


fun main(args: Array<String>){
    println("Hasil pemanggilan fungsi fungsiHitung: ")
    var dataTerima: Double = fungsiHitung()
    println("Data terima: $dataTerima")
    println("===================================")
    println()

    println("Hasil pemanggilan prosedurCetak: ")
    prosedurCetak()
    println("===================================")
    println()

    println("Hasil pemanggilan fungsi Berparameter: ")
    // Memanggil fungsi dengan argument "Jamal"
    var dataString: String = fungsiBerparameter("Jamal")
    println("Data terima: $dataString")
    println("===================================")
    println()


}

// Deklarasi fungsi
fun fungsiHitung(): Double{
    return (10/3).toDouble()
}

// Deklarasi prosedur
fun prosedurCetak(): Unit{
    println("Halo ini di dalam prosedurCetak")
}

// Deklarasi fungsi dengan parameter
fun fungsiBerparameter(nama: String): String{
    return "Halo $nama"
}

