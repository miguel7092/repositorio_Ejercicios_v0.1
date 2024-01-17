# repositorio_Ejercicios_v0.1
Son ejercicios de la versión 0.1 en java

## índice
- [Estructura de control if y else](#estructura-de-control-if-y-else)
- [While](#while)

# Estructuras de control en Java
- Las estructuras de control tienen las siguientes características:
  - Tienen un único punto de entrada y un único punto de salida. 
  - Están compuestas por instrucciones o por otras estructuras de control.

## **Estructura de control if y else**

> [!IMPORTANT]
> Los ejercicios son:
> - If y Else
>   - parOImpar
>   - parOImparTernario
>   - [aniobisiesto](https://github.com/miguel7092/repositorio_Ejercicios_v0.1/blob/main/Graf_algo_bisiesto.png?raw=true)
>   - 

> [!NOTE]
>
> El if evalúa una expresión booleana y ejecuta un bloque de código si la expresión es verdadera.
> El else se usa para especificar un bloque de código alternativo que se ejecuta si la expresión
> del if es falsa.

> [!TIP]
>
> - Siempre uses llaves {} para delimitar los bloques de código que se ejecutan en cada caso. Esto te ayudará
> a evitar errores de sintaxis y a mejorar la legibilidad de tu código
> 
>- Si lo que se quiere es agregar más de una línea de código en cada caso, tendrás que usar llaves de todas formas. Además,
>si no usas llaves, puede ser más difícil identificar qué código pertenece a cada caso.
>
>- Usa paréntesis para agrupar las expresiones booleanas que usas en el if. Esto te ayudará a evitar errores
>de lógica y a clarificar el orden de las operaciones.

>[!CAUTION]
>
>- Evitar el problema del else confuso (dangling else), que ocurre cuando hay varios if anidados sin llaves y no queda claro
>a qué if corresponde el else. Esto puede generar resultados inesperados o errores de compilación. Para evitarlo,
>se recomienda usar siempre llaves o indentar correctamente el código.
>
>- Usar el operador ternario (?:) cuando se quiere asignar un valor a una variable dependiendo de una condición. Esto permite
> escribir el código de forma más compacta y legible que usando un if-else

>[!WARNING]
>
>- El operador ternario puede ser más factible que el if-else en algunos casos, pero no siempre. Depende de la complejidad y la claridad
>de la condición y los valores que se quieren asignar. El operador ternario tiene las siguientes ventajas sobre el if-else:
>   - Permite escribir el código de forma más compacta y legible, evitando repetir la variable que se quiere asignar.
>   - Puede usarse en lugares donde el if-else no es válido, como en la inicialización de variables, la asignación de parámetros
>     o el retorno de métodos.
> - Sin embargo, el operador ternario también tiene algunas desventajas o limitaciones:
>   - No puede usarse para ejecutar bloques de código con varias instrucciones, solo para asignar valores simples.
>   - No puede anidarse más de una vez, ya que se vuelve muy difícil de leer y entender.
>   - Puede generar errores si se usan tipos de datos incompatibles o se omiten los paréntesis.
>
>Por lo tanto, el operador ternario puede ser más factible que el if-else cuando la condición y los valores son simples y claros, y cuando se quiere asignar un valor a una variable dependiendo de una condición. En otros casos, es mejor usar el if-else para evitar confusiones y errores.

## **While**
