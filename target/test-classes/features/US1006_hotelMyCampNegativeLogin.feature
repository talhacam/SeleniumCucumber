#hotelMyCampUrl'de 3 adet negative test senaryosu oluşturalım
  #1- doğru username yanlış password
  #2- yanlış username Doğru password
  #3- YANLış username yanlış password

  Feature: US1006 yanlıs bilgilerle siteye giris yapilamaz

    Scenario: TC09 yanlis password ile giris yapilamaz
      Given kullanici "hotelMyCampUrl" anasayfasinda
      Then Log in yazisina tiklar
      Then gecerli username girer
      And gecersiz password girer
      Then Login butonuna basar
      And sayfaya giris yapilamadigini kontrol eder
      And sayfayi kapatir


      Scenario: TC10 yanlis kullanici adiyle giris yapilamaz
        Given kullanici "hotelMyCampUrl" anasayfasinda
        Then Log in yazisina tiklar
        Then gecersiz username girer
        And gecerli password girer
        Then Login butonuna basar
        And sayfaya giris yapilamadigini kontrol eder
        And sayfayi kapatir


        Scenario: TC11 yanlis kullanici adi ve yanlis sifreyle giris yapilamaz
          Given kullanici "hotelMyCampUrl" anasayfasinda
          Then Log in yazisina tiklar
          Then gecersiz username girer
          And gecersiz password girer
          Then Login butonuna basar
          And sayfaya giris yapilamadigini kontrol eder
          And sayfayi kapatir