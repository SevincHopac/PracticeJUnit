package practiceJava.practiceAdvanced.practice04;

public class Q05_StringBuilderPalindrom {
    //Bir string degerin palindrom olup olmadigini kontrol eden kod yaziniz.

    public static void main(String[] args) {

        String str = "ala";

        //  1.yol
        String terstr ="";
      /*  for (int i = str.length()-1; i >=0; i--) {
            terstr += str.charAt(i);
        }
        if (str.equalsIgnoreCase(terstr))
            System.out.println("Palindrom " );
        else
            System.out.println("Palindrom degil !");*/


        StringBuilder stringBuilder= new StringBuilder(str);
        String stbReverse = stringBuilder.reverse().toString();

        if (str.equalsIgnoreCase(stbReverse))
            System.out.println("Palindrom");
        else
            System.out.println("Plaindrom degil !");
    }

}
