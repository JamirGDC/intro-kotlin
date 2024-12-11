
# Kotlin

### Tipos de Variables


- Entero
```kotlin
var integer: Int = 1 -> Número entero
```
- String
```kotlin
var string: String = "Hola soy una cadena de caracteres"
```
- Decimal (Double)
```kotlin
var decimal: Double = 3.14159 -> Número decimal de doble precisión
```
- Float
```kotlin
var floatNumber: Float = 2.71828f -> Número decimal de precisión simple (se debe agregar 'f')
```
- Boolean
```kotlin
var isKotlinFun: Boolean = true -> Verdadero o falso
```
- Char
```kotlin
var character: Char = 'A' -> Carácter único
```
- Byte
```kotlin
var byteValue: Byte = 127 -> Número entero pequeño (-128 a 127)
```
- Short
```kotlin
var shortValue: Short = 32000 -> Número entero de tamaño corto (-32,768 a 32,767)
```
- Long
```kotlin
var longValue: Long = 9223372036854775807 -> Número entero largo (64 bits)
```
- Array
```kotlin
var numbersArray: Array<Int> = arrayOf(1, 2, 3, 4, 5) -> Arreglo de enteros


```
- Lista mutable
```kotlin
var mutableList: MutableList<String> = mutableListOf("Kotlin", "Java", "Python") -> Lista modificable
```

- Lista inmutable
```kotlin
val immutableList: List<String> = listOf("Lunes", "Martes", "Miércoles") -> Lista no modificable
```

- Mapas
```kotlin
var mapExample: Map<String, Int> = mapOf("Uno" to 1, "Dos" to 2, "Tres" to 3) -> Mapa inmutable
```
- Map mutable
```kotlin
var mutableMap: MutableMap<String, Int> = mutableMapOf("Cuatro" to 4, "Cinco" to 5) -> Mapa modificable
```
- Nullable (puede ser nulo)
```kotlin
var nullableString: String? = null -> Variable que puede contener un valor nulo
```
- Any (puede ser de cualquier tipo)
```kotlin
var anyType: Any = "Esto puede cambiar de tipo" -> Tipo general
```
- Unit (equivalente a "void" en otros lenguajes)
```kotlin
fun printMessage(): Unit {
    println("Esto no devuelve nada.")
}
```
- Nothing (representa ausencia de valor)

```kotlin
fun failFunction(): Nothing {
    throw Exception("Esto lanza una excepción.")
}
```

### Function Print

- Tipos de Print
```kotlin
println("Hola, mundo!") -> Imprime y añade un salto de línea
print("Hola, Kotlin") -> Imprime sin añadir un salto de línea
print("!") -> Continúa en la misma línea
```
- Imprimir variables
```kotlin
val nombre = "Juan"
    val edad = 25
    println("\nMi nombre es $nombre y tengo $edad años.") -> Uso de interpolación
```
- Concatenación de cadenas
```kotlin
println("Esto es una " + "concatenación.")
```
- Imprimir expresiones
```kotlin
println("La suma de 5 + 3 es ${5 + 3}.") -> Evaluar expresiones dentro de una cadena
```
- Imprimir valores formateados
```kotlin
val pi = 3.14159
    println("El valor de Pi es aproximadamente %.2f".format(pi)) -> Formatear con 2 decimales
```

- Uso de bucles para imprimir
```kotlin
for (i in 1..5) {
        println("Número: $i") -> Imprime cada número del 1 al 5
    }
```
- Imprimir listas o colecciones
```kotlin
val lista = listOf("Kotlin", "Java", "Python")
    println("Lista de lenguajes: $lista")
```
- Imprimir mapas
```kotlin
val mapa = mapOf("Uno" to 1, "Dos" to 2, "Tres" to 3)
    println("Mapa: $mapa")
```
- Uso de funciones con print
```kotlin
fun imprimirMensaje(mensaje: String) {
        println("Mensaje recibido: $mensaje")
    }
    imprimirMensaje("¡Hola desde una función!")
```

### Bucles

#### Bucle For
```Kotlin
for (i in 1..5) {
    println("Número: $i")
}
```

#### Saltos de control 
- Break
```kotlin
for (i in 1..10) {
    if (i == 5) break
    println("Número: $i")
}
```

- Continue
```kotlin
for (i in 1..5) {
    if (i == 3) continue
    println("Número: $i")
}
```

#### Bucle While
```Kotlin
var contador = 1
while (contador <= 5) {
    println("Contador: $contador")
    contador++
}
```

#### Bucle Do-While
```Kotlin
var contador = 1
do {
    println("Valor: $contador")
    contador++
} while (contador <= 5)
```

#### Iterar sobre colecciones
```Kotlin
val lista = listOf("Kotlin", "Java", "Python")
for (lenguaje in lista) {
    println("Lenguaje: $lenguaje")
}
```

### Expresiones de control condicional

#### When

- Sintaxis Basica

```kotlin
when (expresión) {
    valor1 -> acción1
    valor2 -> acción2
    in rango -> acción3
    else -> acciónDefault
}
```
- Ejemplo 1Comparacion de Valores
```kotlin
val dia = 3

val nombreDia = when (dia) {
    1 -> "Lunes"
    2 -> "Martes"
    3 -> "Miércoles"
    4 -> "Jueves"
    5 -> "Viernes"
    6, 7 -> "Fin de Semana" -> conbinación
    else -> "Día no válido" -> caso predeterminado
}
println(nombreDia)

```

- Ejemplo 2 Rango y Condiciones
```kotlin
val numero = 15

val resultado = when {
    numero in 1..10 -> "Está entre 1 y 10"
    numero in 11..20 -> "Está entre 11 y 20"
    numero > 20 -> "Es mayor que 20"
    else -> "Es menor o igual a 0"
}
println(resultado)

```

- Ejemplo 3 Comprobacion de Tipos
```kotlin
fun describir(objeto: Any): String {
    return when (objeto) {
        is String -> "Es una cadena de texto"
        is Int -> "Es un número entero"
        is Double -> "Es un número decimal"
        else -> "Tipo desconocido"
    }
}
println(describir("Kotlin"))
println(describir(42))       
println(describir(3.14))    
```

- Ejemplo 4 Como declaracion No return

```kotlin
val comando = "ayuda"
when (comando) {
    "iniciar" -> println("Iniciando...")
    "detener" -> println("Deteniendo...")
    "ayuda" -> println("Mostrando ayuda...")
    else -> println("Comando desconocido.")
}
```

#### If else

```kotlin
val numero = 10
if (numero > 0) {
    println("El número es positivo")
} else if (numero < 0) {
    println("El número es negativo")
} else {
    println("El número es cero")
}

Expresion Ternario?? idk

val resultado = if (numero > 0) "Positivo" else "No positivo"
println(resultado)

```

