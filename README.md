# Design Pattern Strategy

## ¿Que es?
Strategy es un patrón de diseño de comportamiento que nos permite definir una familia de algoritmos, separar cada uno de ellos por clase y hacer que sus objetos sean intercambiables. 

Este patrón se determina de comportamiento por que determina cómo se debe realizar el intercambio de mensajes entre diferentes objetos para resolver una tarea. 

## Estructura
El diagrama de este patrón esta conformado por lo siguiente: 

![alt text](https://refactoring.guru/images/patterns/diagrams/strategy/structure.png)

### Contexto
Mantiene una referencia a una de las estrategias concretas y se comunica con este objeto solo a través de la interfaz de la estrategia
### Interfaz
Esta interfaz debe de ser común para toda la familia de algoritmos.
### Estrategias
Implemetan diferentes explicaciones de un algoritmo que usa el context. 

## Funcionamiento del programa
Siguiendo el diagrama anterior, la familia de estrategias son los archivos PaypalStrategy.java y CreditCardStrategy.java en cual, cada uno de ellos implementa un método distinto pero en común que es el poder pagar ya sea por Tarjeta de Crédito/Débito o a través de Paypal. Éste método fue declarado en la interfaz PaymentStratgy.java como pay() en el cual es implementado en las estrategias segun sus necesidades. 
Posteriormente, en la parte de Context tenemos los archivos Item.java, ShoppingCart.java y Main.java. Comenzado por el primero de ellos, la clase Item sólo obtiene las caracteristicas de los productos tales como un código de identificación de producto (upcCode) y el precio (price) y generamos el getters para acceder a sus propiedades. 
La segunda clase ShoppingCart.java el comportamiento se asemeja al carrito de compras donde ahi tiene los métodos necesarios para agrear un producto (addItem), remover el producto (removeItem), el método para poder realizar el total de la compra de productos (calculeTotal) y por ultimo el metodo "pay()" va a ser la referencia desde el contexto hasta la familia de algoritos, es el que va a indicar que forma de pago se realizará (por tarjeta de Credito,Débito o Paypal).
Por último, en la clase Main.java se implementa el funcionamiento del sistema, comenzado por crear dos objetos (productos) en el cual gracias a método constructor, nos pide el código de identfiicación del producto con su respectivo precio, posteriormente se crea el objeto (cart) para poder crear el carrito y añadir los productos enseguida con el mismo objeto se le va a indicar que forma de pago se va a realizar creando su estancia de la estrategia y colocando sus argumentos para el constructor.