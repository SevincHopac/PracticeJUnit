package practiceJava.practiceAdvanced.practice08;

public class Q02_Array_HarfKulSayisi {
   /* Girilen String'de hangi harfin kaç kere kullanıldığını yazan bir kod yazınız.

    Input: String str = "Java is so Good";

    Output: String strOutput = "J1 a2 v1 i1 s2 o3 G1 d1";
     */


    public static void main(String[] args) {

        String str = "Java is so GoOOOod";
        String cikti = "";
        String[] arr = str.split("");

        for (String w : arr) {

            int counter = 0;

            for (String u : arr) {

                if (w.equals(u)) {
                    counter++;
                }
            }

            if (!cikti.contains(w)) {
                cikti += w + counter + " ";
            }
        }

        System.out.println(cikti);
    }
}
