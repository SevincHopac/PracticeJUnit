package practiceJava.practiceAdvanced.practice10;

public class Q02_LoopsuzFaktoriyel {
    /*
    Faktoriyel hesaplayan bir method yazınız.(Loop kullanmayınız.)
     */

    public static void main(String[] args) throws Exception {
        System.out.println(faktoriyelHesapla(3));
    }

    public static int faktoriyelHesapla(int a) throws Exception {

        if (a > 0) {
            if (a == 1) {
                return 1;
            } else {
                return a * faktoriyelHesapla(a - 1);
            }
        }else {
            throw new Exception("Syi sifirdan buyum olmali ");
        }
    }
}