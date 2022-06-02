Feature: LCWaikiki Card Page

  Scenario: Sepete Urun Ekleme

    Given Uygulama acilir
    When Arama cubuguna "Ayakkabi" yazilir
    When Ara butonuna tiklanir
    When 3. siradaki ayakkabiya tıklanır
    When Ayakkabi beden olarak 39 secilir
    When Sepete ekleye tiklanir
    When Sepete gidilir
    Then Urunun sepete eklendigi kontrol edilir

