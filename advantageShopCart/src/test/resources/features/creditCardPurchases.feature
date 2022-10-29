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


  Scenario: Validar que no se pueda completar una compra si no se ingresa el número de la tarjeta de crédito.
  Given Me autentico con usuario y contraseña
    When Realizo la compra de los productos pagando con tarjeta de crédito dejando en blanco el número de la tarjeta
    Then El sistema debe impedir la compra y mostrar una alerta en el campo  número de tarjeta


  Scenario: Validar que no se pueda completar una compra si no se ingresa el CVV de la tarjeta de crédito
    Given Me autentico con usuario y contraseña
    When Realizo la compra de los productos pagando con tarjeta de crédito dejando en blanco número CVV
    Then El sistema debe impedir la compra y mostrar una alerta en el campo VV


  Scenario: Validar que no se pueda completar una compra si no se ingresa el mes de vencimiento de la tarjeta de crédito
    Given Me autentico con usuario y contraseña
    When Realizo la compra de los productos pagando con tarjeta de crédito dejando en blanco el mes de vencimiento
    Then El sistema debe impedir la compra y mostrar una alerta en el campo mes de vencimiento

  Scenario: Validar que no se pueda completar una compra si no se ingresa el año de vencimiento de la tarjeta de crédito
    Given Me autentico con usuario y contraseña
    When Realizo la compra de los productos pagando con tarjeta de crédito dejando en blanco en el año de vencimiento
    Then El sistema debe impedir la compra y mostrar una alerta en el campo año de vencimiento


  Scenario: Validar que no se pueda completar una compra si no se ingresa el card holder name de la tarjeta de crédito
    Given Me autentico con usuario y contraseña
    When Realizo la compra de los productos pagando con tarjeta de crédito dejando en blanco card holder name
    Then El sistema debe impedir la compra y mostrar una alerta en el campo año de card holder name


  Scenario: Validar que la tarjeta de credito con la que se paga no quede guardada si no está seleccionada la opción save changes in profile for future use
    Given Me autentico con usuario y contraseña
    When Realizo la compra de los productos pagando con tarjeta de crédito sin seleccionar el check
    Then El sistema no debería guardar los datos de la tarjeta de credito en el perfil
