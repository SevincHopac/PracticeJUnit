package practiceJava.practiceAdvanced.practice10;

public class Q04_RandomAdOlustuma {

    /*
    //Rastgele alınan harfleri bir Stringe ekleyerek
     adınızı oluşturan ve bunu kaç deneme ile yaptığını yazdıran bir kod yazınız.
     */

    public static void main(String[] args) {
        {

            String alfabe = "ABCDEFGHIJKLMNOPQRSTUVWXYZabcdefghijklmnopqrstuvwxyz";
            int maxIdx = alfabe.length();
            String isim = "zAli";
            String yeniIsim = "";
            int sayac = 0;


            for(int i = 0; i<isim.length(); i++){

                while (true){

                    char ch = alfabe.charAt((int)(Math.random()*maxIdx));
                    sayac++;

                    if(isim.charAt(i)==ch){
                        yeniIsim+=ch;
                        System.out.println(yeniIsim);
                        break;
                    }
                }
            }

            System.out.println(yeniIsim);
            System.out.println(sayac);


        }
    }
}
