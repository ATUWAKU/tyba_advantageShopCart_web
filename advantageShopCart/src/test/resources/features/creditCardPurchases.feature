Feature: As a Certifier I want to automate the tests of credit card purchases to guarantee these functionalities

  Scenario: Successful. Make the purchase of products with user registrated
    Given I authenticate with User And Password
      |User   |Password|
      |atuwaku|164Scout|
    When I make the purchase products with credit card
      |Products                                                 |CardNumber  |CVV|ExpiMonth|ExpYear|CardHolderNaem|
      |HP ELITEPAD 1000 G2 TABLET, HP ROAR PLUS WIRELESS SPEAKER|123456789521|222|05       |2027   |Jesus Munera  |
    Then The purchase must be completed
      |Customer    |Address         |City |Department|Phone     |EndCardNumber|Payment_method|Subtotal  |Shipping|Total    |
      |Yisus Munera|Cll 45 # 85-23  |Bello|Machupichu|3256551204|9521         |MasterCredit  |$1,178.99 |50      |$1,228.99|