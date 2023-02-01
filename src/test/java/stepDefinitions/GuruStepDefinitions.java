package stepDefinitions;

import io.cucumber.java.en.And;
import io.cucumber.java.en.Given;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import pages.GuruPage;
import utilities.Driver;

import java.util.List;

public class GuruStepDefinitions {
    GuruPage guruPage = new GuruPage();

    @Given("{string}, sutunundaki tum degerleri yazdirir")
    public void sutunundaki_tum_degerleri_yazdirir (String istenenSutun) {

        List<WebElement> tabloBaslikListesi = guruPage.baslikListesi;
        //listemiz webelementlerden oluşuyor. Dolayısıyla bu webelementlerden hangisi istenen sutun baslığını tasıyor bilemeyiz.

        int istenenBaslikIndexi = -3;
        for (int i = 0; i < tabloBaslikListesi.size(); i++) {
            if (tabloBaslikListesi.get(i).getText().equals(istenenSutun)) {
                istenenBaslikIndexi = i+1;
                break;
            }

        }
        // for loop ile tum sutuun baslıklarını bana verilen istenensutun degeri ile karsılastırdım.
        //loop bittiğinde baslıgın bulunup bulunamadığını kontrol etmek ve bulundu ise yoluna devam etmek istiyorum.

        if (istenenBaslikIndexi != -3) { //baslık bulundu

            List<WebElement> istenenSutundakiElementler =
                    Driver.getDriver().findElements(By.xpath("//tbody//tr//td[" + istenenBaslikIndexi + "]"));
            for (WebElement each : istenenSutundakiElementler
            ) {
                System.out.println(each.getText());

            }

        } else { //baslık bulunamadı
            System.out.println("istenen baslik bulunamadı");
        }
    }
}
