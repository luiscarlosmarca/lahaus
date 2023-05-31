# Automatización de Pruebas con Appium, Screenplay, Selenium WebDriver y Cucumber

Este proyecto de automatización tiene como objetivo realizar pruebas automatizadas en una aplicación móvil utilizando Appium. Se utiliza el patrón de diseño Screenplay en conjunto con Serenity BDD, Selenium WebDriver y Cucumber para facilitar la escritura y ejecución de escenarios de pruebas.

## Herramientas utilizadas

- **Appium**: Es un framework de automatización de pruebas diseñado específicamente para aplicaciones móviles. Permite interactuar con los elementos de la interfaz de usuario de la aplicación en diferentes plataformas (Android e iOS).

- **Screenplay**: Es un patrón de diseño que se centra en escribir pruebas automatizadas de forma más legible y mantenible. Permite organizar las pruebas en torno a las acciones de los actores involucrados en un sistema y facilita la reutilización de código.

- **Selenium WebDriver**: Es una herramienta muy utilizada en la automatización de pruebas web. Permite interactuar con los elementos de una página web y realizar acciones como hacer clic, llenar formularios, etc.

- **Cucumber**: Es una herramienta de pruebas que facilita la colaboración entre el equipo de desarrollo y el equipo de pruebas. Permite escribir escenarios de pruebas en lenguaje natural (Gherkin) y traducirlos en código ejecutable.

- **Gradle**: Es una herramienta de construcción y gestión de dependencias. Facilita la configuración y administración de las dependencias del proyecto, así como la ejecución de las pruebas.

- **Serenity BDD**: Es un framework de automatización de pruebas basado en BDD (Behavior Driven Development). Proporciona características adicionales para generar informes detallados y gestionar el flujo de las pruebas.

- **Rest Assured**: Es una biblioteca de Java que simplifica la realización de pruebas automatizadas en servicios REST. Permite realizar solicitudes HTTP y validar las respuestas recibidas.

## Funcionalidades del proyecto

Este proyecto incluye las siguientes funcionalidades:

- Automatización de un método GET para consultar información de recursos.
- Automatización de un método POST para crear nuevos recursos.
- Automatización de un método PUT para actualizar recursos existentes.
- Automatización de un método PATCH para actualizar parcialmente recursos existentes.
- Automatización de un método DELETE para eliminar recursos existentes.

Además de las herramientas mencionadas, el proyecto se adhiere a los principios FIRST (Fast, Isolated, Repeatable, Self-Validating, Timely) para garantizar la calidad de las pruebas automatizadas. También se aplican principios SOLID y buenas prácticas de desarrollo de software para mantener un código limpio y fácil de mantener.

## Ejecución de las pruebas

Para obtener más detalles sobre la ejecución de las pruebas y ver los informes generados, puedes acceder al siguiente enlace:

[Ver informe ejecución](https://github.com/luiscarlosmarca/lahaus/blob/main/target/site/serenity/index.html)

## Tecnologias
***

* JAVA Version 11.0.12 
* Appium Version 1.19.1
* Graddle Version 6.8

## Instalacion
***
```
$ git clone https://github.com/luiscarlosmarca/lahaus.git
$ gradle build
```

## Consideraciones
***


Es requerido dos variabldes de entorno para la ejecucion de las pruebas mobiles
- DdeviceName: Dispositivo a que se va ejecutar la prueba, la cual debe tener la aplicacion "Haus" previamente instalada. Este valor se consigue con el siguiente comando:
```
$ adb devices
```
- Dhub: Es el host que esta corriendo appium, al abrir appium se puede ver este valor.

## Ejecucion
***
```
$ gradle test --tests "runners.mobile.BusquedaPropiedadRunner" -DdeviceName= -Dhub=
$ gradle test --tests "runners.apis.UserRunner" -DbaseUrl=https://reqres.in/
