package practiceJava.StringManipulation;

public class Ex06 {
    public static void main(String[] args) {


        /*
       Bir password'un gecerli olup olmadigini asagidaki kurallara gore kontrol eden kodu yaziniz.
                   i)En az 8 character icermeli
                   ii)Space characteri icermemeli
                   iii)Buyuk harf icermemeli
                   iv)Son characteri "." olmali

*/
        String pass = "123wert.df";

        boolean bigChar = pass.replaceAll("^[A-Z]","").length()>0;
        System.out.println("bigChar = " + bigChar);

        boolean nokta = pass.charAt(pass.length()-1) == '.' ;
        System.out.println("nokta = " + nokta);

        boolean space = !pass.contains(" ");

        boolean elem = pass.length()>7;


        boolean sonuc = bigChar && nokta && space && elem;

        System.out.println("sonuc = " + sonuc);


    }
}
