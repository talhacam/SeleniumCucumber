package stepDefinitions;

import io.cucumber.java.en.And;
import io.cucumber.java.en.Then;
import org.junit.Assert;
import pages.HMCPage;
import utilities.ConfigReader;

public class HMCStepDefinition {
    HMCPage hmcPage= new HMCPage();

    @Then("Log in yazisina tiklar")
    public void log_in_yazisina_tiklar() {
        hmcPage.loginButonu.click();

    }

    @Then("gecerli username girer")
    public void gecerli_usename_girer() {
        hmcPage.userNameKutusu.sendKeys(ConfigReader.getProperty("userName"));
    }

        @Then("gecerli password girer")
        public void gecerli_password_girer () {
        hmcPage.passwordKutusu.sendKeys(ConfigReader.getProperty("password"));

        }


        @Then("sayfaya giris yaptigini kontrol eder")
        public void sayfaya_giris_yaptigini_kontrol_eder () {
        Assert.assertTrue(hmcPage.hotelManagement.isDisplayed());

        }

    @And("gecersiz password girer")
    public void gecersizPasswordGirer() {
        hmcPage.passwordKutusu.sendKeys(ConfigReader.getProperty("hmcWrongPassword"));


    }

    @And("Login butonuna basar")
    public void loginButonunaBasar() {
        hmcPage.loginButonu2.click();
    }

    @And("sayfaya giris yapilamadigini kontrol eder")
    public void sayfayaGirisYapilamadiginiKontrolEder() {

        Assert.assertTrue(hmcPage.loginButonu2.isDisplayed());
    }

    @Then("gecersiz username girer")
    public void gecersizUsernameGirer() {
        hmcPage.userNameKutusu.sendKeys(ConfigReader.getProperty("hmcWrongUser"));
    }

    @Then("gecersiz username olarak {string}  girer")
    public void gecersizUsernameOlarakGirer(String arg0) {
        hmcPage.userNameKutusu.sendKeys(ConfigReader.getProperty("userName"));
    }

    @And("gecersiz password olarak {string} girer")
    public void gecersizPasswordOlarakGirer(String arg0) {
        hmcPage.passwordKutusu.sendKeys(ConfigReader.getProperty("password"));
    }
}

