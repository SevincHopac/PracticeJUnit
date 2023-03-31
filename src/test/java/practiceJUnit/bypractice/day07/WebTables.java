package practiceJUnit.bypractice.day03.day07;

import org.junit.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import utilities.TestBase;

import java.util.List;
import java.util.concurrent.atomic.AtomicInteger;

public class WebTables extends TestBase {


    @Test
    public void name() {

        //https://www.techlistic.com/p/demo-selenium-practice.html adresine gidelim
        driver.get("https://www.techlistic.com/p/demo-selenium-practice.html");

        //Demo Table altındaki tablodaki otel bilgilerini yazdırınız
        List<WebElement> rows = driver.findElements(By.xpath("//*[@border='1']//tbody/tr"));
        rows.forEach(t -> System.out.println(t.getText()));

        //Demo Table altındaki otel bilgileri olan tablodan Height değeri 601m olan otelin bilgilerini yazdırınız
        for (WebElement w : rows) {
            if (w.getText().contains("601m")) {
                System.out.println("--> " + w.getText());
            }
        }


  /*   System.out.println(driver.findElements(By.xpath("//*[@border='1']//tbody/tr")).
             stream().
             filter(t -> t.getText().contains("601m")).
             findFirst().
             get().
             getText());

        */


        //Bütün Height bilgilerini yazdırınız
        driver.findElements(By.xpath("//*[@border='1']//tbody//tr//td[3]")).forEach(t -> System.out.println(t.getText()));


        //Otel uzunluklarının hepsini toplayınız

        AtomicInteger sum = new AtomicInteger();
        driver.findElements
                        (By.xpath("//*[@border='1']//tbody//tr//td[3]")).
                forEach(t -> sum.addAndGet(Integer.parseInt(t.getText().
                        replaceAll("m", ""))));

        System.out.println(sum);


/*      Hakan bey
        int heightSum = 0;
        for (WebElement w : heightInfo) {
            heightSum += Integer.parseInt(w.getText().replace("m", ""));
        }
        System.out.println("heightSum = " + heightSum);
*/


        //Bir method ile satır ve sutun bilgilerini çağıralım

        tabloSatirSutun(3, 4);
    }

    private void tabloSatirSutun(int satir, int sutun) {
        System.out.println(satir + " . satir " + sutun + " . sutun bilgisi : " +
                driver.findElement(By.xpath("//*[@class='tsc_table_s13']//tbody//tr[" + satir + "]//td[" + sutun + "]")).getText());
    }
}
