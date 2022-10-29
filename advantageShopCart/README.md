# advantageShopCart
Es un robot de pruebas End to End para la web https://www.advantageonlineshopping.com/

El robot se construye utilizando Intellij Community y el lenguaje de programación Java. Usamos gradle como gestor de dependencias y compilador del proyecto.

Se utiliza la técnica de pruebas BDD; esta se implementa haciendo uso del lenguaje Gherkin escrito en la herramienta Cucumber.

Se usa chrome driver como driver de conectividad con la web y se complementa con Serenity para lograr la conectividad entre la automatización y el sitio web. Se utiliza Selenium para realizar la adherencia con la aplicación

Se hace uso de Serenitybdd como herramienta para la implementación del patrón de automatización Screenplay y la generación de informes de resultados de las pruebas.

Para versionar el código fuente se utiliza git como herramienta de gestión de código, Gihub com repositorio, trunk base development como estándar de versionamiento y Sonar como herramienta para realizar análisis de código estático.

Las versiones de las herramientas se detallan a continuación.

```shell
Intellij Community 2021.3.2
Java 11 Openjdk version "11.0.2" 2019-01-15
Gradle wrapper 7.4.1
SerenityBdd 3.2.5
Cucumber 3.2.5
Git 2.35.1.2 
Sonar 9.4.0.54424
```
------------------------------------------------------
#Automatización

##Configuraciones de ejecución
###En Local

Para correr la automatización de forma local se debe:
3. Instalar [Java](https://openjdk.java.net/projects/jdk/11) y configurar la [varialbe de entorno](https://www.java.com/es/download/help/path_es.html)
4. Instalar [Gradle](https://gradle.org/releases) y su [variable de entorno configurada]((https://gradle.org/install/#manually))


##Ejecución
###Datos para la ejecución
Los datos para la ejecución los encuentra en cada uno de los archivos feature

###Todos los test
gradlew clen build test aggregate
####Test Credit Card Purchases
Debe ejecutar el comando gradlew clean build test --tests "co.com.yisus.certification.runners.CreditCardPurchasesRunner" aggregate
####Test Shoping Cart
Debe ejecutar el comando gradlew clean build test --tests "co.com.yisus.certification.runners.ShopingCartRunner" aggregate

###Informe de resultados
El informe de resultados lo encuentran en la carpeta donde está el proyecto en la ruta target\site\serenity\index.html