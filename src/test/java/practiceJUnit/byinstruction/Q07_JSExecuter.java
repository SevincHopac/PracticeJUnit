package practiceJUnit.byinstruction;

import org.junit.Test;
import utilities.TestBase;

public class Q07_JSExecuter extends TestBase {

    @Test
    public void jsExecuterTest01() {

        // When user goes to https://jqueryui.com/accordion/
        // And user clicks on Selection2 accordion
        // Verify the text contains "Sed non urna."
    }

    @Test
    public void jsExecuterTest02() {

        // When user goes to https://jqueryui.com/datepicker/
        // And select the next date of the current date

    }

    @Test
    public void jsExecuterTest03(){

        // When user goes to https://jqueryui.com/toggle/
        //Print text
        // Then click on Run Effect button
        //Then print the text and verify it is empty
        //Then click on Run Effect button one more time
        //Print the text that should be : Etiam libero....,mi.

    }

    @Test
    public void jsExecuterTest04() {

        // When user goes to https://jqueryui.com/autocomplete/
        // And type Apple
        // Then select Applescript
    }
}
