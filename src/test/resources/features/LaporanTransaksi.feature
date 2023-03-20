Feature: Laporan Transaksi
  @LaporanTransaksi @Positive @Capstone
  Scenario: Verify menu laporan transaksi is enable
    Given user on the sirloinPOS website
    When user login with input "mukhlisanshori1997@gmail.com" as email and "Mukhlis11111" as password
    And verify succes login title "Berhasil Login"
    And user click menu laporan transaksi
    Then verify title menu "Laporan Transaksi"

  @LaporanTransaksi @Positive @Capstone
  Scenario: Verify menu date is enable
    Given user on the sirloinPOS website
    When user login with input "mukhlisanshori1997@gmail.com" as email and "Mukhlis11111" as password
    And verify succes login title "Berhasil Login"
    And user click menu laporan transaksi
    Then verify title menu "Laporan Transaksi"
    And user click date from
    And user set date from
    And user click date until
    And user set date until
    Then user click tampilkan data laporan transaksi

  @LaporanTransaksi @Positive @Capstone
  Scenario: Verify history tansaction is displayed
    Given user on the sirloinPOS website
    When user login with input "mukhlisanshori1997@gmail.com" as email and "Mukhlis11111" as password
    And verify succes login title "Berhasil Login"
    And user click menu laporan transaksi
    Then verify title menu "Laporan Transaksi"
    And user click date from
    And user set date from
    And user click date until
    And user set date until
    Then user click tampilkan data laporan transaksi
    And user get text no transaksi
    And user get text status transaksi

  @LaporanTransaksi @Positive @Capstone
  Scenario: Verify total history tansaction is displayed
    Given user on the sirloinPOS website
    When user login with input "mukhlisanshori1997@gmail.com" as email and "Mukhlis11111" as password
    And verify succes login title "Berhasil Login"
    And user click menu laporan transaksi
    Then verify title menu "Laporan Transaksi"
    And user click date from
    And user set date from
    And user click date until
    And user set date until
    Then user click tampilkan data laporan transaksi
    And user get text no transaksi
    And user get text status transaksi
    And user verify total transaksi sukses
    And user verify total transaksi

  @LaporanTransaksi @Positive @Capstone
  Scenario: Verify send email is enable
    Given user on the sirloinPOS website
    When user login with input "mukhlisanshori1997@gmail.com" as email and "Mukhlis11111" as password
    And verify succes login title "Berhasil Login"
    And user click menu laporan transaksi
    Then verify title menu "Laporan Transaksi"
    And user click date from
    And user set date from
    And user click date until
    And user set date until
    Then user click tampilkan data laporan transaksi
    And user click send to email

  @LaporanTransaksi @Positive @Capstone
  Scenario: Verify print button is enable
    Given user on the sirloinPOS website
    When user login with input "mukhlisanshori1997@gmail.com" as email and "Mukhlis11111" as password
    And verify succes login title "Berhasil Login"
    And user click menu laporan transaksi
    Then verify title menu "Laporan Transaksi"
    And user click date from
    And user set date from
    And user click date until
    And user set date until
    Then user click tampilkan data laporan transaksi
    And user click print button laporan transaksi


