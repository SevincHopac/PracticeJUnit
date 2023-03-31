package practiceJava.practiceAdvanced.practice04;

import java.util.Scanner;

public class Q01_Switch_AyGunleri {
    /*

Girilen yil ve ay numarasına göre ayin kaç gün olduğunu yazdiran bir kod yazınız.
    Girdi yıl: 2000 ay: 2
    Çıktı: 29

*/
    // 1,3,5,7,8,10,12 31gun //  2,4,6,9,11 30gun

    public static void main(String[] args) {

        Scanner scan = new Scanner(System.in);
        System.out.println("Yili giriniz");
        int year = scan.nextInt();
        System.out.println("Ay numarasini giriniz:");
        int ay = scan.nextInt();

        int gun;

        switch (ay) {

            case 1:
            case 3:
            case 5:
            case 7:
            case 8:
            case 10:
            case 12:
                gun = 31;
                System.out.println("girdiginiz ayin gun sayisi: " + gun);
                break;

            case 4:
            case 6:
            case 9:
            case 11:
                gun = 30;
                System.out.println("girdiginiz ayin gun sayisi : " + gun);
                break;

            case 2:
                if (year % 4 == 0 && year % 100 != 0 || year % 400 == 0) {
                    gun = 29;
                    System.out.println("(Leap year)girdiginiz ayin gun sayisi : " + gun);
                }else {
                    gun=28;
                    System.out.println("girdiginiz ayin gun sayisi : " + gun);
                }
                break;
            default:
                System.out.println("gecerli bir ay numarasi girniz!");
        }
    }
}
