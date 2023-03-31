package practiceJava.practiceAdvanced.practice07;

import java.io.FilterOutputStream;

public class Q04_Exception_Throws {
    /*
   randomSayi isminde bir method oluşturunuz.
   Bu method içerisinde iki int random sayı oluştursun. (0'dan 10 a kadar)
   Bu iki random sayının toplamını yazdırın.
   Eğer bu iki random sayının toplamı 12 den küçükse "Exception" versin ve mesaj olarak
   ("Sayı 12'den küçük ise hata verir") yazdırın.
     */

    public static void main(String[] args) throws Exception {


            rondomTwoNum();

    }

    public static void rondomTwoNum() throws Exception {

        int num1 = (int) (Math.random() * 11);
        int num2 = (int) (Math.random() * 11);

        if (num1 + num2 < 12)
            throw new Exception("Sayı 12'den küçük ise hata verir");
        else System.out.println(num1 + " + " + num2 + " = " + (num1 + num2));

    }

}
