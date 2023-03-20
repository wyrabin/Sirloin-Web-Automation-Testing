Feature: Feature History Belanja
  @History @Positive @Capstone
  Scenario: Verify menu history belanja is enable
    Given user on the sirloinPOS website
    When user login with input "mukhlisanshori1997@gmail.com" as email and "Mukhlis11111" as password
    And verify succes login title "Berhasil Login"
    Then user click menu history pembelanjaan
    And user shouldbe on "History Belanja Product"

  @History @Positive @Capstone
  Scenario: Verify date showing data history belanja product
    Given user on the sirloinPOS website
    When user login with input "mukhlisanshori1997@gmail.com" as email and "Mukhlis11111" as password
    And verify succes login title "Berhasil Login"
    Then user click menu history pembelanjaan
    And user shouldbe on "History Belanja Product"
    And user set date from "2023-02-01"
    And user set date until "2023-02-08"
    Then user click tampilkan data product

  @History @Positive @Capstone
  Scenario: Verify detail tansaction has ben displayed on list transaction
    Given user on the sirloinPOS website
    When user login with input "mukhlisanshori1997@gmail.com" as email and "Mukhlis11111" as password
    And verify succes login title "Berhasil Login"
    Then user click menu history pembelanjaan
    And user shouldbe on "History Belanja Product"
    And user set date from "2023-02-01"
    And user set date until "2023-02-08"
    Then user click tampilkan data product
    And transaction is displayed

  @History @Positive @Capstone
  Scenario: Verify detail payment tansaction has ben displayed
    Given user on the sirloinPOS website
    When user login with input "mukhlisanshori1997@gmail.com" as email and "Mukhlis11111" as password
    And verify succes login title "Berhasil Login"
    Then user click menu history pembelanjaan
    And user shouldbe on "History Belanja Product"
    And user set date from "2023-02-01"
    And user set date until "2023-02-08"
    Then user click tampilkan data product
    And user get value total belanja produk sukses
    And user get value total belanja product

  @History @Positive @Capstone
  Scenario: Verify button print is enabled
    Given user on the sirloinPOS website
    When user login with input "mukhlisanshori1997@gmail.com" as email and "Mukhlis11111" as password
    And verify succes login title "Berhasil Login"
    Then user click menu history pembelanjaan
    And user shouldbe on "History Belanja Product"
    And user set date from "2023-02-01"
    And user set date until "2023-02-08"
    Then user click tampilkan data product
    And user click print button

  @History @Positive @Capstone
  Scenario: Verify detail transaction is enabled
    Given user on the sirloinPOS website
    When user login with input "mukhlisanshori1997@gmail.com" as email and "Mukhlis11111" as password
    And verify succes login title "Berhasil Login"
    Then user click menu history pembelanjaan
    And user shouldbe on "History Belanja Product"
    And user set date from "2023-02-01"
    And user set date until "2023-02-10"
    Then user click tampilkan data product
    And click detail transaction payment
    And user verify on "Detail Transaksi" history belanja page

  @History @Positive @Capstone
  Scenario: Verify detail transaction is valid
    Given user on the sirloinPOS website
    When user login with input "mukhlisanshori1997@gmail.com" as email and "Mukhlis11111" as password
    And verify succes login title "Berhasil Login"
    Then user click menu history pembelanjaan
    And user shouldbe on "History Belanja Product"
    And user set date from "2023-02-01"
    And user set date until "2023-02-10"
    Then user click tampilkan data product
    And user get status transaction payment
    And user get code invoice on list history
    And user get date invoice on list history
    And click detail transaction payment
    And user verify on "Detail Transaksi" history belanja page
    Then user verify status transaction
    And user verify code invoice on detail transaction
    And user verify date invoice on detail transaction
    And user verify history product is valid
    Then user verify total payment product
    And user click button kembali on detail transaction
    And user shouldbe on "History Belanja Product"
