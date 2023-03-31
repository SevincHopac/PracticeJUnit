package practiceJava.day01;

import java.util.Scanner;

public class Example {
    public static void main(String[] args) {

        //  Soru 1)   Kullanicinin  girdigi 4 basamakli sayinin ilk ve son rakaminin toplamini ekrana yazdiran programi yazdiriniz

        Scanner scan = new Scanner(System.in);
        System.out.print("4 basamakli bir sayi giriniz:");
        int num = scan.nextInt();

        int son = (num%10);
        int ilk = num/1000;

        System.out.println(son+ilk);


        //Soru 2) Kullanicidan uc basamakli bir sayi alin ve sayinin rakamlarini birler,onlar ve yuzler basamagi olarak yazdirin

        System.out.print("3 basamakli bir sayi girniz : ");
        int num1 = scan.nextInt();

        int bir = num1%10;
        int onlar = (num1/10)%10;
        int yuzler = num1/100;

        System.out.println("bir = " + bir);
        System.out.println("onlar = " + onlar);
        System.out.println("yuzler = " + yuzler);

    }
}
