package stepDefinitions;

import io.cucumber.java.en.And;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import org.checkerframework.checker.units.qual.C;
import org.junit.Assert;
import org.openqa.selenium.Keys;
import pages.AmazonPage;
import utilities.ConfigReader;
import utilities.Driver;

public class AmazonStepDefinitions {

    AmazonPage amazonPage= new AmazonPage();


    @Given("kullanici amazon anasayfasinda")
    public void kullanici_amazon_anasayfasinda() {

        Driver.getDriver().get(ConfigReader.getProperty("amazonUrl"));
    }

    @Then("kullanici Nutella icin arama yapar")
    public void kullanici_nutella_icin_arama_yapar() {
        amazonPage.aramaKutusu.sendKeys("Nutella"+ Keys.ENTER);

    }
    @Then("sonuclarin Nutella icerdigini test eder")
    public void sonuclarin_nutella_icerdigini_test_eder() {

        String arananKelime= "Nutella";
        String actualAramaSonucStr= amazonPage.aramaSonucuWE.getText();

        Assert.assertTrue(actualAramaSonucStr.contains(arananKelime));

    }

    @Then("kullanici Java icin arama yapar")
    public void kullanici_java_icin_arama_yapar() {
        amazonPage.aramaKutusu.sendKeys("Java"+ Keys.ENTER);

    }

    @Then("sonuclarin Java icerdigini test eder")
    public void sonuclarin_java_icerdigini_test_eder() {
        String arananKelime= "Java";
        String actualAramaSonucStr= amazonPage.aramaSonucuWE.getText();

        Assert.assertTrue(actualAramaSonucStr.contains(arananKelime));
    }
        @Then("sayfayi kapatir")
    public void sayfayi_kapatir() {
        Driver.closeDriver();

    }

    @And("kullanici iphone icin arama yapar")
    public void kullaniciIphoneIcinAramaYapar() {
        amazonPage.aramaKutusu.sendKeys("iphone"+ Keys.ENTER);

    }

    @Then("sonuclarin iphone icerdigini test eder")
    public void sonuclarinIphoneIcerdiginiTestEder() {
        String arananKelime= "iphone";
        String actualAramaSonucStr= amazonPage.aramaSonucuWE.getText();

        Assert.assertTrue(actualAramaSonucStr.contains(arananKelime));
    }

    @Given("kullanici {string} icin arama yapar")
    public void kullanici_icin_arama_yapar(String istenenKelime) {
        amazonPage.aramaKutusu.sendKeys(istenenKelime+ Keys.ENTER);


    }
    @Given("sonuclarin {string} icerdigini test eder")
    public void sonuclarin_icerdigini_test_eder(String istenenKelime) {
        String arananKelime= istenenKelime;
        String actualAramaSonucStr= amazonPage.aramaSonucuWE.getText();

        Assert.assertTrue(actualAramaSonucStr.contains(arananKelime));

    }

    @Given("kullanici {string} anasayfasinda")
    public void kullaniciAnasayfasinda(String istenenUrl) {
        Driver.getDriver().get(ConfigReader.getProperty(istenenUrl));
    }

    @And("url'in {string} icerdigini test eder")
    public void urlInIcerdiginiTestEder(String istenenKelime) {
        String actualUrl= Driver.getDriver().getCurrentUrl();
        Assert.assertTrue(actualUrl.contains(istenenKelime));

    }

    @Then("kullanici {int} sn bekler")
    public void kullaniciSnBekler(int istenenSaniye) {
        try {
            Thread.sleep(istenenSaniye*1000);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
    }
}
