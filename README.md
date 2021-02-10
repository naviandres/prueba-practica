# prueba-practica

A continuación se realiza una explicación de la arquitectura, patrones y técnica utilizada en el desarrollo de prueba-practica.
###### MVC

El Proyecto prueba-practica tiene implementado arquitectura de software MVC, la cual sirve para separar el código en capas dependiendo de la responsabilidad que maneja, de esta manera se puede dar un mejor mantenimiento al código.
###### ORM

Permite mapear la estructura de la base de datos, en prueba-practica se implementa el API JPA para realizar esta acción y crear una entidad que a su vez es serializable para que se pueda comunicar a través de la red.
###### DAO

Este patrón nos ofrece acceso a los datos, en este caso spring nos facilita la interfaz JpaRepository para gestionar las operaciones con la base de datos.
###### Rest

Con los servicios REST se puede enviar datos a través de la red por el protocolo HTTP.En la vistas los servicios rest son consumidos con AJAX para el posterior manejo de la data.
