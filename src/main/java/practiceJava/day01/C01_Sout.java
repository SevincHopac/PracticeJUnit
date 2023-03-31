package practiceJava.day01;
import java.util.Scanner;
public class C01_Sout {
    public static void main(String[] args) {

         /*

    ctrl+alt+l==>sayfayi duzenler

    \n alt satira gecirir

    \t tab bosluk birakir

    \b gerisindeki harfi siler

     \\: :\ (ters slash) yazdirir   prints a back slash

      \': ' tek tirnak yazdirir.  prints single quote

      \" :"" cift tirnak yazdirir. : prints double quote


     */

        Scanner input = new Scanner(System.in);
        System.out.println( " \" Techpro \" ile java cok \'kolay\'    " );

        System.out.println(" \" MAHARET \" hic \' DÜSMEMEK \' degil ;\n\n\n\t\"her düstügünde kalkabilmektir\n ");


        ////////////////////////////////////////////////////////////////////////////////////////////

        System.out.println("lutfen bir karakter giriniz:");
        char ch = input.next().charAt(0);
        System.out.println("  "+ch+"  ");
        System.out.println(" "+ch+" "+ch);
        System.out.println(ch+" "+ch+" "+" "+ch);
    }
}
