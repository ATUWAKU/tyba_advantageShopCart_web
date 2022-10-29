Feature: As a Certifier I want to automate the tests of Shoping Cart Popup to validate their functionalities


  Scenario: Validar que se eliminen los productos del listado Shoping Cart popup al presionar la opción X de este listado
    Given Me autentico con usuario y contraseña
    And Agrego productos al carrito de compras
    When Elimino un producto de la lista Shoping cart Popup
    Then El listado de Shoping Cart popup debe actualizarse


  Scenario: Validar que se eliminen los productos del listado Shoping Cart popup al presionar la opción REMOVE delCV listado Shoping Cart
    Given Me autentico con usuario y contraseña
    And Agrego productos al carrito de compras
    When Elimino un producto de la lista Shoping Cart
    Then El listado de Shoping Cart popup debe actualizarse