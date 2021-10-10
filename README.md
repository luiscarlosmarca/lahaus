
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
## Ejecucion
***
$ Test Mobile: gradle test --tests "runners.mobile.BusquedaPropiedadRunner" -DdeviceName=29bc719f -Dhub=http://127.0.0.1:4723/wd/hub
$ Test Apis Rest: gradle test --tests "runners.apis.UserRunner" -DbaseUrl=https://reqres.in/
