@Register @Capstone @Positive
  Feature: Sirloin register user
    Scenario: Register with valid input
      When user click register field
      And user input nama bisnis / toko "Toko Tes Mukhlis"
      And user input "percobaanlagiiii223@gmail.com" as email
      And user input password register have value "Mukhlis123"
      And user input nomor telephone "08654242318"
      And user input "jl malang indonesia raya" as alamat
      And user click register button


    @Register @Capstone @Positive
    Scenario: Verify button login on register is enable
      When user click register field
      Then user click login text
      And user should redirect to login page with verify title "Login"

    @Register @Negative
    Scenario Outline: Register with null values
      When user click register field
      And user input nama bisnis / toko "<toko>"
      And user input "<email>" as email
      And user input password register have value "<pass>"
      And user input nomor telephone "<telp>"
      And user input "<alamat>" as alamat
      Then button register should be disable
      Examples:
        | toko         | email                | pass       | telp       | alamat    |  |
        |              | mukhlis123@gmail.com | Mukhlis123 | 0812222222 | jl malang |  |
        | Toko Barokah |                      | Mukhlis123 | 0812222222 | jl malang |  |
        | Toko Barokah | mukhlis123@gmail.com |            | 0812222222 | jl malang |  |
        | Toko Barokah | mukhlis123@gmail.com | Mukhlis123 |            | jl malang |  |
        | Toko Barokah | mukhlis123@gmail.com | Mukhlis123 | 0812222222 |           |  |


    @Register @Capstone @Negative
    Scenario: Register with password not secure
      When user click register field
      And user input nama bisnis / toko "warung saya"
      And user input "mukhlis@gmail.com" as email
      And user input password register have value "coba"
      And user input nomor telephone "08111111111"
      And user input "jl malang" as alamat
      And user click register button
      Then modal is displayed
      And verify title message text is "Gagal Register"
      And verify massage is "password must be at least 8 characters long, must contain uppercase letters, must contain lowercase letters, must contain numbers, must not be too general"

  @Register @Negative
    Scenario: Register with invalid format email
    When user click register field
    And user input nama bisnis / toko "warung saya"
    And user input "mukhlis.com" as email
    And user input password register have value "Mukhlis123"
    And user input nomor telephone "08111111111"
    And user input "jl malang" as alamat
    And user click register button
    Then modal is displayed
    And verify title message text is "Gagal Register"
    And verify massage is "incorrect register business email format"

    @Register @Negative
    Scenario: Register with invalid format phone number
      When user click register field
      And user input nama bisnis / toko "warung saya"
      And user input "mukhlis.com" as email
      And user input password register have value "Mukhlis123"
      And user input nomor telephone "081sda358"
      And user input "jl malang" as alamat
      And user click register button
      Then modal is displayed
      And verify title message text is "Gagal Register"
      And verify massage is "register business phone number must be a number"






