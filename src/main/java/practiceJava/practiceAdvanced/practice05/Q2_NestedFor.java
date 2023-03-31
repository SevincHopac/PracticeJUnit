package practiceJava.practiceAdvanced.practice05;

import java.util.Scanner;

public class Q2_NestedFor {
     /*
Kullanıcıdan aldığınız satır sayısına göre aşağıdaki şekli yazdıran bir kod yazınız.

               *
              * *
             * * *
            * * * *
           * * * * *
 */

    public static void main(String[] args) {

      /*  int satir=5;

        
        for (int i = 0; i < satir; i++) {

            for (int j = satir-i; j >1 ; j--) {

                System.out.print(" ");
            }

            for (int k = 0; k <= i; k++) {
                System.out.print("* ");
            }
            System.out.println();
        }*/


        Scanner scan = new Scanner(System.in);
        System.out.println("satir sayisini veriiii misin");
        int s = scan.nextInt();
        for (int i = 1; i <= s; i++) {
            System.out.print(" ".repeat(s - i));
            System.out.println("* ".repeat(i));
        }


    }
}
