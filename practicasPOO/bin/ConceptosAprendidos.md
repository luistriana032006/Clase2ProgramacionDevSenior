# Información recolectada sobre los Ejercicios echos en las practicas de POO 
en esta md se mostrar la informacion tips y explicaciones recogidas durante la creacion de los ejercicios de POO 

## EjerciciosNivelIntermedio.
### SistemaNotas
 durante el desarrollo del sistema de notas para los estudiantes nos damos cuenta que las listas contienen tipos de datos sea primitivos o no primitivos 
 
 **primitivos** ([INTEGER DOUBLE FLOAT STRING...])
**no primitivos** como los tipos de alguna clase como la clase ``persona`` o ``carro`` entre otras 
 tambien pueden contener una herencia de clases.

 imaginate que tienes una clase llamada ``animal`` la cual se extiende a clases como ``perro`` y ``gato`` entonces la lista de tipo animal va almacenar objetos de perro y gato:

tambien tenemos una lista de lista
la lista de listas se basan en donde dentro de una lista cada elemento es otra lista algo asi: ``list<list<String>>``
esto es una lista de listas de String.

y todo esto se contiene dentror del operador diamante ``<>`` el cual en manejo de colecciones encierra el tipo de dato de esa lista 

## como funciona el import 
el import en java funciona para traer pakage(paquetes) de clases a otro paquete para poder utilizar las clases y metodos del paquete importado en nuestra clase actual en la que estamos trabajando, Lo cual facilita la reutilizacion de codigo 

**formas de hacerlo** 
importando antes de la clase en donde se va usar 

```
package paquete2;

// Aquí necesitas importar la clase
import paquete1.ClaseBase;

public class ClaseDerivada extends ClaseBase {
    public void metodoDerivado() {
        System.out.println("Soy un método de la clase derivada.");
    }
}
```




