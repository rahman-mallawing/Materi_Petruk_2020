package pertemuan15.modul.check

fun periksaGanjilGenap(bilangan: Int): String{
    var hasilModulus: Int = bilangan % 2
    when (hasilModulus){
        0 -> return  "Bilangan $bilangan adalah GENAP"
        else -> return "Bilangan $bilangan adalah GANJIL"
    }
}