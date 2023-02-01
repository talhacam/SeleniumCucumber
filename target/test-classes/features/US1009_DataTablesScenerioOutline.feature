Feature: US1009 Datatables sitesine 5 farklı giris yapalim
  @datatables
  Scenario Outline: TC14 kullanici 5 farkli kayit girisi yapabilmeli
    When kullanici "dataTablesUrl" anasayfasinda
    Then new butonuna basar
    And firstname bölümüne "<firstname>" yazar
    And kullanici 1 sn bekler
    And lastname bölümüne "<lastname>" yazar
    And kullanici 1 sn bekler
    And position bölümüne "<position>" yazar
    And kullanici 1 sn bekler
    And office bölümüne "<office>" yazar
    And kullanici 1 sn bekler
    And extension bölümüne "<extension>" yazar
    And kullanici 1 sn bekler
    And startDate bölümüne "<startDate>" yazar
    And kullanici 1 sn bekler
    And salary bölümüne "<salary>" yazar
    And kullanici 1 sn bekler
    And Create tusuna basar
    When kullanici "<firstname>" ile arama yapar
    And kullanici 1 sn bekler
    Then isim bolumunde "<firstname>" oldugunu test eder
    And sayfayi kapatir

    Examples:
    |firstname| lastname| position| office| extension| startDate| salary|
    |Alim     |Alim     |qa       |ankara |UI        |2021-10-11|10000  |
    |Berk     |Can      |tester   |ankara |api       |2022-05-05|11000  |
    |Huseyin  |Kacmaz   |BA       |berlin |-         |2022-07-10|40000  |
    |Fatih    |Sahin    |PO       |berlin |-         |2022-03-12|45000  |
    |Ahmet    |Kaya     |Tester   |ankara |database  |2022-06-06|11000  |