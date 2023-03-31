package practiceJava.practiceAdvanced.practice09.Q4_abstraction;

public class Runner {
    //Dikdörtgen ve üçgenin alanlarını hesaplayan bir kod yazınız.(abstraction kullanın)

    public static void main(String[] args) {

        Ucgen ucgen = new Ucgen();
        System.out.println(ucgen.alanHesapla(3,4));

        Dikdortgen dikdortgen= new Dikdortgen();
        System.out.println(dikdortgen.alanHesapla(4,7));

        System.out.println(new Dikdortgen().alanHesapla(2,3));


    }
}
