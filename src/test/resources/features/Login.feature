@Login @Capstone
  Feature: Login Sirloin

    @Login @Positif
    Scenario: Login with valid email dan password
      Given user on the sirloinPOS website
      When user click email field
      And user input email "mukhlisanshori1997@gmail.com"
      When user click password field
      And user input "Mukhlis11111" as password
      And user click login button
      Then see modal successfully
      When click OK button modal
      Then user should be "Product Toko" page

    @Login @Negative
      Scenario: Login with valid email dan invalid password
      When user click email field
      And user input email "mukhlisanshori1997@gmail.com"
      When user click password field
      And user input "Lala123" as password
      And user click login button
      Then see modal unsuccessfully login
      When click OK button modal error

    @Login @Negative
    Scenario: Login with valid email dan invalid password
      When user click email field
      And user input email "suka@gmail.com"
      When user click password field
      And user input "Mukhlis11111" as password
      And user click login button
      Then see modal unsuccessfully login
      When click OK button modal error

    @Login @Negative
    Scenario: Login with valid email dan invalid password
      When user click email field
      And user input email "suka@gmail.com"
      When user click password field
      And user input "sayasuka" as password
      And user click login button
      Then see modal unsuccessfully login
      When click OK button modal error