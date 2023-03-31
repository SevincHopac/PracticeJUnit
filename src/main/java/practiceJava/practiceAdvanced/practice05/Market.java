package practiceJava.practiceAdvanced.practice05;

import java.time.LocalDate;

public class Market {

    String ad;
    double fiyat;
    String skt;

    public Market(String ad, double fiyat, int aysonra) {
        this.ad = ad;
        this.fiyat = fiyat;
        this.skt = LocalDate.now().plusMonths(aysonra).toString();
    }

    public Market(String ad, double fiyat) {
        this.ad = ad;
        this.fiyat = fiyat;
        skt="Bu ürünün skt yoktur.";
    }
}
