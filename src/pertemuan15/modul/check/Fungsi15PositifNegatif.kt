package pertemuan15.modul.check

fun periksaPositifNegatif(bilangan: Int): String{
    if(bilangan == 0){
        return "Bilangan adalah NOL"
    } else if (bilangan > 0) {
        return "Bilangan $bilangan adalah POSITIF"
    } else {
        return "Bilangan $bilangan adalah NEGATIF"
    }
}