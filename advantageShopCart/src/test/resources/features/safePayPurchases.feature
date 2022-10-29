Feature: As a Certifier I want to automate the tests of safe pay purchases to guarantee these functionalities

  Scenario: Successful. Make the purchase of products with user registrated
    Given I authenticate with User And Password
      |User   |Password|
      |atuwaku|164Scout|
    When I make the purchase products with safe pay
      |Products                                                 |Username|Password|
      |HP ELITEPAD 1000 G2 TABLET, HP ROAR PLUS WIRELESS SPEAKER|atuwaku|Pagos2565|
    Then The purchase must be completed
      |Customer    |Address       |City |Department|Phone     |Payment_method|Subtotal  |Shipping|Total    |
      |Yisus Munera|Cll 45 # 85-23|Bello|Machupichu|3256551204|SafePay       |$1,178.99 |50      |$1,228.99|