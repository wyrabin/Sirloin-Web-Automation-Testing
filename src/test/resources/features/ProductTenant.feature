Feature: Product Tenant
  @ProductTenant @Positive @Capstone
    Scenario: Verify menu product enable
    Given user on the sirloinPOS website
    When user login with input "mukhlisanshori321@gmail.com" as email and "Mukhlis123" as password
    And verify succes login title "Berhasil Login"
    And user click menu product
    Then verify title menu is "Product Tenant"

  @ProductTenant @Positive @Capstone
    Scenario: verify buutton tambah product enable
    Given user on the sirloinPOS website
    When user login with input "mukhlisanshori321@gmail.com" as email and "Mukhlis123" as password
    And verify succes login title "Berhasil Login"
    And user click menu product
    Then verify title menu is "Product Tenant"
    And user click button Tambah Product
    And user should be redirect "Tambah Product" page

 
  @ProductTenant @Positive @Capstone
  Scenario Outline: upload product with valid data input
    Given user on the sirloinPOS website
    When user login with input "mukhlisanshori321@gmail.com" as email and "Mukhlis123" as password
    And verify succes login title "Berhasil Login"
    And user click menu product
    Then verify title menu is "Product Tenant"
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
    Then user click simpan button
    Examples:
      | foto        | barcode      | kategori | suplier       | nama              | jual  | beli  | stok | minstok |
      | abc.jpg     | 111111223121 | Kecap    | Pabrik Kecap  | Kecap ABC         | 12000 | 9000  | 100  | 10      |
      | fortune.jpg | 111111223122 | Minyak   | Pabrik Minyak | Minyak Fortune    | 39000 | 33000 | 100  | 10      |
      | jumbo.jpg   | 111111223123 | Mie      | Pabrik Mie    | Mie Indomie Jumbo | 6000  | 4000  | 200  | 20      |

  @ProductTenant @Negative @Capstone
  Scenario Outline: upload product with invalid data input null values
    Given user on the sirloinPOS website
    When user login with input "mukhlisanshori321@gmail.com" as email and "Mukhlis123" as password
    And verify succes login title "Berhasil Login"
    And user click menu product
    Then verify title menu is "Product Tenant"
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
      |             | 152468521245 | Minyak   | Pabrik Minyak | Minyak Bimoli     | 40000 | 35000 | 100  | 10      |
      | fortune.jpg |              | Minyak   | Pabrik Minyak | Minyak Fortune    | 39000 | 33000 | 100  | 10      |
      | jumbo.jpg   | 152468521245 |          | Pabrik Mie    | Mie Indomie Jumbo | 6000  | 4000  | 200  | 20      |
      | mie.jpg     | 152468521245 | Mie      |               | Mie Indomie       | 3500  | 2000  | 200  | 20      |
      | miesoto.jpg | 152468521245 | Mie      | Pabrik Mie    |                   | 3500  | 2000  | 200  | 20      |
      | fortune.jpg | 152468521245 | Minyak   | Pabrik Minyak | Minyak Fortune    |       | 33000 | 100  | 10      |
      | jumbo.jpg   | 152468521245 | Mie      | Pabrik Mie    | Mie Indomie Jumbo | 6000  |       | 200  | 20      |
      | mie.jpg     | 152468521245 | Mie      | Pabrik Mie    | Mie Indomie       | 3500  | 2000  |      | 20      |
      | miesoto.jpg | 152468521245 | Mie      | Pabrik Mie    | Mie Indomie       | 3500  | 2000  | 200  |         |

  @ProductTenant @Positive @Capstone
  Scenario: Verify button update for oreo enabled
    Given user on the sirloinPOS website
    When user login with input "mukhlisanshori1997@gmail.com" as email and "Mukhlis11111" as password
    And verify succes login title "Berhasil Login"
    And user click menu product
    Then user click button edit for oreo
    And user redirect to edit product and verify title is "Edit Product"

  @ProductTenant @Positive @Capstone
  Scenario: Verify feature update for oreo is enabled with valid value
    Given user on the sirloinPOS website
    When user login with input "mukhlisanshori1997@gmail.com" as email and "Mukhlis11111" as password
    And verify succes login title "Berhasil Login"
    And user click menu product
    Then user click button edit for oreo
    And user redirect to edit product and verify title is "Edit Product"
    Then user update foto kecap "abc.jpg"
    And user edit kategori kecap "Oreooo"
    And user edit product name "Oreo asli"
    And user update stock product "98"
    And user edit minimum stock barang "5"
    And user update harga jual "9000"
    And user update harga beli "4000"
    And user click button simpan on edit page
    And user get message success edit "success update product"

  @ProductTenant @Positive @Capstone
  Scenario: upload product with barcode is already used for another product
    Given user on the sirloinPOS website
    When user login with input "mukhlisanshori1997@gmail.com" as email and "Mukhlis11111" as password
    And verify succes login title "Berhasil Login"
    And user click menu product
    Then verify title menu is "Product Tenant"
    And user click button Tambah Product
    And user should be redirect "Tambah Product" page
    Given user choose photos from directory with file name "tehgelas.jpg"
    And user input nomor barcode "111111223120"
    And user input kategory product "Minuman"
    And user input supplier "Pabrik Teh Gelas"
    And user input nama product "Teh Gelassss a"
    And user input harga jual "2000"
    And user input harga beli "1000"
    And user input stok product "60"
    And user input minimum stok "5"
    Then user click simpan button
    And user get message failed "duplicated product on barcode"

  @ProductTenant @Negative @Capstone
  Scenario: Verify feature update with barcode is already used
    Given user on the sirloinPOS website
    When user login with input "mukhlisanshori1997@gmail.com" as email and "Mukhlis11111" as password
    And verify succes login title "Berhasil Login"
    And user click menu product
    Then user click button edit for Kecap ABC
    And user redirect to edit product and verify title is "Edit Product"
    Then user update foto kecap "abcedit.jpg"
    And user edit kategori kecap "Kecap Hitam"
    And user edit barcode with number already used in another product "111111223120"
    And user edit product name "Kecap ABC"
    And user update stock product "79"
    And user edit minimum stock barang "5"
    And user update harga jual "15000"
    And user update harga beli "10000"
    And user click button simpan on edit page
    And user get message failed "duplicated product on barcode"

  @ProductTenant @Positive @Capstone
  Scenario: Verify feature search field is enable
    Given user on the sirloinPOS website
    When user login with input "mukhlisanshori1997@gmail.com" as email and "Mukhlis11111" as password
    And verify succes login title "Berhasil Login"
    And user click menu product
    Then user input "Kec" from fitur search product tenant
    And product first name with value Kec displayed


