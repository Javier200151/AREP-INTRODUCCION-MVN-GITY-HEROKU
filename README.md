# TAREA INTRODUCCIÓN MVN-GITY HEROKU
Este desarrollo es una aplicación para consultar el mercado de valores de las acciones negociadas en Bolsa. La aplicación recibe el identificador de una acción, por ejemplo “FB” para Facebook  y mostrará el histórico de la valoración intra-día, diaria, semanal y mensual.

## Autor
* Javier Esteban López Peña

## Contrucción
* Visual Studio Code - Editor de código y ambiente de desarrollo
* Maven - Gestor de dependencias
* JUnit - Pruebas unitarias

# Lenguajes
* HTTP
* JavaScript
* Java

## Pre-Requisitos
* Tener git instalado
* Tener maven instalado
* Usar la version de Java 8

## Utilización
Esta aplicación se encuentra desplegada en Heroku, por esta razón para poder probarlo se deben seguir por el siguiente enlace

[![Deploy](https://www.herokucdn.com/deploy/button.svg)](https://sparkwebapparep.herokuapp.com/)

## Diseño

![](images/ArquitecturaSimpleEjercicio.png)

* Se esta usando el API gratuito https://www.alphavantage.co/documentation, se creo un servidor fachada exponiendo servicios REST y un cliente escrito en JS invocando estos servicios.
* Se implemento un Cache Singleton, sacrificando memoria en pro de no realizar consultas repetidas a la API.
* Aplicación desplegada en Heroku usando sparkweb
* Para la extensibilidad se agrega una nueva función al servidor fachada que llame a la API externa