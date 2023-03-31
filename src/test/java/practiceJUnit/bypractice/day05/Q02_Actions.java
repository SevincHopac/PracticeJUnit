package practiceJUnit.bypractice.day05;

import org.junit.Assert;
import org.junit.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import utilities.TestBase;

public class Q02_Actions extends TestBase {


    @Test
    public void test() {

        /*
     -https://jqueryui.com/slider/#colorpicker adrese gidiniz
     -Kutucuk içindeki rengi önce kırmızı sonra sarı yapınız
     -Sarı olduğunu test edelim
     */
        driver.get("https://jqueryui.com/slider/#colorpicker");
        driver.switchTo().frame(0);

        WebElement element3 = driver.findElement(By.xpath("(//span[@tabindex='0'])[3]"));
        WebElement element2 = driver.findElement(By.xpath("(//span[@tabindex='0'])[2]"));

        Actions actions = new Actions(driver);

        actions.dragAndDropBy(element3,-80,0);
        actions.dragAndDropBy(element2,-175,0);  // kirmizi
        actions.dragAndDropBy(element2,300,0).release().build().perform();

        Assert.assertTrue(driver.findElement(By.xpath("//*[@style='background-color: rgb(255, 254, 0);']")).isDisplayed());

    }
}
