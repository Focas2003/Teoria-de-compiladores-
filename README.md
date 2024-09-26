
![Logotipo, nombre de la empresa](logo.png)

**UNIVERSIDAD PERUANA DE CIENCIAS APLICADAS**

**SECCIÓN: CC61**

**GRUPO:**  

**CURSO: Teoría de compiladores**

**PROFESOR(A):** Jorge Eduardo Díaz Suarez

GRUPO 2

**Trabajo Parcial - Hito 1**

Integrantes: 


Joaquín Eduardo Velarde Leyva          U202212510                                            



Daniel Ivan Carbajal Robles         	 U20221B751                                       










**HITO 1**

**Problemática y motivación:**

El lenguaje de programación C++ tiene algunas problemáticas con respecto a su léxico. Para nuevas personas que están interesados en aprender el lenguaje e introducirse en la programación, se suele dificultar con respecto al léxico que se utiliza dentro del lenguaje mencionado. Además, para el uso de fórmulas matemáticas dentro del lenguaje se tiende a importar librerías, que en diversos casos el individuo se suele olvidar, para que pueda funcionar. 

El desarrollo de un nuevo lenguaje de programación basado en C++ se justifica por las dificultades que enfrentan los principiantes al aprender este lenguaje. Entre los principales desafíos está la complejidad del léxico y la sintaxis de C++, que es conocida por su diversidad de formas para realizar una misma tarea y por las numerosas excepciones a las reglas, lo que puede resultar intimidante y confuso para los nuevos programadores. Además, el manejo manual de memoria, necesario en C++, implica que el programador debe gestionar explícitamente la asignación y liberación de memoria, lo que añade un nivel adicional de complejidad y aumenta el riesgo de cometer errores como fugas de memoria. 

Otro desafío frecuente es el olvido de importar las librerías necesarias para realizar operaciones básicas, como las matemáticas, lo que genera errores difíciles de depurar y aumenta la frustración en los principiantes (Squirrels,2024). La motivación detrás de la creación de un nuevo lenguaje busca enfrentar estas dificultades mediante varias estrategias. En primer lugar, se pretende reducir la complejidad léxica y hacer que la terminología y las estructuras del lenguaje sean más intuitivas y accesibles para los principiantes. En segundo lugar, la incorporación de funciones matemáticas directamente en el lenguaje evitará la dependencia de librerías externas, facilitando el proceso de aprendizaje y reduciendo los errores. Finalmente, se desarrollarán herramientas de apoyo, como un analizador léxico y generadores de árboles sintácticos, que ayudarán a los programadores a comprender mejor la estructura de sus programas, contribuyendo así a una experiencia de aprendizaje más efectiva y menos frustrante (Smith,2024).





**Objetivos:** 

**Objetivo General:**

Desarrollar un nuevo lenguaje de programación basado en C++ que simplifique la sintaxis y el léxico para facilitar el aprendizaje de los principiantes, incorporando funcionalidades matemáticas básicas sin necesidad de librerías externas.

**Objetivos Específicos:**

- Simplificar la terminología y las estructuras del lenguaje para hacerlas más intuitivas y accesibles a los principiantes.
- Implementar un analizador léxico que facilite la comprensión de la estructura del código y reduzca errores.
- Incorporar funciones matemáticas predefinidas dentro del lenguaje, evitando la necesidad de importar librerías externas.
- Reducir la complejidad en la gestión de la memoria para minimizar errores comunes, como las fugas de memoria.
- Implementar un sistema de depuración simple que permita a los usuarios detectar y corregir errores de forma más intuitiva, con mensajes de error claros y sugerencias de soluciones.

**Gramática en ANTLR**

|<p>grammar parcial;</p><p></p><p>program</p><p>`    `: statement+ ;</p><p></p><p>statement</p><p>`    `: decVar</p><p>`    `| expr</p><p>`    `| structDeclaration</p><p>`    `| funcDeclaration</p><p>`    `| for</p><p>`    `| ifStatement</p><p>`    `| cincoutStatement     // Entrada/salida</p><p>`    `| comentario</p><p>`    `;</p><p></p><p>decVar</p><p>`    `: VAR\_CHAR ID (ASSIGN STRING)?</p><p>`    `| VAR\_INT ID (ASSIGN expr)?</p><p>`    `| VAR\_FLOAT ID (ASSIGN expr)?</p><p>`    `| VAR\_DOUBLE ID (ASSIGN expr)?</p><p>`    `;</p><p></p><p>expr</p><p>`    `: expr PLUS expr      </p><p>`    `| expr MINUS expr      </p><p>`    `| expr MUL expr        </p><p>`    `| expr DIV expr        </p><p>`    `| expr MOD expr        </p><p>`    `| expr POT expr        </p><p>`    `| expr LT expr         </p><p>`    `| expr GT expr         </p><p>`    `| expr NEQ expr        </p><p>`    `| expr ASSIGN expr     </p><p>`    `| expr INC             </p><p>`    `| LPAREN expr RPAREN   </p><p>`    `| NUM</p><p>`    `| NUMFLOAT</p><p>`    `| ID                  </p><p>`    `;</p><p></p><p>cincoutStatement</p><p>`    `: OUTPUT output  // cout</p><p>`    `| INPUT input    // cin</p><p>`    `;</p><p></p><p>output</p><p>`    `: STRING</p><p>`    `| ID</p><p>`    `| expr</p><p>`    `;</p><p></p><p>input</p><p>`    `: ID</p><p>`    `;</p><p></p><p>structDeclaration</p><p>`    `: STRUCT ID LLLAVE structBody RLLAVE</p><p>`    `;</p><p></p><p>structBody</p><p>`    `: decVar+</p><p>`    `;</p><p></p><p>funcDeclaration</p><p>`    `: VAR\_INT ID LPAREN paramList RPAREN LLLAVE funcBody RLLAVE</p><p>`    `;</p><p></p><p>paramList</p><p>`    `: VAR\_INT ID (',' VAR\_INT ID)\*</p><p>`    `;</p><p></p><p>comentario</p><p>`    `: COMMENT // Comentario de una línea</p><p>`    `;</p><p></p><p>funcBody</p><p>`    `: statement\* RET expr</p><p>`    `;</p><p></p><p>for </p><p>`    `: FOR LPAREN forInit? COMMA forCond? COMMA forUpdate? RPAREN LLLAVE  statement+ RLLAVE</p><p>`    `;</p><p></p><p>forInit</p><p>`    `: decVar</p><p>`    `| expr</p><p>`    `;</p><p></p><p>forCond</p><p>`    `: expr</p><p>`    `;</p><p></p><p>forUpdate</p><p>`    `: expr</p><p>`    `;</p><p></p><p>ifStatement</p><p>`    `: IF LPAREN expr RPAREN LLLAVE statement+ RLLAVE (ELSE LLLAVE statement+ RLLAVE)?</p><p>`    `;</p><p></p><p>// Lexer rules</p><p></p><p>WS       : [ \t\r\n]+ -> skip ;           // Ignorar espacios en blanco</p><p>PLUS     : 'sum';                         // Suma</p><p>MINUS    : 'res';                         // Resta</p><p>MUL      : 'mul';                         // Multiplicación</p><p>DIV      : 'div';                         // División</p><p>MOD      : '%';                           // Modular</p><p>POT      : 'pot';                         // Potencia</p><p>ASSIGN   : '=';                           // Asignación</p><p>INC      : '++';                          // Incremento</p><p>LLLAVE   : '{';                           // Llave izquierda</p><p>RLLAVE   : '}';                           // Llave derecha</p><p>LPAREN   : '(';                           // Paréntesis izquierdo</p><p>RPAREN   : ')';                           // Paréntesis derecho</p><p>LT       : '<';                           // Menor que</p><p>GT       : '>';                           // Mayor que</p><p>NEQ      : '<>';                          // Diferente</p><p>IF       : 'if';                          // Condicional</p><p>ELSE     : 'else';                        // Alternativa</p><p>FOR      : 'for';                         // Bucle</p><p>RET      : 'ret';                         // Retorno</p><p>DEF      : '#def';                        // Define constante</p><p>MAX      : 'MAX';                         // Constante MAX</p><p>VAR\_INT  : ':n';                          // Variable entera</p><p>VAR\_FLOAT: ':nF';                         // Variable float</p><p>VAR\_DOUBLE: ':nD';                        // Variable double</p><p>VAR\_CHAR : ':Ch';                         // Variable char</p><p>VAR\_STR  : ':S';                          // String</p><p>VAR\_VOID : ':V';                          // Variable void</p><p>STRUCT   : 'estruct';                     // Definición de estructura</p><p>COMMENT  : '$' .\*? '\n' -> skip ;         // Comentarios de una línea</p><p>OUTPUT   : '->';                          // Equivalente a cout</p><p>INPUT    : '<-';                          // Equivalente a cin</p><p>COMMA    : ',';                           // Separador de expresiones en el bucle for</p><p>NUMFLOAT  : [0-9]'.'[0-9];</p><p>ID       : [a-zA-Z][a-zA-Z0-9\_]\* ;        // Identificadores</p><p>NUM      : [0-9]+ ;                       // Números enteros</p><p>STRING   : '"' .\*? '"' ;                  // Cadenas de texto</p><p></p><p></p>|
| :- |

**Ejemplos de input:** 

Declaración de variable:

![](ex1.png)





![](tree1.png)






Declaración de estructura:
![](ex2.png)



![](tree2.png)












Función para la suma de dos números:
![](ex3.png)

![](tree3.png)












Entrada y salida de datos

![](ex4.png)


![](tree4.png)


Función sumatoria

![](ex5.png)



![](tree5.png)















**Bibliografía:**

` `Smith,J.,(Marzo,2024). *Análisis léxico (analizador) en diseño de compilado*r.https://www.guru99.com/es/compiler-design-lexical-analysis.html

Squirrels,J.(Mayo,2024)*¿Qué tan difícil es aprender C++?*.https://codegym.cc/es/forum/1527

