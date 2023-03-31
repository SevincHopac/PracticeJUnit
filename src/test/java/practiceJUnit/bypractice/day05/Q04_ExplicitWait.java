package practiceJUnit.bypractice.day05;

import io.github.bonigarcia.wdm.WebDriverManager;
import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
import utilities.TestBase;

import java.time.Duration;
import java.util.ArrayList;
import java.util.List;

public class Q04_ExplicitWait extends TestBase {

     /*
                                    - Explicit Wait -
        Selenium’da Explicit Wait, Web Sürücüsüne belirli koşulları (Expected Condition) veya
    “ElementNotVisibleException” exception’ı atmadan önce aşılan maksimum süreyi beklemesini söylemek için kullanılır.
    Akıllı bir bekleme türüdür ancak yalnızca belirli öğeler(elementler) için uygulanabilir.
    Dinamik olarak yüklenen web elementleri beklerken implicit wait’ten daha iyi seçenekler sunar.
        Explicit Wait kullandığımızda, “ExpectedConditions” tanımlamalıyız veya Fluent Wait kullanarak durumu ne
    sıklıkla kontrol etmek istediğimizi yapılandırmalıyız.
Syntax:
      WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(30));
      WebElement element = wait.until(ExpectedConditions.visibilityOfElementLocated(element locator));
     */


    @Test
    public void name() {

        //https://automationfc.github.io/dynamic-loading/ sayfasına gidelim
        //Start button'nuna basalım
        //Hello World! yazısının çıktığını doğrulayalım

        driver.get("https://automationfc.github.io/dynamic-loading/");
        driver.findElement(By.xpath("//button[.='Start']")).click();

        WebElement helloWorldText = driver.findElement(By.xpath("//*[text()='Hello World!']"));

        WebElement loadingText = driver.findElement(By.xpath("//div[@id='loading']"));

        WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(10));   //  waiting time of 'wait...'

        //   wait.until(ExpectedConditions.visibilityOf(helloWorldText));
        wait.until(ExpectedConditions.invisibilityOf(loadingText));

        Assert.assertTrue(helloWorldText.isDisplayed());


    }
}
