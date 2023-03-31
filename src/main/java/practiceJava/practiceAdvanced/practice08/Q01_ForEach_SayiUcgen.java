package practiceJava.practiceAdvanced.practice08;

import java.util.Scanner;

public class Q01_ForEach_SayiUcgen {

    /*
             Alttaki şekli veren bir kod yazınız:
                  1 2 3 4 5 6
                   2 3 4 5 6
                    3 4 5 6
                     4 5 6
                      5 6
                       6
         */

    public static void main(String[] args) {

        Scanner scan = new Scanner(System.in);
        System.out.print("sayi giriniz:");
        int num = scan.nextInt();


        for (int i = 1; i <= num; i++) {

            for (int bosluk = 1 ; bosluk < i ; bosluk++) {
                System.out.print(" ");
            }

            for (int j = i; j <=num ; j++) {
                System.out.print(j+" ");
            }

            System.out.println();
        }
    }
}
