package pertemuan07.modul.check

fun checkGanjilGenap(bilangan: Int){
    var hasilModulus: Int = bilangan % 2
    when (hasilModulus){
        0 -> println("Bilangan $bilangan adalah GENAP")
        else -> println("Bilangan $bilangan adalah GANJIL")
    }
}