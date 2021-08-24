# TAREA INTRODUCCIÓN MVN-GITY HEROKU
Este desarrollo es una aplicación para consultar el mercado de valores de las acciones negociadas en Bolsa. La aplicación recibe el identificador de una acción, por ejemplo “FB” para Facebook  y mostrará el histórico de la valoración intra-día, diaria, semanal y mensual.

## Autor
* Javier Esteban López Peña

## Contrucción
* Visual Studio Code - Editor de código y ambiente de desarrollo
* Maven - Gestor de dependencias
* JUnit - Pruebas unitarias

## Pre-Requisitos
* Tener git instalado
* Tener maven instalado
* Usar la version de Java 8

## Primeros Pasos
Esta aplicación se encuentra desplegada en Heroku, por esta razón para poder probarlo se deben seguir por el siguiente enlace

[![Deploy](https://www.herokucdn.com/deploy/button.svg)](https://sparkwebapparep.herokuapp.com/)

## Modificaciones


## Documentación
Para ver la documentacion del proyecto puede ejecutar por consola los comandos:
```
    mvn javadoc:javadoc
    mvn site
    mvn site:run
```
Luego de esto dirijase a su navegador preferido y digite:
```
    http://localhost:8080/apidocs/index.html
```
Y estara directamente en la documentación del proyecto. O si lo prefiere de otra forma, puede
usar el archivo index.html que se encuentra en la siguiente ruta del proyecto:
```
    Laboratorio-No.01-AREP/docs/index.html
```
donde tambien podra acceder a la documentación del proyecto.