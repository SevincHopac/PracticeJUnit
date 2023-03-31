package practiceJava.practiceAdvanced.practice04;

public class Q03_ortalamadanBüyükler {
    //Elemetlerin ortalamasından büyük elementleri yazdıran bir kod yazınız.

    public static void main(String[] args) {

        int[] arr = {10,20,50,80,70,1,77,108,45,98};
        int sum=0;
        for (int w : arr){
            sum+=w;
        }
        int ort = sum/ arr.length;

        for (int w : arr){
            if (w>ort)
                System.out.print(w+" ");
        }

    }
}
