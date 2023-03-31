package practiceJava.practiceAdvanced.practice07;

public class Q01_ArrayToString {
    /*
      Array olarak verilen bir cümleyi String olarak negatif anlamıyla yazdıran bir kod yazınız.
      Input:
      String[] arr={"J","a","v","a","I","s","D","i","f","f","i","c","u","l","t"};
      Output:
      String output ="JavaIsNOTDifficult";
       */

    public static void main(String[] args) {

        String[] arr={"J","a","v","a","I","s","D","i","f","f","i","c","u","l","t"};
        StringBuilder newStr = new StringBuilder();

        for (String w : arr) {
            newStr.append(w);
        }

        newStr = new StringBuilder(newStr.toString().replace("s", "sNOT"));
        System.out.println(newStr);
    }




}
