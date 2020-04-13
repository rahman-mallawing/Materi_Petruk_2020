/*
/   Pertemuan 4 membahas:
/   - Basic flow.
 */

package pertemuan04




fun main(args: Array<String>){
    // Alur seleksi
    var hewan = "Sapi"
    if (hewan == "Sapi" || hewan == "Kucing") {
        println("Jenis Hewan Mamalia.")
    } else {
        println("Bukan Mamalia.")
    }

    // Alur perulangan
    println("Alur perulangan. \n")
    var sum = 1
    while (sum < 1000) {
        println(sum)
        sum = sum + (sum + 1)
    }

    // Alur perulangan dengan break
    println("Alur perulangan dengan break. \n")
    sum = 1
    do {
        println(sum)
        sum = sum + (sum + 1)
        if (sum >= 1000) {
            break
        }
    } while (sum < 90000)

    println()
}

