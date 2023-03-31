package practiceJava.practiceAdvanced.practice07;

public class Q03_StringRakamlarToplami {

    /*
     Kullanıcıdan alınan bir String içerisindeki rakamların toplamını hesaplayan bir method yazınız.
     Örn:
     input : J4\/4 1$ 34$¥
     output : 16
     İpucu:
     Character.isDigit()
     Integer.valueOf()
    */

    public static void main(String[] args) {

        String s = "J4\\/4 1$ 34$¥";

        System.out.println(rakamlaritopla(s));
        rekmTop(s);



    }

    //1.yol
     static int rakamlaritopla(String s) {
        int top=0;

        s= s.replaceAll("[^0-9]","");
        int x = Integer.parseInt(s);

        for (int i = 0; i < s.length(); i++) {
            int a = x%10;
            top += a;
            x /=10;
        }
        return top;
    }

    public static void rekmTop(String str){

        int toplm=0;

        for (int i = 0; i < str.length(); i++) {

            if (Character.isDigit(str.charAt(i))){
                toplm += Integer.valueOf("" + str.charAt(i));
            }
        }
        System.out.println("rakamlarin top: " + toplm);
    }
}
