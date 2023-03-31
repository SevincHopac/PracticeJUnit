package practiceJava.practiceAdvanced.practice05;

public class Q05_Market_Constructor {

    //Ürün adı, ürün fiyatı ve (varsa) son kullanma tarihlerini yazdıran bir market programı yazınız..

    public static void main(String[] args) {

        Market urun = new Market("ekmek",2,4);

        System.out.println(urun.fiyat);
        System.out.println(urun.ad);
        System.out.println(urun.skt);


        Market urun1 = new Market("makarna",7);
        System.out.println(urun1.skt);




    }


}
