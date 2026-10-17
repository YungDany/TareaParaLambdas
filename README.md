# TareaParaLambdas

Proyecto desarrollado en Java enfocado en la aplicación de programación funcional, expresiones lambda, la API Stream y el uso de colecciones (ArrayList, HashSet y HashMap).

## Descripción del Proyecto

Este repositorio contiene la solución a una asignación de 10 métodos estáticos orientados al procesamiento de colecciones, filtrado de datos, transformaciones de cadenas, manipulación de mapas y manejo de valores nulos utilizando sintaxis moderna de Java.

---

## Métodos Implementados

1. **filtroSelectivo** (`Cadenas.java`): Modifica una lista `ArrayList<String>` in-place eliminando elementos nulos, cadenas con longitud menor a N o que comiencen con una letra específica mediante `removeIf()`.
2. **convertirMayusculas** (`Cadenas.java`): Transforma los elementos no nulos de una lista a mayúsculas utilizando `map()` y recolección con `Collectors`.
3. **mapearLongitudCadena** (`Cadenas.java`): Mapea una lista de palabras a un `HashMap<String, Integer>` con la longitud de cada cadena mediante `Collectors.toMap()`.
4. **imprimirCatalogoConDescuento** (`Cadenas.java`): Recorre un mapa de productos y precios imprimiendo un descuento del 10% mediante `forEach()` y la interfaz `BiConsumer`.
5. **contarFrecuenciaPalabras** (`Cadenas.java`): Construye un mapa de frecuencias de palabras a partir de un `ArrayList` utilizando el método `merge()` de `Map`.
6. **filtrarPalabrasPorFrecuencia** (`Cadenas.java`): Filtra las entradas de un mapa de frecuencias conservando solo aquellas con valor mayor o igual a un umbral N usando `entrySet().stream()`.
7. **procesarFrasePalabras** (`Cadenas.java`): Recibe una frase larga, la separa en un arreglo de palabras, elimina la puntuación, convierte el texto a minúsculas, filtra palabras de longitud menor a N y las almacena en un `HashSet` para evitar duplicados.
8. **limitarFrecuenciaMaxima** (`Cadenas.java`): Ajusta los valores de un mapa de frecuencias estableciendo un límite máximo N mediante `replaceAll()`.
9. **cuadradosParesUnicos** (`Numeros.java`): Filtra los números pares de un `ArrayList<Integer>`, calcula sus cuadrados y los recolecta en un `HashSet` de valores únicos.
10. **filtradoNumerico** (`Numeros.java`): Procesa y selecciona elementos numéricos bajo criterios condicionales dentro de un flujo de datos.

