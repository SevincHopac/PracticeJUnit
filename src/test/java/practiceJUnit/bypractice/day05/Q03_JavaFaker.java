package practiceJUnit.bypractice.day05;

import com.github.javafaker.Faker;
import org.junit.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebElement;
import utilities.TestBase;

public class Q03_JavaFaker extends TestBase {


    @Test
    public void name() {

        //"https://demoqa.com/automation-practice-form"  Adresine gidin
        // Formu doldurunuz
        // Sayfayi kapatin

        Faker faker = new Faker();
        driver.get("https://demoqa.com/automation-practice-form");
        WebElement firstName = driver.findElement(By.id("firstName"));
        firstName.sendKeys(
                faker.name().firstName(),Keys.TAB,
                faker.name().lastName(),Keys.TAB,
                faker.internet().emailAddress(),Keys.TAB,
                Keys.ARROW_RIGHT,Keys.TAB,
                faker.phoneNumber().subscriberNumber(10),Keys.TAB,
                faker.date().birthday().toString(),Keys.ENTER,Keys.TAB,
                faker.shakespeare().romeoAndJulietQuote(),Keys.TAB,Keys.SPACE);

        WebElement fileupload = driver.findElement(By.xpath("//input[@type='file']"));

        String filePath = "C:\\Users\\sevin\\OneDrive\\Desktop\\logo (1).jpeg";
        fileupload.sendKeys(filePath);

        String userHome = System.getProperty("user.home");
        System.out.println("userHome = " + userHome);
        String userDir = System.getProperty("user.dir");
        System.out.println("userDir = " + userDir);


       //div[@class='subjects-auto-complete__value-container subjects-auto-complete__value-container--is-multi css-1hwfws3']
    }
}
