Feature: logout fitur
  @Logout @Positive @Capstone
  Scenario: Verify feature logout enable
    Given user on the sirloinPOS website
    When user login with input "mukhlisanshori1997@gmail.com" as email and "Mukhlis11111" as password
    And verify succes login title "Berhasil Login"
    Then user click button logout
    And user have message "Berhasil Logout"
    And user should redirect to login page with verify title "Login"