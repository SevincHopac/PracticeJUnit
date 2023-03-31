package practiceJUnit.byinstruction;

import org.junit.Assert;
import org.junit.BeforeClass;
import org.junit.Ignore;
import org.junit.Test;
import org.openqa.selenium.*;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.Select;
import utilities.TestBase;

import java.time.Duration;
import java.util.ArrayList;
import java.util.List;
import java.util.stream.Collectors;

import static org.openqa.selenium.support.locators.RelativeLocator.with;

public class Q05_AmazonTests {

    static WebDriver driver;
    static List<String> listCart = new ArrayList<>();
    static List<String> listProduct = new ArrayList<>();


    @BeforeClass
    public static void setUp() {

        driver = new ChromeDriver();
        driver.manage().window().maximize();
        driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(20));
        driver.get("https://amazon.com");
    }


    @Test
    public void test01() {


        //Arama kutusunun solundaki dropdown menuyu handle edip listesini ekrana yazdırın
        WebElement element = driver.findElement(By.id("searchDropdownBox"));
        Select select = new Select(element);
        List<WebElement> optionsList = select.getOptions();

        optionsList.stream().forEach(t -> System.out.println(t.getText() + " "));

        //dropdown menude 28 eleman olduğunu doğrulayın
        Assert.assertEquals(28, optionsList.size());

    }

    @Test
    public void test02() throws InterruptedException {


        //dropdown menuden elektronik bölümü seçin
        WebElement element = driver.findElement(By.id("searchDropdownBox"));
        Select select = new Select(element);
        select.selectByVisibleText("Electronics");

        //arama kutusuna iphone yazip aratin ve bulunan sonuç sayısını yazdırın
        driver.findElement(By.id("twotabsearchtextbox")).sendKeys("iphone", Keys.ENTER);

        //sonuc sayisi bildiren yazinin iphone icerdigini test edin
        String text = driver.findElement(By.xpath("//*[@class='a-section a-spacing-small a-spacing-top-small']")).getText();
        Assert.assertTrue(text.contains("iphone"));

        //ikinci ürüne relative locater kullanarak tıklayin
        WebElement element1 = driver.findElement(By.xpath("(//span[@class='a-size-base-plus a-color-base a-text-normal'])[1]"));
        WebElement element3 = driver.findElement(By.xpath("(//span[@class='a-size-base-plus a-color-base a-text-normal'])[3]"));
        WebElement element2 = driver.findElement(with(By.tagName("span")).toLeftOf(element3).toRightOf(element1));
        element2.click();
        Thread.sleep(3000);


        //ürünün title'ni ve fiyatını variable’a  assign edip ürünü sepete ekleyelim
        proName();
        getPricePrint();
        addToCartPro();

    }

    @Test
    public void test03() {

        //yeni bir sekme açarak amazon anasayfaya gidin
        driver.switchTo().newWindow(WindowType.TAB);
        driver.get("https://amazon.com");

        //dropdown’dan bebek bölümüne secin
        WebElement element = driver.findElement(By.id("searchDropdownBox"));
        Select select = new Select(element);
        select.selectByVisibleText("Baby");

        //bebek puset aratıp bulundan sonuç sayısını yazdırın
        driver.findElement(By.id("twotabsearchtextbox")).sendKeys("bebek puset", Keys.ENTER);
        String text = driver.findElement(By.xpath("//*[@class='a-section a-spacing-small a-spacing-top-small']")).getText();
        String[] result = text.split(" ");
        System.out.println("result: " + result[2]);

        //sonuç yazsının puset içerdiğini test edin
        Assert.assertTrue(text.contains("puset"));

        //5-üçüncü ürüne relative locater kullanarak tıklayin
        Actions actions = new Actions(driver);
        actions.sendKeys(Keys.PAGE_DOWN).perform();

        WebElement element1 = driver.findElement(By.xpath("//*[@data-image-index='1']"));
        WebElement element3 = driver.findElement(By.xpath("//*[@data-image-index='3']"));
        WebElement element2 =driver.findElement(with(By.tagName("img")).below(element1).above(element3));

/*
      WebElement firstProduct = driver.findElement(By.xpath("//*[@cel_widget_id='MAIN-SEARCH_RESULTS-1']"));    Selenium4  **************************************************
        secondProduct = RelativeLocator.with(By.tagName("div")).toRightOf(firstProduct);
        driver.findElement(secondProduct).click();
*/

        //6-title ve fiyat bilgilerini assign edelim ve ürünü sepete ekleyin
        proName();
        getPricePrint();
        addToCartPro();

    }


    @Test
    public void test04() {

        // Test 4

        //1-sepetteki ürünlerle eklediğimiz ürünlerin aynı olduğunu isim ve fiyat olarak doğrulayın

        driver.findElement(By.id("nav-cart-text-container")).click();
        List<WebElement> elements = driver.findElements(By.xpath("//li[@class='a-spacing-mini']"));

        List<String> list= elements.stream().map(WebElement::getText).collect(Collectors.toList());
        System.out.println("listCart = " + listCart);

        for (int i = elements.size()-1; i >= 0 ; i--) {
            listCart.add(list.get(i).substring(0,20));
        }

        for (int i = 0; i < listProduct.size(); i++) {
            Assert.assertTrue(listProduct.get(i).contains(listCart.get(i)));
        }


    }

    public static void addToCartPro() {
        driver.findElement(By.id("add-to-cart-button")).click();
    }

    public static void proName() {
        String title = driver.findElement(By.id("productTitle")).getText();
        System.out.println("Product Name = " + title);
        listProduct.add(title);
    }

    public static void getPricePrint() {

        String price = driver.findElement(By.xpath("//div[@class='a-section a-spacing-none aok-align-center']")).getText();
        String[] arr = price.split("\n");

        if (arr.length == 2) {
            price = arr[0] + "." + arr[1];
            System.out.println("Product Price = " + price);
        } else if (arr.length == 3) {
            price = arr[1] + "." + arr[2];
            System.out.println("Product Price = " + price);
        }
    }
}
