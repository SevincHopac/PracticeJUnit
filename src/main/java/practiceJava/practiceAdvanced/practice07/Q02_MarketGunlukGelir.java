package practiceJava.practiceAdvanced.practice07;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Scanner;

public class Q02_MarketGunlukGelir {
    /*
           Günlük gelir market programı yazınız.
     -Tüm günlerin gelirlerini gösteren bir method,
     -Haftalık gelir ortalamasını gösteren bir method,
     -Hangi günlerin ortalama gelirden fazla geliri olduğunu gösteren bir method,
     -Hangi günlerin ortalama gelirden az geliri olduğunu gösteren bir method,
     */

    static ArrayList<String> gunler = new ArrayList<>(Arrays.asList("Pazartesi", "Sali", "Carsamba", "Persembe", "Cuma", "Cumartesi", "Pazar"));
    static ArrayList<Double> gunlukgelir = new ArrayList<>();
    static double toplamGelir = 0;


    public static void main(String[] args) {

        Scanner scan = new Scanner(System.in);
        int gun=0;

        while (gun<7){
            System.out.println(gunler.get(gun)+" gununun gelirini giriniz:");
            gunlukgelir.add(scan.nextDouble());
            toplamGelir += gunlukgelir.get(gun);
            gun++;
        }
        System.out.println("gunluk gelirler :"+gunlukgelir);
        System.out.println("gelir ortalamasi : " + ortGelir());
        System.out.println("ort ustu gunler : " + ortalamaUstuGunler());
        System.out.println("ort alti gunler : "+ ortAltiGunler());
    }

    public static double ortGelir(){
        return toplamGelir/7;
    }

    public static String ortalamaUstuGunler(){
        String s ="";

        for (int i = 0; i < gunlukgelir.size(); i++) {
            if (gunlukgelir.get(i)>ortGelir())
                s += gunler.get(i)+" ";
        }
        return s;
    }

    public static String ortAltiGunler(){
        String s ="";

        for (int i = 0; i < gunlukgelir.size(); i++) {
            if (gunlukgelir.get(i)<ortGelir())
                s += gunler.get(i)+" ";
        }
        return s;
    }




}
