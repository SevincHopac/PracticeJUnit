package practiceJUnit.bypractice.day06;

import org.junit.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import utilities.TestBase;

import java.nio.file.Files;
import java.nio.file.Paths;
import java.util.ArrayList;
import java.util.List;

public class Q03_FileDownload extends TestBase {


    @Test
    public void name() throws InterruptedException {

        //https://www.selenium.dev/downloads/ adresine gidelim
        driver.get("https://www.selenium.dev/downloads/");

        //Platforms Supported by Selenium altındaki Browsers bölümü görünene kadar sayfayı indirelim
        WebElement element = driver.findElement(By.xpath("//*[.='Platforms Supported by Selenium']"));
        scrollToElement(element);

        //Browser bölümünden Chrome driver bölümündeki documentation linkine tıklıyalım
        driver.findElement(By.xpath("(//*[@class='fas fa-plus show-collapsed pr-2'])[1]")).click();
        WebElement documentaion= driver.findElement(By.xpath("(//a[.='documentation'])[5]"));
        scrollIntoViewJS(documentaion);
        documentaion.click();

        //All versions available in Downloads altında Latest stable release olan linki tıklayalım
        driver.findElement(By.xpath("(//*[@class='XqQF9c'])[2]")).click();
        List<String> pencereler = new ArrayList<>(driver.getWindowHandles());
        driver.switchTo().window(pencereler.get(1));

        //Açılan pencerede chromedriver'i indirelim
        driver.findElement(By.xpath("//*[text()='chromedriver_win32.zip']")).click();
        Thread.sleep(10000);

        //Driver'in indiğini doğrulayalım


        //"C:\Users\Lenovo\Downloads\chromedriver_win32.zip"       ---------------!!!!!!!!!!!!!!!!!!!!!!!
        String dosyaYolu = System.getProperty("user.home")+"\\Downloads\\chromedriver_win32.zip";
        assert Files.exists(Paths.get(dosyaYolu));


    }
}
