package pertemuan07.modul.check

fun checkPositifNegatif(bilangan: Int){
    if(bilangan == 0){
        println("Bilangan adalah NOL")
    } else if (bilangan > 0) {
        println("Bilangan $bilangan adalah POSITIF")
    } else {
        println("Bilangan $bilangan adalah NEGATIF")
    }
}