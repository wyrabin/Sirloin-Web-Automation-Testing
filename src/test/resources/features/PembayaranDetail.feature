@Pembayaran @Capstone @Positive
Feature: Pembayaran Detail

  @Pembayaran @Capstone @Positive
  Scenario: Verify menu home
    Given user on the sirloinPOS website
    When user login with input "mukhlisanshori1997@gmail.com" as email and "Mukhlis11111" as password
    And verify succes login title "Berhasil Login"
    Then user should be "Product Toko" page

  @Pembayaran @Capstone @Positive
  Scenario: user will see detai pembayaran
    Given user on the sirloinPOS website
    When user login with input "mukhlisanshori1997@gmail.com" as email and "Mukhlis11111" as password
    And verify succes login title "Berhasil Login"
    Then user should be "Product Toko" page
    And user click product item
    And user click product item2
    And verify product item on keranjang
    And user click button increment twenty items
    And user click button decrement ten items
    Then user delete item in list keranjang
    When user click member field
    And user input member "18"
    Then user click member button
    And user verify value sub total, diskon member, total belanja
    And user click bayar button
    Then user redirect to "Pembayaran Detail" page

  @Pembayaran @Capstone @Positive
  Scenario: user will ordering product
    Given user on the sirloinPOS website
    When user login with input "mukhlisanshori1997@gmail.com" as email and "Mukhlis11111" as password
    And verify succes login title "Berhasil Login"
    Then user should be "Product Toko" page
    And user click product item
    And user click product item2
    And verify product item on keranjang
    And user click button increment twenty items
    And user click button decrement ten items
    Then user delete item in list keranjang
    When user click member field
    And user input member "18"
    Then user click member button
    And user verify value sub total, diskon member, total belanja
    And user click bayar button
    Then user redirect to "Pembayaran Detail" page
    And user verify nama product, qty, harga
    And user verify total belanja product, diskon member, total belanja


  @Pembayaran @Capstone @Positive
  Scenario: user will payment with tunai
    Given user on the sirloinPOS website
    When user login with input "mukhlisanshori1997@gmail.com" as email and "Mukhlis11111" as password
    And verify succes login title "Berhasil Login"
    Then user should be "Product Toko" page
    And user click product item
    And user click product item2
    And verify product item on keranjang
    And user click button increment twenty items
    And user click button decrement ten items
    Then user delete item in list keranjang
    When user click member field
    And user input member "18"
    Then user click member button
    And user verify value sub total, diskon member, total belanja
    And user click bayar button
    Then user redirect to "Pembayaran Detail" page
    And user verify nama product, qty, harga
    And user verify total belanja product, diskon member, total belanja
    And user sort pembayaran list by tunai
    Then user click button bayar
    Then see modal successfully
    When click OK button modal

  @Pembayaran @Capstone @Positive
  Scenario: user will payment with gris
    Given user on the sirloinPOS website
    When user login with input "mukhlisanshori1997@gmail.com" as email and "Mukhlis11111" as password
    And verify succes login title "Berhasil Login"
    Then user should be "Product Toko" page
    And user click product item
    And user click product item2
    And verify product item on keranjang
    And user click button increment twenty items
    And user click button decrement ten items
    Then user delete item in list keranjang
    When user click member field
    And user input member "18"
    Then user click member button
    And user verify value sub total, diskon member, total belanja
    And user click bayar button
    Then user redirect to "Pembayaran Detail" page
    And user verify nama product, qty, harga
    And user verify total belanja product, diskon member, total belanja
    And user sort pembayaran list by qris
    Then user click button bayar
    Then see modal scan barcode

  @Pembayaran @Capstone @Positive
  Scenario: user will payment with gopay
    Given user on the sirloinPOS website
    When user login with input "mukhlisanshori1997@gmail.com" as email and "Mukhlis11111" as password
    And verify succes login title "Berhasil Login"
    Then user should be "Product Toko" page
    And user click product item
    And user click product item2
    And verify product item on keranjang
    And user click button increment twenty items
    And user click button decrement ten items
    Then user delete item in list keranjang
    When user click member field
    And user input member "18"
    Then user click member button
    And user verify value sub total, diskon member, total belanja
    And user click bayar button
    Then user redirect to "Pembayaran Detail" page
    And user verify nama product, qty, harga
    And user verify total belanja product, diskon member, total belanja
    And user sort pembayaran list by gopay
    Then user click button bayar
    Then see modal scan barcode

  @Pembayaran @Capstone @Positive
  Scenario: user will payment with shopeepay
    Given user on the sirloinPOS website
    When user login with input "mukhlisanshori1997@gmail.com" as email and "Mukhlis11111" as password
    And verify succes login title "Berhasil Login"
    Then user should be "Product Toko" page
    And user click product item
    And user click product item2
    And verify product item on keranjang
    And user click button increment twenty items
    And user click button decrement ten items
    Then user delete item in list keranjang
    When user click member field
    And user input member "18"
    Then user click member button
    And user verify value sub total, diskon member, total belanja
    And user click bayar button
    Then user redirect to "Pembayaran Detail" page
    And user verify nama product, qty, harga
    And user verify total belanja product, diskon member, total belanja
    And user sort pembayaran list by shopeepay
    Then user click button bayar
    Then see modal scan barcode

  @Pembayaran @Capstone @Negative
  Scenario: user orders more product items than stock items
    Given user on the sirloinPOS website
    When user login with input "mukhlisanshori1997@gmail.com" as email and "Mukhlis11111" as password
    And verify succes login title "Berhasil Login"
    Then user should be "Product Toko" page
    And user click product item
    And verify product item on keranjang
    And user input value quantity product is "90"
    When user click member field
    And user input member "18"
    Then user click member button
    And user verify value sub total, diskon member, total belanja
    And user click bayar button
    Then user redirect to "Pembayaran Detail" page
    And user verify nama product, qty, harga
    And user verify total belanja product, diskon member, total belanja
    And user sort pembayaran list by tunai
    Then user click button bayar
    Then see modal gagal quantity is not enough
    When click OK button modal gagal payment



