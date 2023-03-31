package practiceJUnit.bypractice.day05;

import org.junit.Assert;
import org.junit.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
import utilities.TestBase;

import java.time.Duration;
import java.util.List;
import java.util.WeakHashMap;

public class Q01_Calculate extends TestBase {


    @Test
    public void test() {

        //https://bonigarcia.dev/selenium-webdriver-java/slow-calculator.html adresine gidelim
        //Hesap makinasından 2 basamaklı random iki tane sayı seçelim ve random 4 işlemden birini yaptıralım
        //Sonucu konsola yazdırıp
        //Sonucun doğrulamasını yapalım

        driver.get("https://bonigarcia.dev/selenium-webdriver-java/slow-calculator.html");

        int num1 = (int)((Math.random()*9)+1);
        int num2 = (int)(Math.random()*11);
        int num3 = (int)((Math.random()*9)+1);
        int num4 = (int)(Math.random()*11);

        String number1 = ""+num1+num2;
        String number2 = ""+num3+num4;

        double say1 = Double.parseDouble(number1);
        double say2 = Double.parseDouble(number2);

        driver.findElement(By.xpath("//div[@class='keys']//span[text()='"+num1+"']")).click();
        driver.findElement(By.xpath("//div[@class='keys']//span[text()='"+num2+"']")).click();

        waitFor(2);

        List<WebElement> islemler = driver.findElements(By.xpath("//div[@class='keys']//span[@class='operator btn btn-outline-success']"));
        WebElement islem = islemler.get((int)(Math.random()*4));
        islem.click();

        waitFor(2);

        driver.findElement(By.xpath("//div[@class='keys']//span[text()='"+num3+"']")).click();
        driver.findElement(By.xpath("//div[@class='keys']//span[text()='"+num4+"']")).click();

        waitFor(2);

        driver.findElement(By.xpath("//*[@class='keys']//span[@class='btn btn-outline-warning']")).click();

        WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(10));
        wait.until(ExpectedConditions.invisibilityOf(driver.findElement(By.id("spinner"))));

        String result = driver.findElement(By.xpath("//div[@class='screen']")).getText();
        double actualResult = Double.parseDouble(result);


        double expectedResult =0 ;

        switch (islem.getText()){

            case "+": expectedResult=say1+say2; break;
            case "-": expectedResult=say1-say2;  break;
            case "x": expectedResult=say1*say2;  break;
            case "÷": expectedResult=say1/say2;  break;
        }

        Assert.assertEquals(actualResult, expectedResult, 0.0);
    }
}
