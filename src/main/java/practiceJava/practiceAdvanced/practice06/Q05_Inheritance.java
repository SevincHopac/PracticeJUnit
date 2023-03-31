package practiceJava.practiceAdvanced.practice06;

public class Q05_Inheritance {
    //Kare prizma, silindir ve koninin hacmini hesaplayan bir kod yazınız.(Inheritance kullanınız)

    public static void main(String[] args) {

        Kare kare=new Kare();
        double kareprizmahacmi= kare.hacimHesapla(5,6);
        System.out.println(kareprizmahacmi);

        Koni koni= new Koni();
        System.out.println(koni.hacimHesapla(3,4));

        Silindir silindir= new Silindir();
        System.out.println(silindir.hacimHesapla(3,6));






    }
}
