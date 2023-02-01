package stepDefinitions;

import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import org.junit.Assert;
import pages.DataTablesPage;
public class DataTablesStepDefinitions {
DataTablesPage dataTablesPage= new DataTablesPage();
    @Then("new butonuna basar")
    public void new_butonuna_basar() {
        dataTablesPage.newButonu.click();


    }
    @Then("firstname bölümüne {string} yazar")
    public void firstname_bölümüne_yazar(String firstname) {
        dataTablesPage.firstName.sendKeys(firstname);

    }
    @Then("lastname bölümüne {string} yazar")
    public void lastname_bölümüne_yazar(String lastname) {
        dataTablesPage.lastName.sendKeys(lastname);

    }
    @Then("position bölümüne {string} yazar")
    public void position_bölümüne_yazar(String position) {
        dataTablesPage.position.sendKeys(position);

    }
    @Then("office bölümüne {string} yazar")
    public void office_bölümüne_yazar(String office) {
        dataTablesPage.office.sendKeys(office);


    }
    @Then("extension bölümüne {string} yazar")
    public void extension_bölümüne_yazar(String extension) {
        dataTablesPage.extn.sendKeys(extension);

    }
    @Then("startDate bölümüne {string} yazar")
    public void start_date_bölümüne_yazar(String startDate) {
        dataTablesPage.startDate.sendKeys(startDate);

    }
    @Then("salary bölümüne {string} yazar")
    public void salary_bölümüne_yazar(String salary) {
        dataTablesPage.salary.sendKeys(salary);

    }
    @Then("Create tusuna basar")
    public void create_tusuna_basar() {
        dataTablesPage.create.click();

    }

    @When("kullanici {string} ile arama yapar")
    public void kullaniciIleAramaYapar(String firstname) {
        dataTablesPage.search.sendKeys(firstname);

    }


    @Then("isim bolumunde {string} oldugunu test eder")
    public void isimBolumundeOldugunuTestEder(String firstname) {
        Assert.assertTrue(dataTablesPage.aramaSonucIlkElement.getText().contains(firstname));
    }
}
