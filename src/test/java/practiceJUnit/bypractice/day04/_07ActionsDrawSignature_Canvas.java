package practiceJUnit.bypractice.day04;

import org.junit.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import utilities.TestBase;

public class _07ActionsDrawSignature_Canvas extends TestBase {

    @Test
    public void test() throws InterruptedException {

        driver.get("http://szimek.github.io/signature_pad/");

        WebElement element = driver.findElement(By.xpath("//canvas"));

        Actions actions = new Actions(driver);
        actions.moveToElement(element).clickAndHold();

        for (int i = 0; i < 10; i++) {
            actions.moveByOffset(5,5);
        }
        for (int i = 0; i < 10; i++) {
            actions.moveByOffset(0,5);
        }
        for (int i = 0; i < 10; i++) {
            actions.moveByOffset(5,0);
        }
        actions.release().build().perform();
        Thread.sleep(5000);
        driver.findElement(By.xpath("//*[text()='Clear']")).click();

    }
}
