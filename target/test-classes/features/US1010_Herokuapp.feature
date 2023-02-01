Feature: US1010 herokuapp delete testi
  Scenario: TC15 herokuapp delete butonu calismali
    
    Given kullanici "herkuappUrl" anasayfasinda
    And add element butonuna basar
    Then delete butonu gorunur oluncaya kadar bekler
    And delete butonunun gorunur oldugunu test eder
    Then delete butonuna basar
    And delete butonunun gorunmedigini test eder
    And sayfayi kapatir

