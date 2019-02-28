#Design Pattern Strategy

##¿Que es?
Strategy es un patrón de diseño de comportamiento que nos permite definir una familia de algoritmos, separar cada uno de ellos por clase y hacer que sus objetos sean intercambiables. 

Este patrón se determina de comportamiento por que determina cómo se debe realizar el intercambio de mensajes entre diferentes objetos para resolver una tarea. 

El esquema de este patrón esta conformado por lo siguiente: 
###Contexto
Mantiene una referencia a una de las estrategias concretas y se comunica con este objeto solo a través de la interfaz de la estrategia
###Interfaz
Esta interfaz debe de ser común para toda la familia de algoritmos.
###Estrategias
Implemetan diferentes explicaciones de un algoritmo que usa el context. 

##Funcionamiento del programa. 
###Todos los archivos que se mencionarán a continuación se encuentran en la carpeta src/com/axity/strategy.
## #


