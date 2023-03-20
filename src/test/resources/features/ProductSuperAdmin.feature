@ProductAdmin @Capstone
Feature: Product super admin

  @ProductAdmin @Positif
  Scenario: verify menu product super admin list is enable
    Given user on the sirloinPOS website
    When user click email field
    And user input email "sirloinpos@gmail.com"
    When user click password field
    And user input "Amr12345" as password
    And user click login button
    Then see modal successfully
    When click OK button modal
    Then admin should be redirect to list "Product Super Admin" page

  @ProductAdmin @Positif
  Scenario: add product super admin with valid data
    Given user on the sirloinPOS website
    When user click email field
    And user input email "sirloinpos@gmail.com"
    When user click password field
    And user input "Amr12345" as password
    And user click login button
    Then see modal successfully
    When click OK button modal
    And user click menu product
    Then verify title menu is "Product Super Admin"
    And user click button Tambah Product
    And user should be redirect "Tambah Product" page
    Given user choose photos from directory with file name "bimoli.jpg"
    And user input nomor barcode "123123356749"
    And user input kategory product "Minyakkk"
    And user input supplier "Pabrik Minyakkk"
    And user input nama product "Minyak Bimooliiii"
    And user input harga jual "40000"
    And user input harga beli "39000"
    And user input stok product "60"
    And user input minimum stok "5"
    Then user click simpan button

  @ProductAdmin @Positif
  Scenario: verify product can be displayed
    Given user on the sirloinPOS website
    When user click email field
    And user input email "sirloinpos@gmail.com"
    When user click password field
    And user input "Amr12345" as password
    And user click login button
    Then see modal successfully
    When click OK button modal
    And user click menu product
    And admin verify product kecap is displayed

  @ProductAdmin @Positif
  Scenario: verify edit product
    Given user on the sirloinPOS website
    When user click email field
    And user input email "sirloinpos@gmail.com"
    When user click password field
    And user input "Amr12345" as password
    And user click login button
    Then see modal successfully
    When click OK button modal
    And user click menu product
    And admin click edit product
    Then user update foto kecap "abc.jpg"
    And user edit kategori kecap "Kecap Hitam"
    And user edit product name "Kecap ABC"
    And user update stock product "98"
    And user edit minimum stock barang "5"
    And user update harga jual "9000"
    And user update harga beli "4000"
    And user click button simpan on edit page
    And user get message success edit "success update product"

  @ProductAdmin @Negative @Capstone
  Scenario Outline: upload product admin with invalid data input null values
    Given user on the sirloinPOS website
    When user login with input "sirloinpos@gmail.com" as email and "Amr12345" as password
    And verify succes login title "Berhasil Login"
    And user click menu product
    Then verify title menu is "Product Super Admin"
    And user click button Tambah Product
    And user should be redirect "Tambah Product" page
    Given user choose photos from directory with file name "<foto>"
    And user input nomor barcode "<barcode>"
    And user input kategory product "<kategori>"
    And user input supplier "<suplier>"
    And user input nama product "<nama>"
    And user input harga jual "<jual>"
    And user input harga beli "<beli>"
    And user input stok product "<stok>"
    And user input minimum stok "<minstok>"
    And Button simpan is disable
    Examples:
      | foto        | barcode      | kategori | suplier       | nama              | jual  | beli  | stok | minstok |
      |             | 111222333345 | Minyak   | Pabrik Minyak | Minyak Bimoli     | 40000 | 35000 | 100  | 10      |
      | fortune.jpg |              | Minyak   | Pabrik Minyak | Minyak Fortune    | 39000 | 33000 | 100  | 10      |
      | jumbo.jpg   | 111222333345 |          | Pabrik Mie    | Mie Indomie Jumbo | 6000  | 4000  | 200  | 20      |
      | mie.jpg     | 111222333345 | Mie      |               | Mie Indomie       | 3500  | 2000  | 200  | 20      |
      | miesoto.jpg | 111222333345 | Mie      | Pabrik Mie    |                   | 3500  | 2000  | 200  | 20      |
      | fortune.jpg | 111222333345 | Minyak   | Pabrik Minyak | Minyak Fortune    |       | 33000 | 100  | 10      |
      | jumbo.jpg   | 111222333345 | Mie      | Pabrik Mie    | Mie Indomie Jumbo | 6000  |       | 200  | 20      |
      | mie.jpg     | 111222333345 | Mie      | Pabrik Mie    | Mie Indomie       | 3500  | 2000  |      | 20      |
      | miesoto.jpg | 111222333345 | Mie      | Pabrik Mie    | Mie Indomie       | 3500  | 2000  | 200  |         |
