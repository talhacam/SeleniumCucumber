Feature: US1013 kullanici excel bilgilerine ulasir

  Scenario: TC18 kullanici excel bilgilerini kullanir

    Given kullanici excel dosyasini kullanilabilir hale getirir
    Then 1.satirdaki 2.hucreyi yazdirir
    And baskenti Jakarta olan ulke ismini yazdirir
    And Ulke sayisinin 167 oldugunu test eder
    And fiziki olarak kullanılan satir sayisinin 191 oldugunu test eder
