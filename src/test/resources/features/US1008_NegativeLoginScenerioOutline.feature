Feature: US1008 kullanici farkli yanlis sifre ve kullanici adiyle giris yapamaz

  Scenario Outline: TC13 yanlis sifre ve kullanici adiyle giris yapilamaz
    Given kullanici "hotelMyCampUrl" anasayfasinda
    Then Log in yazisina tiklar
    Then gecersiz username olarak "<username>"  girer
    And gecersiz password olarak "<password>" girer
    Then Login butonuna basar
    And sayfaya giris yapilamadigini kontrol eder
    And sayfayi kapatir

    Examples:
    |username|password|
    |Manager5|Manager5!|
    |Manager6|Manager6!|
    |Manager7|Manager7!|
    |Manager8|Manager8!|
    |Manager9|Manager9!|