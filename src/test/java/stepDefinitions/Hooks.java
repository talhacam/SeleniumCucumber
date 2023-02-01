package stepDefinitions;

import io.cucumber.java.Scenario;
import io.cucumber.java.After;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import utilities.Driver;

public class Hooks {

    /*
    Cucumber'da step definitions package'i icerisinde @before , @after gibi bir notasyon varsa extends testBase dememize gerek kalmadan
    her scenario'dan önce veya sonra bu methodlar calisacaktir.

    Bu da bizim isteyeceğimiz bir durum değildir.

    Cucumber'da @before , @after kullanma ihtiyacimiz olursa bunu stepdefinitions package'i altında oluşturacağımız
    hooks class'ına koyarız.

    Biz her scenario'dan sonra test sonucunu kontrol edip failed olan scenario'lar için screenshot alması amacıyla
    @After method'u kullanacağız.
     */

    @After
    public void tearDown (Scenario scenario){
        final byte[] screenshot= ((TakesScreenshot) Driver.getDriver()).getScreenshotAs(OutputType.BYTES);
        if (scenario.isFailed()){
            scenario.attach(screenshot, "image/png", "screenshots");
        }
        Driver.closeDriver();
    }
}
