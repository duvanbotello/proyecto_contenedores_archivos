# Requerimientos Del Sistema

La biblioteca de la Universidad de Pamplona, necesita construir un software en lenguaje java con el uso de contenedores (LinkedList, ArrayList), y archivos planos, que le permita tener un control sobre el material, usuarios, préstamos y devoluciones. Se debe tener los siguientes contenedores:

* Material: id_material, nombre, tipo, (libro=1, revista=2, tesis=3), Editorial, cantidad existente.
* Usuario: id_usuario, nombre, (estudiante=1, profesor=2, externo=3), teléfono Alumnos_x_semestre: código alumno, semestre en el que se encuentra matriculado
* Presamos: id_prestamo, id_usuario, id_material, fecha_prestamo
* Devoluciones: id_devolución, id_usuario, id_material, fecha_devolución

Los préstamos de material se dan en la siguiente tabla:

MATERIAL TIEMPO DE PRESTAMO
Libro      3      días
Revista    4      días
Tesis      5      días

Si el usuario no entrega el material según fecha de entrega, debe pagar una multa (1000 pesos x día).

* El material no se puede repetir, siendo la llave de búsqueda id_material
* El usuario no se puede repetir, siendo la llave de búsqueda id_usuario
* Los alumnos se pueden repetir en el contenedor Alumnos_x_semestre.
* Los alumnos se pueden repetir en el contenedor de prestamos, pero el id_prestamo debe ser un consecutivo
* Los alumnos se pueden repetir en el contenedor de devoluciones, pero el id_devolucion debe ser un consecutivo

Cada material que se preste o devuelva debe actualizar la cantidad existente.

El software debe contener:

1. Registro de objetos a los contenedores material, usuario, alumnos_x_semestre, prestamos, devoluciones.
2. Consultas a los contenedores por su llave de búsqueda
3. Modificación de objetos
4. Listado de material, usuarios, alumnos por semestre, préstamos y devoluciones
5. Dado el código de un alumno, listar todos los materiales prestados
6. Dado el id del usuario, listar los materiales prestados según fecha inicial y final
7. Dado el id del usuario, listar las devoluciones según fecha inicial y final
8. Listado de los deudores morosos
9. Listado de material según su tipo
10. Listado de material según su editorial
11. Listado de usuarios según su tipo

Generar archivos planos por las opciones 4, 5, 6, 7, 8, 9, 10, 11.

# Otros datos

- La contraseña para acceder al sistema es ->  User: 1090499082 password: 123
- Las librerias necesarias para ejecutar el proyecto se encuentras en https://github.com/duvanbotello/proyecto_contenedores_archivos/tree/master/dist/lib

# Imagenes

<img src="https://github.com/duvanbotello/proyecto_contenedores_archivos/blob/master/imagenes/1.PNG">

<img src="https://github.com/duvanbotello/proyecto_contenedores_archivos/blob/master/imagenes/2.PNG" width="800">

<img src="https://github.com/duvanbotello/proyecto_contenedores_archivos/blob/master/imagenes/3.PNG" width="800">

<img src="https://github.com/duvanbotello/proyecto_contenedores_archivos/blob/master/imagenes/4.PNG" width="800">

<img src="https://github.com/duvanbotello/proyecto_contenedores_archivos/blob/master/imagenes/5.PNG" width="800">

<img src="https://github.com/duvanbotello/proyecto_contenedores_archivos/blob/master/imagenes/6.PNG" width="800">

<img src="https://github.com/duvanbotello/proyecto_contenedores_archivos/blob/master/imagenes/7.PNG" width="800">
