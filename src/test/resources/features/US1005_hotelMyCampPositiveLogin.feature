Feature: US1005 dogru kullanici adi ve sifre ile giris yapilabilmeli

  @hmc
  Scenario: TC08 positive login test
    Given kullanici "hotelMyCampUrl" anasayfasinda
    Then Log in yazisina tiklar
    And gecerli usename girer
    And gecerli password girer
    And Login butonuna basar
    Then sayfaya giris yaptigini kontrol eder
    And sayfayi kapatir
