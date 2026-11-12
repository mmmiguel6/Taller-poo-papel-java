# Respuestas a Escenarios Exploratorios ("¿Y si...?") - Clases y Objetos Java 25

Este documento argumenta la base teórica y algorítmica de la programación orientada a objetos evaluada en los ejercicios del taller.

* **01 Tu mascota virtual: primera clase**
  * **¿Qué imprime `m.energia` si nunca le asignas un valor?**
    Imprimirá `0`. En el paradigma orientado a objetos de Java, los atributos numéricos de clase no inicializados explícitamente se construyen automáticamente con un valor por defecto de cero.
* **02 LavaYa: dos lavadoras, dos objetos**
  * **¿Cuántas veces escribirías la clase si la lavandería tuviera 20 lavadoras?**
    Solamente una vez. La clase actúa como la plantilla (molde). Una vez definida la clase `Lavadora`, se pueden instanciar infinitos objetos usando `new Lavadora()` en memoria.
* **03 Tienda de accesorios: tu primer método**
  * **¿Qué ventaja tiene `p.mostrar()` frente a escribir el println en main cada vez?**
    Permite encapsular el comportamiento. Al centralizar la lógica de impresión en el propio objeto, si se necesita alterar el formato visual en el futuro, solo se modifica el método `mostrar()`, reflejándose los cambios en todas las instancias de manera simultánea.
* **04 Billetera digital: depositar y retirar**
  * **¿Cómo agregarías un método `transferir(Billetera otra, int monto)`?**
    Se define el método exigiendo como parámetro de entrada un objeto tipo `Billetera`. Dentro, se valida `if (this.saldo >= monto)`. De ser verdadero, se resta del objeto actual (`this.retirar(monto);`) y se suma al receptor referenciado (`otra.depositar(monto);`).
* **05 Videojuego: vida del personaje**
  * **¿Qué devuelve `estaVivo()` en la tercera prueba?**
    Retornará `false`. Al aplicar un daño masivo (120) sobre una vida de 80, la validación del método de daño dejará la vida en el límite inferior (`0`). Por tanto, la verificación lógica `vida > 0` resulta negativa.
* **06 Estudiantes: el constructor**
  * **¿Qué pasa si escribes `nombre = nombre;` sin `this`?**
    Se genera un fenómeno llamado *Shadowing* (sombreado de variables). El compilador asume que el identificador local (parámetro) se está asignando a sí mismo, por lo que el atributo real del objeto permanecerá apuntando a `null`.
* **07 LavaYa: pedidos con constructor**
  * **¿Cómo darías 10% de descuento a pedidos de más de 15 kilos?**
    En el método `total()`, antes del `return`, se aplica una verificación condicional: `if (this.kilos > 15)`. Si aplica, se modifica la variable de sumatoria temporal a su 90%: `precio = (int)(precio * 0.9);`.
* **08 TeleRed: proteger el saldo con private**
  * **¿Por qué no hay un método `setSaldo(int s)` que deje poner cualquier valor?**
    Porque corrompe el encapsulamiento y compromete la integridad del modelo. Un método *setter* público puro eludiría las reglas de negocio impuestas por la empresa (por ejemplo, el abono mínimo de $1000). El estado interno debe protegerse.
* **09 Tu playlist: el método toString()**
  * **¿Qué pasaría con una canción de 185 segundos? ¿Cómo mostrarías "3:05"?**
    Un residuo nativo (`185 % 60`) devolverá el entero `5`, imprimiendo erróneamente `3:5`. Para solventarlo visualmente, debe formatearse el String utilizando funciones estándar: `String.format("%d:%02d", min, seg)` que forzará la impresión de ceros en la izquierda.
* **10 Duelo gamer: objetos que interactúan**
  * **¿Cómo evitarías que la vida quede negativa?**
    Implementando en el método un control de límite antes o después de calcular el diferencial de impacto: `if (rival.vida - this.ataque < 0) { rival.vida = 0; } else { rival.vida -= this.ataque; }`.
* **11 LavaYa: un array de objetos**
  * **¿Cómo marcarías como ocupada la primera lavadora libre?**
    A través de un ciclo `for` iterativo. Cuando se verifique el primer caso booleano falso (`if (!sala[i].ocupada)`), se sobreescribe el estado de la instancia (`sala[i].ocupada = true;`) y se frena en seco el ciclo mediante el estatuto `break;`.
* **12 Reto final: facturación de TeleRed**
  * **¿Qué método agregarías para saber si un cliente debería cambiarse a un plan más grande?**
    Se podría implementar un método `boolean sugerirPlanMayor()` evaluando los consumos actuales respecto a los topes de su nivel. Por ejemplo, `return this.gigas > 15;`, que permita notificar al `main` el estatus sin alterar las métricas de cálculo.
```[cite: 8, 9, 10, 11, 12, 13, 14, 15, 16, 17, 18, 19]
