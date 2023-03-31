package practiceJava.practiceAdvanced.practice03;

import java.util.Arrays;

public class Q04_MultiD {
    /*
 Aşağıdaki mutli dimensional array'lerin iç array'lerinde aynı indexe sahip elamanların
 toplamını yazdıran bir program yazın.
 arr1[]={{1,2},{3,4,5}{6}}
 arr2[]={{7,8,9},{10,11},{12}}
*/

    public static void main(String[] args) {

        int arr1[][] = {{1, 2}, {3, 4, 5}, {6}};
        int arr2[][] = {{7, 8, 9}, {10, 11}, {12}};


        int min = Math.min(arr1.length, arr2.length);

        int toplam = 0;

        for (int i = 0; i < min; i++) {


            for (int j = 0; j < arr1[i].length; j++) {

                if (j < arr2[i].length) {

                    toplam = arr1[i][j] + arr2[i][j];
                    System.out.println(arr1[i][j] + " + " + arr2[i][j] + " =  " + toplam);
                }

            }
        }


       /* int limit = 0;
        int toplam = 0;

        for(int i = 0; i<arr1.length; i++){
            limit = arr1[i].length;
            if(arr1[i].length>arr2[i].length){
                limit = arr2[i].length;
            }

            for(int j = 0; j<limit; j++ ){

                toplam = arr1[i][j] + arr2[i][j];

                System.out.println("arr["+i+"]["+j+"] = "+toplam);
            }
        }*/

    }
}
