package practiceJava.practiceAdvanced.practice05;

import java.text.DecimalFormat;

public class HesapMakinasi {


    public void add(int... a) {

        int sum = 0;

        for (int w : a){
            sum += w;
        }

        System.out.println(sum);
    }


    public void fark(int a,int b) {

        System.out.println(a-b);
    }


    public void carp(int... a) {

        int sum = 1;

        for (int w : a){
            sum *= w;
        }

        System.out.println(sum);
    }

    public void bolme(double a,double b) {

        if (b == 0)
            System.out.println("bolen sayi 0 olamaz");
        else {

            System.out.println("Bölüm = "+new DecimalFormat("##.##").format(a/b));
        }


    }

}
