package practiceJUnit.bypractice.day06;

import org.apache.commons.io.FileUtils;
import org.junit.Test;
import org.openqa.selenium.*;
import utilities.TestBase;

import java.io.File;
import java.io.IOException;
import java.text.SimpleDateFormat;

import java.util.Date;

import java.util.Set;

public class Q06_ScreenshotBen extends TestBase {


    @Test
    public void name() throws IOException {

        //Amazon sayfasına gidelim
        //Tüm sayfanın resmini alalım
        //Yeni bir sekmede techproeducation sayfasına gidip sayfanın resmini alalım
        //Tekrar amazon sayfasına dönüp iphone aratalım
        //Arama sonucunun resmini alalım

//Slayt
        driver.get("https://amazon.com");

        String currentDate = new SimpleDateFormat("yyyy.mm.dd--hh.mm.ss").format(new Date());

        TakesScreenshot takesScreenshot = (TakesScreenshot) driver;

        File targetFile = new File("test-output/screenshots/"+currentDate+"image.png");

        File temporaryImgFile = takesScreenshot.getScreenshotAs(OutputType.FILE);

        FileUtils.copyFile(temporaryImgFile,targetFile);

        //----------------------------------

        driver.switchTo().newWindow(WindowType.TAB);
        driver.get("https://techproeducation.com");
        waitFor(6);

//AhmetH.

        File sourceFile = ((TakesScreenshot)driver).getScreenshotAs(OutputType.FILE);

        System.out.println("user.dir -->> "+System.getProperty("user.dir"));
        String path = System.getProperty("user.dir")+"/test-output/screenshots/"+currentDate+"img.png";

        File targetFile1 = new File(path);

        FileUtils.copyFile(sourceFile,targetFile1);


        //------------------------------------------------------


        Set<String> allWindowHandles = driver.getWindowHandles();
        driver.switchTo().window(allWindowHandles.stream().findFirst().get());

        /*   2.yol

        List<String> allWindow = new ArrayList<>(driver.getWindowHandles());
        driver.switchTo().window(allWindow.get(0));
*/

        driver.findElement(By.id("twotabsearchtextbox")).sendKeys("iphone"+ Keys.ENTER);
        WebElement element = driver.findElement(By.xpath("//span[@data-component-type='s-result-info-bar']"));

        takeScreenshotOfElement(element);

    }
}
