package practiceJava.practiceAdvanced.practice10;

public class Q05_Varargs_IlkiHaricTopla {
    /*

Parametrelerinin ilki hariç  karakter sayılarını toplayan ve bu toplamı birinci parametrenin karakter sayısıyla çarpan bir methodu yazınız.
(indeks ve if statement kullanmayınız)
   */

    public static void main(String[] args) {
        myMethod("Ali","ali","veli","ayse");
    }

    public static void myMethod(String a, String... b){
        int sum=0;
        for (String w : b){
            sum += w.length();
        }
        System.out.println(sum*a.length());
    }
}
