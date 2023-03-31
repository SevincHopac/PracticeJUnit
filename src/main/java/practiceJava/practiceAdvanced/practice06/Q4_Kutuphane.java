package practiceJava.practiceAdvanced.practice06;

public class Q4_Kutuphane {
    //Kütüphaneye eklemek istediğiniz kitapları,
    //adı, yazar adı, sayfa sayısı, seri numarası ile yazdıran bir kod yazınız.

    public static void main(String[] args) {

        Kitap kitap= new Kitap("Sefiller","hugo",123);
        kitap.kitapBilgileri();

        new Kitap("1984","George Orwel",235).kitapBilgileri();



    }
}
