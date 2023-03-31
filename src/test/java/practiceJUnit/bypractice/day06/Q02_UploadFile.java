package practiceJUnit.bypractice.day06;

import org.junit.Assert;
import org.junit.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebElement;
import utilities.TestBase;

public class Q02_UploadFile extends TestBase {


    @Test
    public void name() {

        //https://demo.guru99.com/test/upload/ adresine gidiniz
        driver.get("https://demo.guru99.com/test/upload/");

        driver.switchTo().frame("gdpr-consent-notice");
        driver.findElement(By.xpath("//*[.='Tümünü Reddet']")).click();
        driver.findElement(By.xpath("//*[.='Reddet']")).click();
        driver.switchTo().parentFrame();
        String filePath = "C:\\Users\\sevin\\OneDrive\\Desktop\\logo (1).jpeg";

        //Bilgisayarınızdan herhangi bir dosyayı upload ediniz
        WebElement dowlClick = driver.findElement(By.id("uploadfile_0"));
        dowlClick.sendKeys(filePath);

        // I accept terms of service bölümünü tikleyin
        // Submit File buttonuna basınız
        driver.findElement(By.id("terms")).sendKeys(Keys.SPACE,Keys.TAB,Keys.TAB,Keys.ENTER);

        waitFor(3);
        // "1 file has been successfully uploaded" görünür olduğunu test edin
        WebElement resultText = driver.findElement(By.id("res"));
        Assert.assertTrue(resultText.isDisplayed());

    }
}
