package practiceJava.StringManipulation;

public class Ex05 {
    public static void main(String[] args) {

        //Soru 1) Kullanicidan email adresini girmesini isteyin,
// mail @gmail.com icermiyorsa  "lutfen gmail adresi giriniz",
// @gmail.com ile bitiyorsa  "Email adresiniz kaydedildi " ,
// @gmail.com ile bitmiyorsa "lutfen yazimı kontrol edin" yazdırın

        String str = "abc@gmail.com";
        String arananMetin = "@gmail.com";

        if (!str.contains(arananMetin)) {

            System.out.println("lutfenngmail adresi giriniz");

        } else if (str.endsWith("@gmail.com")) {

            System.out.println("Email adresiniz kaydedildi ");

        } else System.out.println("lutfen yazimı kontrol edin");


    }
}
