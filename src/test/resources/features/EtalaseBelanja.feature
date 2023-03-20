Feature: Feature Etalase Belanja Product
  @EtalaseBelanja @Positive @Capstone
  Scenario: Verify menu etalase belanja is enable
    Given user on the sirloinPOS website
    When user login with input "mukhlisanshori1997@gmail.com" as email and "Mukhlis11111" as password
    And verify succes login title "Berhasil Login"
    Then user click Etalase belanja menu
    And user should be on "Etalase Belanja Product"

  @EtalaseBelanja @Positive @Capstone
  Scenario: Verify user can choose item from etalase belanja product page
    Given user on the sirloinPOS website
    When user login with input "mukhlisanshori1997@gmail.com" as email and "Mukhlis11111" as password
    And verify succes login title "Berhasil Login"
    Then user click Etalase belanja menu
    And user should be on "Etalase Belanja Product"
    Then user click button beli first item
    And verify first item appeared on keranjang feature
    And user click button beli second item
    And verify second item appeared on keranjang feature

  @EtalaseBelanja @Positive @Capstone
  Scenario: Verify user can click button + and -
    Given user on the sirloinPOS website
    When user login with input "mukhlisanshori1997@gmail.com" as email and "Mukhlis11111" as password
    And verify succes login title "Berhasil Login"
    Then user click Etalase belanja menu
    And user should be on "Etalase Belanja Product"
    Then user click button beli first item
    And verify first item appeared on keranjang feature
    And user click button increment ten times
    And user click button decrement six times
    Then value total items is five

  @EtalaseBelanja @Positive @Capstone
  Scenario: Verify user can buying item from etalase belanja product page
    Given user on the sirloinPOS website
    When user login with input "mukhlisanshori1997@gmail.com" as email and "Mukhlis11111" as password
    And verify succes login title "Berhasil Login"
    Then user click Etalase belanja menu
    And user should be on "Etalase Belanja Product"
    Then user click button beli first item
    And verify first item appeared on keranjang feature
    And user click button beli second item
    And verify second item appeared on keranjang feature
    Then user click button bayar
    And user verify total payment
    And user click order button and redirect payment method

  @EtalaseBelanja @Positive @Capstone
  Scenario: Verify button cancel is enable
    Given user on the sirloinPOS website
    When user login with input "mukhlisanshori1997@gmail.com" as email and "Mukhlis11111" as password
    And verify succes login title "Berhasil Login"
    Then user click Etalase belanja menu
    And user should be on "Etalase Belanja Product"
    Then user click button beli first item
    And verify first item appeared on keranjang feature
    And user click button beli second item
    And verify second item appeared on keranjang feature
    Then user click button bayar
    And user verify total payment
    And user click cancel button
    And user should be on "Etalase Belanja Product"

  @EtalaseBelanja @Negative @Capstone
  Scenario: Verify button delete item is enable
    Given user on the sirloinPOS website
    When user login with input "mukhlisanshori1997@gmail.com" as email and "Mukhlis11111" as password
    And verify succes login title "Berhasil Login"
    Then user click Etalase belanja menu
    And user should be on "Etalase Belanja Product"
    Then user click button beli first item
    And verify first item appeared on keranjang feature
    And user click delete button on keranjang fields



