Feature: Feature customer
  @Customer @Positive @Capstone
  Scenario: Verify menu customer is enable
    Given user on the sirloinPOS website
    When user login with input "mukhlisanshori1997@gmail.com" as email and "Mukhlis11111" as password
    And verify succes login title "Berhasil Login"
    Then user click menu customer
    And user should be on list "Daftar Customer"

  @Customer @Positive @Capstone
  Scenario: Verify button add customer is enable
    Given user on the sirloinPOS website
    When user login with input "mukhlisanshori1997@gmail.com" as email and "Mukhlis11111" as password
    And verify succes login title "Berhasil Login"
    Then user click menu customer
    And user should be on list "Daftar Customer"
    And user click button tambah customer
    Then user should be redirect to "Tambah Customer" page

  @Customer @Positive @Capstone
  Scenario: Verify button back on add customer is enable
    Given user on the sirloinPOS website
    When user login with input "mukhlisanshori1997@gmail.com" as email and "Mukhlis11111" as password
    And verify succes login title "Berhasil Login"
    Then user click menu customer
    And user should be on list "Daftar Customer"
    And user click button tambah customer
    Then user should be redirect to "Tambah Customer" page
    And user click button kembali on add customer page
    And user should be on list "Daftar Customer"

  @Customer @Positive @Capstone
  Scenario: input customer with valid data
    Given user on the sirloinPOS website
    When user login with input "mukhlisanshori1997@gmail.com" as email and "Mukhlis11111" as password
    And verify succes login title "Berhasil Login"
    Then user click menu customer
    And user should be on list "Daftar Customer"
    And user click button tambah customer
    Then user should be redirect to "Tambah Customer" page
    And user input name customer "Mukhlis Anshori Witantoo"
    And user input phone number "0827564896287"
    And user input email customer "cobaaaas4465@gmail.com"
    And user input alamat customer "JL Di sini loh kok"
    Then user click simpan new customer
    And user have message Berhasil "success add new customer"

  @Customer @Negative @Capstone
  Scenario Outline: input customer with invalid data null
    Given user on the sirloinPOS website
    When user login with input "mukhlisanshori1997@gmail.com" as email and "Mukhlis11111" as password
    And verify succes login title "Berhasil Login"
    Then user click menu customer
    And user should be on list "Daftar Customer"
    And user click button tambah customer
    Then user should be redirect to "Tambah Customer" page
    And user input name customer "<nama>"
    And user input phone number "<nohp>"
    And user input email customer "<email>"
    And user input alamat customer "<alamat>"
    Then button simpan is disable
    Examples:
      | nama    | nohp       | email                 | alamat       |
      |         | 0812345678 | mukhlisaaaa@gmail.com | jl mergosono |
      | Mukhlis |            | mukhlisaaaa@gmail.com | jl mergosono |
      | Mukhlis | 0812345678 |                       | jl mergosono |
      | Mukhlis | 0812345678 | mukhlisaaaa@gmail.com |              |

  @Customer @Negative @Capstone
  Scenario: input customer with email already exist
    Given user on the sirloinPOS website
    When user login with input "mukhlisanshori1997@gmail.com" as email and "Mukhlis11111" as password
    And verify succes login title "Berhasil Login"
    Then user click menu customer
    And user should be on list "Daftar Customer"
    And user click button tambah customer
    Then user should be redirect to "Tambah Customer" page
    And user input name customer "Anto"
    And user input phone number "0855111112"
    And user input email customer "andreasbagas@gmail.com"
    And user input alamat customer "JL di kota malang"
    Then user click simpan new customer
    And user have message Berhasil "register new customer email already exist"


  @Customer @Negative @Capstone
  Scenario: input customer with phone number already exist
    Given user on the sirloinPOS website
    When user login with input "mukhlisanshori1997@gmail.com" as email and "Mukhlis11111" as password
    And verify succes login title "Berhasil Login"
    Then user click menu customer
    And user should be on list "Daftar Customer"
    And user click button tambah customer
    Then user should be redirect to "Tambah Customer" page
    And user input name customer "Anton"
    And user input phone number "08556677889"
    And user input email customer "andreasbagasss@gmail.com"
    And user input alamat customer "JL di kota malang"
    Then user click simpan new customer
    And user have message Berhasil "update customer phone number already exist"

  @Customer @Negative @Capstone
  Scenario: input customer with invalid format email
    Given user on the sirloinPOS website
    When user login with input "mukhlisanshori1997@gmail.com" as email and "Mukhlis11111" as password
    And verify succes login title "Berhasil Login"
    Then user click menu customer
    And user should be on list "Daftar Customer"
    And user click button tambah customer
    Then user should be redirect to "Tambah Customer" page
    And user input name customer "Anton"
    And user input phone number "08553466431"
    And user input email customer "andreasbagas.com"
    And user input alamat customer "JL di kota malang"
    Then user click simpan new customer
    And user stay on "Tambah Customer" page and get message eror format email

  @Customer @Positive @Capstone
  Scenario: edit customer with valid data
    Given user on the sirloinPOS website
    When user login with input "mukhlisanshori1997@gmail.com" as email and "Mukhlis11111" as password
    And verify succes login title "Berhasil Login"
    Then user click menu customer
    And user should be on list "Daftar Customer"
    And user click button edit button customer Mukhlis
    And user change name "Mukhlis Edited"
    And user change phone number "089654123433"
    And user change email "mukhlisupdate2@gmail.com"
    And user change alamat "JL Kol Sugiono Mergosono Malangg "
    Then user click simpan customer
    And user have message Berhasil "success edit customer data"





