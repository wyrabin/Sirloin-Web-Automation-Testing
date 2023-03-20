Feature: Laporan Transaksi admin
  @LaporanAdmin @Positive @Capstone
  Scenario: Verify menu laporan transaksi is enable
    Given user on the sirloinPOS website
    When user login with input "sirloinpos@gmail.com" as email and "Amr12345" as password
    And verify succes login title "Berhasil Login"
    And user click menu laporan penjualan
    Then verify title menu laporan penjualan admin is Laporan Penjualan

  @LaporanAdmin @Positive @Capstone
  Scenario: Verify menu date is enable
    Given user on the sirloinPOS website
    When user login with input "sirloinpos@gmail.com" as email and "Amr12345" as password
    And verify succes login title "Berhasil Login"
    And user click menu laporan penjualan
    Then verify title menu laporan penjualan admin is Laporan Penjualan
    And user click date from
    And user set date from
    And user click date until
    And user set date until
    Then user click tampilkan data laporan transaksi
    And laporan transaksi penjualan is displayed

  @LaporanAdmin @Positive @Capstone
  Scenario: Verify total transaksi penjualan
    Given user on the sirloinPOS website
    When user login with input "sirloinpos@gmail.com" as email and "Amr12345" as password
    And verify succes login title "Berhasil Login"
    And user click menu laporan penjualan
    Then verify title menu laporan penjualan admin is Laporan Penjualan
    And user click date from
    And user set date from
    And user click date until
    And user set date until
    Then user click tampilkan data laporan transaksi
    And laporan transaksi penjualan displayed
    And verify total transaksi penjualan and total transaksi penjualan sukses
