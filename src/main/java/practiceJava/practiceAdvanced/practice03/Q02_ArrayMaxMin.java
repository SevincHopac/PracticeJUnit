package practiceJava.practiceAdvanced.practice03;

import java.util.Arrays;

public class Q02_ArrayMaxMin {
    /*
   Bir Array içerisindeki 'minimum', 'maksimum'  ve 'ikinci maksimum' değerleri bulan bir kod yazınız.

   input: int[] arr = { 100, 10001, -90, 845, 8787, 898, 0, 1};
   output: min:-90, max:10001, secMax: 8787

  */

    public static void main(String[] args) {
        int[] arr = { 100, 10001, -90, 845, 8787, 898, 0, 1};

        //1.yol

        Arrays.sort(arr);
        System.out.println("min :" + arr[0] + "\nmax : " + arr[arr.length-1] + "\nikinci maksimum : " + arr[arr.length-2]);

        //2.yol

        int min=arr[0];
        int max = arr[0];
        int ikincimaksimum = arr[0];

        for (int w : arr){
            if (w<min){
                min=w;
            } else if (w>max) {
                ikincimaksimum=max;
                max=w;
            } else if (w>ikincimaksimum) {
                ikincimaksimum=w;
            }
        }

        System.out.println("ikincimaksimum = " + ikincimaksimum);
        System.out.println("max = " + max);
        System.out.println("min = " + min);
    }
}
