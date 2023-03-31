package practiceJava.practiceAdvanced.practice04;

public class Q07_Variable_ArtmaAzaltma {
    public static void main(String[] args) {

        int x=20;
        int y = 15;

        System.out.println(x++ + ++y);
        System.out.println("x = " + x);
        System.out.println("y = " + y);

        int z=5;

        int sonuc = ++z + z++ + z++ + --z + z-- + +z;
        //          6   + 6   + 7   +  7  + 7   +  6
        System.out.println("sonuc = " + sonuc);


    }
}
