package practiceJava.practiceAdvanced.practice07;

import java.util.Random;

public class Q05_Exception_Throw {

    public static void main(String[] args) {

        rasrtgeleSayi();

    }

    public static void rasrtgeleSayi() {

        Random random = new Random();


        while (true) {
            int a = random.nextInt(11);
            int b = random.nextInt(11);

            try {
                if ((a + b) < 12)
                    throw new Exception();
                else {
                    System.out.println(a + " + " + b + " = " + (a + b));
                    break;
                }
            } catch (Exception e) {
                System.out.println(a + " + " + b + " = " + (a + b));
                System.out.println("toplam 12 den kucuk olamaz");
            }


        }
    }
}

// try-catch lkullaninca baska klaslardan cagirabiliyoruz ve calima durmuyor
// throw ile cagiramayiz , calisma duruyor