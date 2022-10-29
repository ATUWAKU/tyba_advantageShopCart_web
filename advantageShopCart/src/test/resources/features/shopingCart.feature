Feature: As a Certifier I want to automate the tests of Shoping Cart to validate their functionalities


  Scenario: Successful. Validate that the shopping cart has the products added
    Given I authenticate with User And Password
      |User   |Password|
      |atuwaku1|164Scout|
    When I make the order of "HP ELITEPAD 1000 G2 TABLET, HP ELITEBOOK FOLIO"
    Then The purchase order must list the products "HP ELITEPAD 1000 G2 TABLET, HP ELITEBOOK FOLIO"

    Scenario Outline: Validate that the order payment is generated correctly
      Given I authenticate with User And Password
        |User   |Password  |
        |<User> |<Password>|
      When I generate an order payment for the "<Products>"
      Then The Order payment should be generated with the data
      |Products  |Prices  |Total  |
      |<Products>|<Prices>|<Total>|

      Examples:
        |User   |Password |Products                                                 |Prices               |Total    |
        |atuwaku2|164Scout|HP ELITEPAD 1000 G2 TABLET, HP ELITEBOOK FOLIO           |$1,261.99;$1,009.00 |$2,270.99 |
        |atuwaku3|164Scout|HP ROAR PLUS WIRELESS SPEAKER                            |$169.99             |$169.99   |
        |atuwaku4|164Scout|HP ROAR PLUS WIRELESS SPEAKER, HP ELITEBOOK FOLIO        |$169.99;$1,261.99   |$1,431.98 |
        |atuwaku5|164Scout|HP ROAR PLUS WIRELESS SPEAKER, HP ELITEPAD 1000 G2 TABLET|$1,009.00;$169.99   |$1,178.99 |