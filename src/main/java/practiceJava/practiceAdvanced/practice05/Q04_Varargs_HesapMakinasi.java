package practiceJava.practiceAdvanced.practice05;

public class Q04_Varargs_HesapMakinasi {

    //Temel 4 matematik işlemi yapan bir kod yazınız.

    public static void main(String[] args) {

        HesapMakinasi hesapMakinasi = new HesapMakinasi();
        hesapMakinasi.add(2,4,5,7);

        hesapMakinasi.carp(2,3);
        hesapMakinasi.bolme(4,2);


    }
}
