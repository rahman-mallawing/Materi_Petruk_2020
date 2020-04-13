/*
/   Pertemuan 3 membahas:
/   - Type Conversion
/   - Explisit Conversion
/   - Mixed Type Operation
/   - String Template
/   - ANY Type
/   - Multiline String.
 */

package pertemuan03

fun main(args: Array<String>){
    // Deklarasi variable
    var bulat: Int
    var desimal: Double = 33.56

    // Deklarasi string template
    var pesan = "Hasil konversi Double ke Integer: ${desimal.toInt()}!"
    println(pesan)
    println()

    val hourlyRate: Double = 19.5
    val hoursWorked: Int = 10
    val totalCost: Double = hourlyRate * hoursWorked.toDouble()

    // Deklarasi multi line string
    val bigString = """
                     |Berikut hasilnya:
                     |Hourly Rate: $hourlyRate
                     |Hours Worked: $hoursWorked
                     |Total Cost: $totalCost
                     |Hours Worked (Double): ${hoursWorked.toDouble()}.
                     """.trimMargin()
    println(bigString)
    println()

    // Deklarasi variabel dengan tipe data ANY
    var anyData: Any

    // anyData diisi dengan string
    anyData = "Ini adalah value String"
    println("Nilai variabel anyData adalah: $anyData \n")

    // anyData diisi dengan integer
    anyData = 1000
    println("Nilai variabel anyData adalah: $anyData \n")
    println()
}

