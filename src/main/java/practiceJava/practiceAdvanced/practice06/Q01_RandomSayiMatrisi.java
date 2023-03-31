package practiceJava.practiceAdvanced.practice06;

public class Q01_RandomSayiMatrisi {
    /*
Kullanıcıdan aldığınız bir sayi kadar satır ve sütun sayısına sahip alttaki rastgele 0 ve 1'lerden oluşan matriksi yazdırın.
Input: 10
Output:
1 0 0 1 1 0 0 0 1 1
0 0 1 0 1 0 1 0 0 0
0 1 0 1 0 0 0 0 0 1
1 1 1 0 0 0 0 1 1 1
1 1 0 1 1 1 0 1 0 0
1 0 0 0 1 1 0 0 0 0
0 0 1 0 0 0 0 1 1 1
1 1 0 1 0 1 0 0 1 0
0 0 1 0 0 0 0 1 1 0
1 1 1 0 0 1 1 1 1 0
*/
    public static void main(String[] args) {

        for (int i = 0; i < 10; i++) {

            for (int j = 0; j < 10; j++) {
                System.out.print((int)(Math.random()*2) + " ");
            }
            System.out.println();
        }




    }
}
