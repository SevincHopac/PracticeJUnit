package practiceJUnit.byslack;

import org.junit.Assert;
import org.junit.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebElement;
import utilities.TestBase;

import java.util.List;
import java.util.stream.Collectors;

public class Q13_IphoneAmazon extends TestBase {

    @Test
    public void test() {

        //Go to 'https://www.amazon.com.tr/'
        driver.get("https://amazon.com.tr/");

        //Search iPhone13 512
        driver.findElement(By.id("twotabsearchtextbox")).sendKeys("iPhone13 512", Keys.ENTER);

        waitFor(3);
        driver.findElement(By.id("sp-cc-accept")).click();

        //Check that the results are listed
        WebElement result = driver.findElement(By.xpath("//div[@class='a-section a-spacing-small a-spacing-top-small']"));
        Assert.assertTrue(result.isDisplayed());

        //Click iPhone13 at the top of the list
        List<WebElement> products = driver.findElements(By.xpath("//*[@class='a-size-base-plus a-color-base a-text-normal']"));

        List<String> names = products.stream().map(WebElement::getText).filter(t -> t.contains("iPhone 13 (512 GB)")).collect(Collectors.toList());
        Assert.assertTrue(names.size() > 0);

        getInfoAndPrint();
        getInfoOf128Gb();
        getInfoOf256Gb();

    }

    public static void getInfoOf256Gb() {
        getWebElByXpath("//*[@id='size_name_1-announce']").click();
        waitFor(3);
        getInfoAndPrint();
    }
    public static void getInfoOf128Gb() {
        getWebElByXpath("//*[@id='size_name_0-announce']").click();
        waitFor(3);
        getInfoAndPrint();
    }

    public static void getInfoAndPrint(){
        proNamePrint();
        sizePrint();
        colorNamePrint();
        getPricePrint();
        stockPrint();
        System.out.println("------------------");
    }

    public static void stockPrint(){
        String stock = driver.findElement(By.xpath("//*[@class='a-size-medium a-color-success']")).getText();
        System.out.println("Stock: " + stock);
    }


    public static void sizePrint(){
        String size = driver.findElement(By.id("inline-twister-dim-title-size_name")).getText();
        System.out.println(size);
    }

    public static void colorNamePrint(){
        String color = driver.findElement(By.id("inline-twister-dim-title-color_name")).getText();
        System.out.println(color);
    }

    public static void proNamePrint() {
        String title = driver.findElement(By.id("productTitle")).getText();
        System.out.println("Product Name = " + title);
    }

    public static void getPricePrint() {

        String price = driver.findElement(By.xpath("//div[@class='a-section a-spacing-none aok-align-center']")).getText();
        String[] arr = price.split("\n");

        if (arr.length == 2) {
            price = arr[0] + "." + arr[1];
            System.out.println("Price = " + price);
        } else if (arr.length == 3) {
            price = arr[1] + "." + arr[2];
            System.out.println("Price = " + price);
        }
    }

}
