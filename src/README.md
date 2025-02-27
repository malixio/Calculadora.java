Calculadora en Java y Ejemplos de Tipos de Datos

Descripción:

La calculadora desarrollada en Java incluye ocho operaciones principales, cada una implementada mediante métodos específicos. A continuación, se detallan las funcionalidades y su implementación en código.
- Operaciones: Suma, Resta, Multiplicación, División, Potenciación, Raíz cuadrada, Módulo y Conversión de unidades.
- Implementado con estructuras de control y operadores en Java.
1. Suma:
   Permite sumar dos números enteros o decimales.

Código:

public static double suma(double a, double b) {
return a + b;
}

Ejemplos de uso:

double resultado = suma(5, 3);  // Devuelve 8.0
2. Resta:
   Calcula la diferencia entre dos números.

Código:

public static double resta(double a, double b) {
return a - b;
}

Ejemplo de uso:

double resultado = resta(10, 4);  // Devuelve 6.0
3. Multiplicación:
   Multiplica dos números ingresados por el usuario.

Código:

public static double multiplicacion(double a, double b) {
return a * b;
}

Ejemplo de uso:

double resultado = multiplicacion(6, 7);  // Devuelve 42.0
4. División:
   Realiza la división entre dos números y maneja la excepción de división por cero.

Código:

public static double division(double a, double b) {
if (b == 0) {
System.out.println("Error: No se puede dividir por cero.");
return 0;
}
return a / b;
}

Ejemplo de uso:

double resultado = division(20, 4);  // Devuelve 5.0

5. Potenciación:
Eleva un número a una determinada potencia usando Math.pow().

Código:

public static double potencia(double base, double exponente) {
return Math.pow(base, exponente);
}
Ejemplo de uso:

double resultado = potencia(2, 3);  // Devuelve 8.0 (2³)

6. Raíz Cuadrada:
   Calcula la raíz cuadrada de un número positivo.

Código:

public static double raizCuadrada(double numero) {
if (numero < 0) {
System.out.println("Error: No se puede calcular la raíz cuadrada de un número negativo.");
return 0;
}
return Math.sqrt(numero);
}

Ejemplo de uso:

double resultado = raizCuadrada(25);  // Devuelve 5.0

7.Módulo:
Obtiene el residuo de la división entre dos números.

Código:

public static double modulo(double a, double b) {
return a % b;
}

Ejemplo de uso:

double resultado = modulo(10, 3);  // Devuelve 1.0

8. Conversión de Unidades (Celsius a Fahrenheit)
   Convierte temperaturas de grados Celsius a Fahrenheit usando la fórmula:

F= (C*9/5)+32

Código:

public static double celsiusAFahrenheit(double celsius) {
return (celsius * 9/5) + 32;
}

Ejemplo de uso:

double resultado = celsiusAFahrenheit(30);  // Devuelve 86.0


- Requisitos
- Java 8 o superior.
- IDE como IntelliJ, Eclipse o VS Code.
  Instrucciones de Uso
1. Clonar el repositorio:
   ```bash
   git clone [URL DEL REPOSITORIO]
   
Integrentes del Equipo

Alarcon Pacalagua Nelcy Jasbleidy
Alarcon Sergio Mauricio
Salazar Maryuri

Uso de Ramas en Git
Master
Develope