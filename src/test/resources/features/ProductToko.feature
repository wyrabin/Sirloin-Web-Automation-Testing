@ProductToko @Positive @Capstone
Feature: Product Toko

  @ProductToko @Positive @Capstone
  Scenario: Verify menu home
    Given user on the sirloinPOS website
    When user login with input "mukhlisanshori1997@gmail.com" as email and "Mukhlis11111" as password
    And verify succes login title "Berhasil Login"
    Then user should be "Product Toko" page

  @ProductToko @Positive @Capstone
  Scenario: user search item product
    Given user on the sirloinPOS website
    When user login with input "mukhlisanshori1997@gmail.com" as email and "Mukhlis11111" as password
    And verify succes login title "Berhasil Login"
    Then user should be "Product Toko" page
    When user click search barang
    And user input barang  "kecap"
    Then user see all result search product on dashboard

  @ProductToko @Positive @Capstone
  Scenario: user can click product item
    Given user on the sirloinPOS website
    When user login with input "mukhlisanshori1997@gmail.com" as email and "Mukhlis11111" as password
    And verify succes login title "Berhasil Login"
    Then user should be "Product Toko" page
    And user click product item
    And user click product item2

  @ProductToko @Positive @Capstone
  Scenario: user can click button + and -
    Given user on the sirloinPOS website
    When user login with input "mukhlisanshori1997@gmail.com" as email and "Mukhlis11111" as password
    And verify succes login title "Berhasil Login"
    Then user should be "Product Toko" page
    And user click product item
    And user click product item2
    And verify product item on keranjang
    And user click button increment twenty items
    And user click button decrement ten items

  @ProductToko @Positive @Capstone
  Scenario: user can delete product
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

#  Scenario: user can delete product
#    Given user on the sirloinPOS website
#    When user login with input "mukhlisanshori1997@gmail.com" as email and "Mukhlis11111" as password
#    And verify succes login title "Berhasil Login"
#    Then user should be "Product Toko" page
#    And user click product item
#    And user click product item2
#    And verify product item on keranjang
#    And user click button increment twenty items
#    And user click button decrement ten items
#    Then user delete item in list keranjang

  @ProductToko @Positive @Capstone
  Scenario: user can buying item product from product toko
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

  @ProductToko @Positive @Capstone
  Scenario: user input menambahkan cart quantity manual
    Given user on the sirloinPOS website
    When user login with input "mukhlisanshori1997@gmail.com" as email and "Mukhlis11111" as password
    And verify succes login title "Berhasil Login"
    Then user should be "Product Toko" page
    And user click product item
    And user click product item2
    And verify product item on keranjang
    When user click cart quantity field
    And user input cart quantity "15"

  @ProductToko @Positive @Capstone
  Scenario: user can discount member
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

  @ProductToko @Positive @Capstone
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