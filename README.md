
# Prueba Técnica Parqueadero - Nelumbo
## API EMAIL

En este README se va a explicar como ejecutar el proyecto ya sea de manera local o
de manera remota desde los enlaces de despliegue.




## Prerrequisitos

- Se debe tener una version de java 17 o superior.


- Tener el puerto 8081 disponible ya que el proyecto se ejecuta en este por defecto.
## Ejecutar en local

**1** - Clonar el proyecto:

```bash
  https://github.com/ANCB03/prueba-tecnica-email.git
```

**2** - Abrir el proyecto en el entorno de desarrollo que uses.

**3** - Descargar las depenedencias que usa el proyecto en el pom(En IntelliJIDEA está el reload project de maven).


**5** - Configurar variables de entorno, estas se encuentran en el siguiente archivo dentro del proyecto:
```bash
  src/main/resources/application.properties
```
En este caso dejaré aquí las credenciales de la base de datos que está alojada en RDS AWS:

`EMAIL` `ancabe1403@gmail.com`

`PASSWORD`   `apdxdauwklzjyqcq`


**6** - Ejecutar el proyecto.

**7** - Una vez ejecutado el proyecto este estará en el puerto 8081 y se podrán hacer peticiones desde esta base url:

```bash
  http://localhost:8081
```
## Ejecutar desplegada

Sí quieres ejecutar la API parqueadero desplegada debes usar la siguiente url base:
```bash
  https://email-latest.onrender.com
```
tener en cuenta que puede demorarse la primera vez ya que es un servicio en el tier free de render y este se apaga si no se usa después de un tiempo. Por lo tanto puede demorar un poco en iniciar.
## Autor

- [@ANCB03](https://www.github.com/ancb03)

