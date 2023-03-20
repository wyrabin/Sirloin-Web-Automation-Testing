@Login @Capstone
Feature: Login Sirloin

  @LoginAdmin @Positif
  Scenario: Login with valid email dan password, and Verify menu super admin only Home, Product, Laporan Penjualan, Profile Super Admin, Logout
    Given user on the sirloinPOS website
    When user click email field
    And user input email "sirloinpos@gmail.com"
    When user click password field
    And user input "Amr12345" as password
    And user click login button
    Then see modal successfully
    When click OK button modal
    Then admin should be "Product Super Admin" page
    And admin verify menu home displayed "Home"
    And admin verify menu product displayed "Product"
    And admin verify menu laporan penjualan displayed "Laporan Penjualan"
    And admin verify menu profile displayed "Profile Super Admin"
    And admin verify menu logout displayed "Log Out"
