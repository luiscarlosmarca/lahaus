
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

## Consideraciones
***
Es requerido dos variabldes de entorno para la ejecucion de las pruebas mobiles
DdeviceName: Dispositivo a que se va ejecutar la prueba, la cual debe tener la aplicacion "Haus" previamente instalada. Este valor se consigue con el siguiente comando:
```
$ adb devices

Dhub: Es el host que esta corriendo appium, al abrir appium se puede ver este valor.
```
## Ejecucion
***
```
$ gradle test --tests "runners.mobile.BusquedaPropiedadRunner" -DdeviceName= -Dhub=
$ gradle test --tests "runners.apis.UserRunner" -DbaseUrl=https://reqres.in/
