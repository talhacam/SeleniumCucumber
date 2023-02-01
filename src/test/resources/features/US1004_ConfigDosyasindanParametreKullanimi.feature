Feature: US1004 Kullanici parametre ile Configuration file'ı kullanabilmeli
@config
  Scenario: TC07 configurations properties dosyasindan parametre kullanimi

    Given kullanici "amazonUrl" anasayfasinda
    Then kullanici 3 sn bekler
    And url'in "amazon" icerdigini test eder
    Then sayfayi kapatir