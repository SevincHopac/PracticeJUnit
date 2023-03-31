package practiceJUnit.byslack;

import org.junit.Assert;
import org.junit.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import utilities.TestBase;

import java.util.List;

public class Q16_WebTablesEmailPrint extends TestBase {

    @Test
    public void test() {

        ////https://www.way2automation.com/angularjs-protractor/webtables/
        ////tüm E-mail leri yazdırın
        ////Tüm E-maillerin "@" işareti içerdiğini doğrulayin

        driver.get("https://www.way2automation.com/angularjs-protractor/webtables/");
        List<WebElement> elements = driver.findElements(By.xpath("//table//tbody//tr//td[7]"));
        for (WebElement w : elements) {
            System.out.println(w.getText());
            Assert.assertTrue(w.getText().contains("@"));
        }
    }
}
