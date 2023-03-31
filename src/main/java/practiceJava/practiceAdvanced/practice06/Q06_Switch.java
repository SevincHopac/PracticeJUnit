package practiceJava.practiceAdvanced.practice06;
import java.time.DayOfWeek;
import java.util.Scanner;

public class Q06_Switch {
    // Kullanıcıdan aldığınız güne göre o günden kaç gün sonrasının hangi güne denk geldiğini yazdıran bir kod yazınız.
    // pazartesi hafta başlangıcı

    public static void main(String[] args) {

        Scanner scan = new Scanner(System.in);
        System.out.println("Günü giriniz:");
        String strGun = scan.next().toUpperCase();
        System.out.println("Kac gün sonra : ");
        int num = scan.nextInt();

        switch (strGun) {
            case "PAZARTESİ":
                System.out.println(DayOfWeek.MONDAY.plus(num));
                break;
            case "SALI":
                System.out.println(DayOfWeek.TUESDAY.plus(num));
                break;
            case "ÇARŞANBA":
                System.out.println(DayOfWeek.WEDNESDAY.plus(num));
                break;
            case "PERŞEMBE":
                System.out.println(DayOfWeek.THURSDAY.plus(num));
                break;
            case "CUMA":
                System.out.println(DayOfWeek.FRIDAY.plus(num));
                break;
            case "CUMARTESİ":
                System.out.println(DayOfWeek.SATURDAY.plus(num));
                break;
            case "PAZAR":
                System.out.println(DayOfWeek.SUNDAY.plus(num));
                break;
            default:
                System.out.println("Geçerli bir gün ismi giriniz...");


        }
    }
}