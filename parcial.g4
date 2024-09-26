grammar parcial;

program
    : statement+ ;

statement
    : decVar
    | expr
    | structDeclaration
    | funcDeclaration
    | for
    | ifStatement
    | cincoutStatement     // Entrada/salida
    | comentario
    | sumatoria
    ;

decVar
    : VAR_CHAR (ID corcht? (ASSIGN STRING)? COMMA?)* 
    | VAR_INT (ID corcht? (ASSIGN expr)? COMMA?)* 
    | VAR_FLOAT (ID corcht? (ASSIGN expr)? COMMA?)* 
    | VAR_DOUBLE (ID corcht? (ASSIGN expr)? COMMA?)* 
    ;

expr
    : expr PLUS expr      
    | expr MINUS expr      
    | expr MUL expr        
    | expr DIV expr        
    | expr MOD expr        
    | expr POT expr        
    | expr LT expr         
    | expr GT expr         
    | expr NEQ expr        
    | expr ASSIGN expr     
    | expr INC             
    | LPAREN expr RPAREN   
    | NUM
    | NUMFLOAT
    | ID     
    | sumatoria 
    
    ;

cincoutStatement
    : OUTPUT output  // cout
    | INPUT input    // cin
    ;

output
    : STRING
    | ID
    | expr
    ;

input
    : ID
    ;

structDeclaration
    : STRUCT ID LLLAVE structBody RLLAVE
    ;

structBody
    : decVar+
    ;

funcDeclaration
    : VAR_INT ID LPAREN paramList RPAREN LLLAVE funcBody RLLAVE
    ;

paramList
    : VAR_INT ID (',' VAR_INT ID)*
    ;

comentario
    : COMMENT // Comentario de una línea
    ;

funcBody
    : statement* RET expr
    ;

for 
    : FOR LPAREN forInit? COMMA forCond? COMMA forUpdate? RPAREN LLLAVE  statement+ RLLAVE
    ;

forInit
    : decVar
    | expr
    ;

forCond
    : expr
    ;

forUpdate
    : expr
    ;

ifStatement
    : IF LPAREN expr RPAREN LLLAVE statement+ RLLAVE (ELSE LLLAVE statement+ RLLAVE)?
    ;

corcht
    :  CL expr? CR
    ;
    
sumatoria
    : 'sumatoria' LPAREN expr COMMA expr COMMA expr RPAREN
    ;

// Lexer rules

WS       : [ \t\r\n]+ -> skip ;           // Ignorar espacios en blanco
PLUS     : 'sum';                         // Suma
MINUS    : 'res';                         // Resta
MUL      : 'mul';                         // Multiplicación
DIV      : 'div';                         // División
MOD      : '%';                           // Modular
POT      : 'pot';                         // Potencia
ASSIGN   : '=';                           // Asignación
INC      : '++';                          // Incremento
LLLAVE   : '{';                           // Llave izquierda
RLLAVE   : '}';                           // Llave derecha
CL       : '[';
CR       : ']';
LPAREN   : '(';                           // Paréntesis izquierdo
RPAREN   : ')';                           // Paréntesis derecho
LT       : '<';                           // Menor que
GT       : '>';                           // Mayor que
NEQ      : '<>';                          // Diferente
IF       : 'if';                          // Condicional
ELSE     : 'else';                        // Alternativa
FOR      : 'for';                         // Bucle
RET      : 'ret';                         // Retorno
DEF      : '#def';                        // Define constante
MAX      : 'MAX';                         // Constante MAX
VAR_INT  : ':n';                          // Variable entera
VAR_FLOAT: ':nF';                         // Variable float
VAR_DOUBLE: ':nD';                        // Variable double
VAR_CHAR : ':Ch';                         // Variable char
VAR_STR  : ':S';                          // String
VAR_VOID : ':V';                          // Variable void
STRUCT   : 'estruct';                     // Definición de estructura
COMMENT  : '$' .*? '\n' -> skip ;         // Comentarios de una línea
OUTPUT   : '->';                          // Equivalente a cout
INPUT    : '<-';                          // Equivalente a cin
COMMA    : ',';                           // Separador de expresiones en el bucle for
NUMFLOAT : [0-9]'.'[0-9];
ID       : [a-zA-Z][a-zA-Z0-9_]* ;        // Identificadores
NUM      : [0-9]+ ;                       // Números enteros
STRING   : '"' .*? '"' ;                  // Cadenas de texto


