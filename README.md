Práctica

1.- Desarrollar una Api REST con spring boot que reciba un objeto (ejemplo: datos de un usuario), lo mapeé en una clase y lo guarde en una base de datos (definida por el postulante).

    - https://gitlab.com/veliezer/testdeveloperfab/tree/master/springboot-servicio-customer

2.- Desarrollar un servicio que reciba mensajes desde PubSub (servicio de mensajeria GCP) y llame al anterior servicio a través de POST.

    - https://gitlab.com/veliezer/testdeveloperfab/tree/master/springboot-servicio-pubsub

3.- Agregar un nuevo endpoint a la Api REST del punto 1, éste debe leer desde la base de datos (punto 1), que tiene un total de 1.000.000 de filas (generarlos de manera aleatoria) y la latencia debe ser menor a 1 segundo.


Teoría

4.- Se debe generar una Api REST, pero el desarrollador no tiene conocimientos de arquitectura, que componente de GCP puede usar?

    - Google App Engine o Google Cloud Functions

5.- Si tuvieras que desplegar la aplicación de los puntos practicos, como lo harias? que componentes GCP? (hacer un diseño, drawio esta bien).

    - https://gitlab.com/veliezer/testdeveloperfab/blob/master/arquitecturaPropuesta.drawio
    - https://gitlab.com/veliezer/testdeveloperfab/blob/master/arquitecturaPropuesta.png