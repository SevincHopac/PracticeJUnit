package practiceJava.day01;

import java.util.Arrays;

public class Ex_advance {
    /*
    Write a code that returns the duplicate chars in a String array.(interview Question)
     Input :
     String str="Javaisalsoeasy"
     Output: [a, s]

     */


    public static void main(String[] args) {

        String str = "Javaisalsoeasy";
        String newStr = "";

        for (int i = 0; i < str.length(); i++) {

            String harf = str.substring(i,i+1);

            if (str.indexOf(harf) != str.lastIndexOf(harf)) {

                if (!newStr.contains(harf))
                    newStr += str.charAt(i);
            }

        }

        String[] arr = newStr.split("");

        System.out.println(Arrays.toString(arr));

    }


}
