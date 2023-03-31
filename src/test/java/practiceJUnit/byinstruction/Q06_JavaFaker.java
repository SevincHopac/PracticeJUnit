package practiceJUnit.byinstruction;

import com.github.javafaker.Faker;
import org.junit.Assert;
import org.junit.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebElement;
import utilities.TestBase;

import java.text.SimpleDateFormat;
import java.util.List;

public class Q06_JavaFaker extends TestBase {

   /*  Faker class'i testlerimizi yaparken ihtiyac duydugumuz isim, soyisim, adres vb bilgiler icin fake degerler uretmemize imkan tanir.
       Faker degerler uretmek icin Faker class'indan bir obje uretir ve var olan method'lari kullaniriz.
  */

    @Test
    public void name() {

        Faker faker = new Faker();

        //"https://facebook.com"  Adresine gidin
        driver.get("https://facebook.com");
        driver.findElement(By.xpath("//button[@title='Sadece temel çerezlere izin ver']")).click();

        //"create new account"  butonuna basin
        driver.findElement(By.xpath("(//a[@role='button'])[2]")).click();

        //"firstName" giris kutusuna bir isim yazin
        String firstName = faker.name().firstName();
        WebElement element = driver.findElement(By.name("firstname"));

        //"surname" giris kutusuna bir soyisim yazin
        String lastName = faker.name().lastName();

        //"email" giris kutusuna bir email yazin
        String eMail = faker.internet().emailAddress();

        // tekrar e-mail
        WebElement element1 = driver.findElement(By.name("reg_email_confirmation__"));

        //Bir sifre girin
        String password = faker.internet().password();

        //Tarih icin gun secin
        //Tarih icin ay secin
        //Tarih icin yil secin
        //Cinsiyeti secin

        SimpleDateFormat simpleDateFormat = new SimpleDateFormat("dd-MMM-yyyy");
        String birthday = simpleDateFormat.format(faker.date().birthday());
        System.out.println(birthday);
        String[] arr = birthday.split("-");

        element.sendKeys(firstName, Keys.TAB,lastName,Keys.TAB,eMail);
        element1.sendKeys(eMail,Keys.TAB,password,Keys.TAB,Keys.TAB,arr[0],Keys.TAB,arr[1],Keys.TAB,arr[2],Keys.TAB,Keys.TAB,Keys.ARROW_RIGHT,Keys.SPACE);

        //Isaretlediginiz cinsiyetin secili, diger cinsiyet kutusunun secili olmadigini test edin.

        List<WebElement> list = driver.findElements(By.name("sex"));

        Assert.assertFalse(list.get(0).isSelected());
        Assert.assertTrue(list.get(1).isSelected());
        Assert.assertFalse(list.get(2).isSelected());

    }
}
