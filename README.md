# Practica01
Practica realizada para la asignatura de programacion aplicada

ACTIVIDADES DESARROLLADAS
1.	Describir 10 objetos relacionados a tema de Restaurantes.

En este paso se realizo un razonamiento para abstraer varios objetos que un restaurante puede tener y los pensados son los siguientes:
Plato de entrada
Tipo de comida	
Precios
Nombre 
Hora de entrada	
Sueldo
Mesa
Cuchara			
Plato
Código
Horario	 
Número de mesa
Número de local
Nombre			
Dirección


2.	De los 10 objetos descritos en el paso 1, abstraer 5 de ellos en clases y diagramarlas con tres atributos y tres métodos 
para cada clase.

Aquí se realizó una unión de los diferentes objetos para así de esta manera empezar a crear las clases que son necesarias y 
comunes entre los objetos. Las clases entonces serían las siguientes:

Plato de entrada
Tipo de comida		menú
Precios

Nombre 
Hora de entrada		Empleado
Sueldo

Mesa
Cuchara			utensilio
Palto

Código
Horario	 		reservación
Número de mesa

Número de local
Nombre			sucursal
Dirección
 
 
3.	Crear un proyecto Java en Netbeans llamado Practica01-SuApellidoNombre y sobre el mismo codificar las 5 clases seleccionadas en java
utilizando: atributos, métodos y encapsulamiento con los métodos getters and setters.  

En este método llamado “Utensilio” es creado para en este poder almacenar los diferentes datos de el mismo como la cantidad de mesas 
existentes, los números de platos que se encuentran y la cantidad de cucharas que existen en el restaurante.
   
En este metodo llamado “Sucursal” se almacenan los datos de cada uno de los locales es decir el numero del local, 
el nombre del restaurante y la direccion de dicho restaurante.
   
El metodo llamado “Reservacion” es creado para los momentos en los que el restaurante tenga una reservacion y ahì se encuentran 
almenado los datos del codigo de la reservacion, numero de la mesa reserva y la hora en la que fue reservada.

El metodo “Menu” es utiizado para almacenar los datos de la seccion de tipos de comida, el nombre de la comida y el costo de la comida.

El metodo “Empleado” es necesario para almacenar el nombre del empleado, el sueldo que tiene y la hora de entrada que
tiene dicho empleado.
   

4.	Implementar el método toString() en cada clase.

El método “toString()” es utilizado para juntar toda la información de cada clase que ha sido ingresado y así de esta 
manera se va a mostrar cada información que ha sido ingresada anteriormente.
     
     
5.	Programar una clase principal (tipo main) que permita crear un objeto (instanciar) de cada clase referida en el 
punto anterior, estableciendo/seteando los datos/valores ingresados por el usuario (usando la clase Scanner) y posterior
muestre dicha información del objeto en la consola de Netbeans.

El menú principal es creado para poder llamar todas las clases creadas y mostradas anteriormente para así de esta 
manera ser utilizadas para almacenar toda la información que pertenece a cada una y luego ser visualizada o ingresar 
nuevamente los datos si es necesario mediante una menú que se ha creado con una opción para cada uno de los métodos. 
    
    
6.	Crear un repositorio en GitHub y subir el código del proyecto de NetBeans. En el archivo README del repositorio 
debe constar la misma información del informe de resultados de la práctica que se indica en el siguiente punto.

En GitHub se ingresa para crear un nuevo repositorio y así de esta manera poder subir todo el proyecto de NetBeans con 
todos sus archivos y así de esta manera cualquier persona puede verlo y editarlo si es necesario, con su respectivo 
README para que se tenga toda la información de dicho proyecto.
 
