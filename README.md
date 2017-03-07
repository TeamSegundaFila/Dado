#Proyecto dado

Dado equipo 3 (Fila 2) desarrollado con Java6 y Spring 3.
Multiidioma para Castellano, Euskera y el lenguaje de la calle.

![Alt text](documentacion/screenshot.png?raw=true 'El pelanas ense�andonos a ser trileros')

## Requisitos:
	Es necesario tener instalado el siguiente entorno para ejecutar la App:
	-JDK 6 o superior
	-DDBB: MySQL 5.0.8 o superior
	-Servidor Aplicaciones Tomcat6 o superior

## Instalación

	1-Ejecutar o asegurarse de que los servidores tomcat y wamp estan ejecutandose.
	2-Importar el script de la BBDD en tu gestor de base de datos.
	3-Importar el War en tu servidor de Tomcat.
	4-Desplegar tu aplicación en el servidor de Tomcat.
		http://localhost:8080/dado_eq3	
	*Si se desea cambiar las credenciales de la base de datos, modificar "\src\main\resources\database.properties" y volver a generar el WAR