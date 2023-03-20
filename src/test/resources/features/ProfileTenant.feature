Feature: Profile Tenant
  @ProfileTenant @Positive @Capstone
  Scenario: Verify menu profile tenant enable
    Given user on the sirloinPOS website
    When user login with input "mukhlisanshori321@gmail.com" as email and "Mukhlis123" as password
    And verify succes login title "Berhasil Login"
    And user click profile tenant menu
    Then user should be on "Profil Tenant" page

  @ProfileTenant @Positive @Capstone
  Scenario: Verify button kembali on profile page is enable
    Given user on the sirloinPOS website
    When user login with input "mukhlisanshori321@gmail.com" as email and "Mukhlis123" as password
    And verify succes login title "Berhasil Login"
    And user click profile tenant menu
    Then user should be on "Profil Tenant" page
    And user click button kembali on profile tenant page
    Then user should be on home page "Product Toko"

  @ProfileTenant @Positive @Capstone
  Scenario: Verify button kembali on edit profile is enable
    Given user on the sirloinPOS website
    When user login with input "mukhlisanshori321@gmail.com" as email and "Mukhlis123" as password
    And verify succes login title "Berhasil Login"
    And user click profile tenant menu
    Then user should be on "Profil Tenant" page
    And user click button edit profile
    And verify user on "Update Profil Tenant"
    And user click button kembali
    Then user should be on "Profil Tenant" page



  @ProfileTenant @Positive @Capstone
  Scenario: Verify information profile tenant same like registration
    Given user on the sirloinPOS website
    When user login with input "mukhlisanshori321@gmail.com" as email and "Mukhlis123" as password
    And verify succes login title "Berhasil Login"
    And user click profile tenant menu
    Then user should be on "Profil Tenant" page
    And verify toko have name "Toko Barokah Baru"
    And verify email have value "mukhlisanshori321@gmail.com"
    And verify nomor telephone is "082325649757"
    And verify address is "JL Kol Sugiono Mergosono Malang"

  @ProfileTenant @Positive @Capstone
  Scenario: Verify button edit profile is enabled
    Given user on the sirloinPOS website
    When user login with input "mukhlisanshori321@gmail.com" as email and "Mukhlis123" as password
    And verify succes login title "Berhasil Login"
    And user click profile tenant menu
    Then user should be on "Profil Tenant" page
    And user click button edit profile
    And verify user on "Update Profil Tenant"

  @ProfileTenant @Positive @Capstone
  Scenario: Verify edit fitur Nama Bisnis / Toko can be used
    Given user on the sirloinPOS website
    When user login with input "mukhlisanshori321@gmail.com" as email and "Mukhlis123" as password
    And verify succes login title "Berhasil Login"
    And user click profile tenant menu
    Then user should be on "Profil Tenant" page
    And user click button edit profile
    And verify user on "Update Profil Tenant"
    Then user update nama bisnis toko with "Toko Baru"
    And user click save button
    Then user verify nama bisnis atau toko updated with "Toko Baru" on profile tenant page

  @ProfileTenant @Positive @Capstone
  Scenario: Verify edit fitur phone number can be used
    Given user on the sirloinPOS website
    When user login with input "mukhlisanshori321@gmail.com" as email and "Mukhlis123" as password
    And verify succes login title "Berhasil Login"
    And user click profile tenant menu
    Then user should be on "Profil Tenant" page
    And user click button edit profile
    And verify user on "Update Profil Tenant"
    Then user update phone number with "0823256457"
    And user click save button
    Then user verify phone number updated with "0823256457" on profile tenant page

  @ProfileTenant @Positive @Capstone
  Scenario: Verify edit fitur alamat can be used
    Given user on the sirloinPOS website
    When user login with input "mukhlisanshori321@gmail.com" as email and "Mukhlis123" as password
    And verify succes login title "Berhasil Login"
    And user click profile tenant menu
    Then user should be on "Profil Tenant" page
    And user click button edit profile
    And verify user on "Update Profil Tenant"
    Then user update alamat with "JL Kol Sugiono Mergosono"
    And user click save button
    Then user verify alamat updated with "JL Kol Sugiono Mergosono" on profile tenant page



