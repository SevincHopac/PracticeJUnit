package practiceJava.practiceAdvanced.practice06;

public class Kitap {
    String kitapAdi;
    String yazarAdi;
    int sayfaSayisi;
    String seriNo;
    static int counter;

    public Kitap(String kitapAdi, String yazarAdi, int sayfaSayisi) {
        this.kitapAdi = kitapAdi;
        this.yazarAdi = yazarAdi;
        this.sayfaSayisi = sayfaSayisi;
        counter++;
        seriNo=kitapAdi.substring(0,2)+yazarAdi.substring(0,2)+counter;
    }

    public void kitapBilgileri(){

        System.out.println(kitapAdi+" "+ yazarAdi+ " " + seriNo);
    }

}
