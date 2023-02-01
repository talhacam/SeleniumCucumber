#Amazon'a gidip sirasiyla Nutella, JAva, Elma ve Armut aratıp sonuclarin arama yaptigimiz kelimeyi icerdigini test edin
  Feature: US1007 kullanici amazonda istedigi kelimeleri aratir

    Scenario Outline: TC12 amazonda listedeki elementleri aratma
      Given kullanici amazon anasayfasinda
      Then kullanici "<istenenKelime>" icin arama yapar
      And sonuclarin "<istenenKelimeKontrol>" icerdigini test eder
      And sayfayi kapatir

      Examples:
      |istenenKelime|istenenKelimeKontrol|
      |Nutella      |Nutella             |
      |Java         |Java                |
      |Elma         |Elma                |
      |Armut        |Armut               |