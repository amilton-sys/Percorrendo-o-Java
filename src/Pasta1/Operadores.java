package Pasta1;
/// Operadores em Java
/// Operador em Java é um símbolo usado para executar operações. Por exemplo: +, -, *, / etc.
/// Existem muitos tipos de operadores em Java, que são fornecidos abaixo
/// Operador unário,
/// Operador Aritmético,
/// Operador de turno,
/// Operador relacional,
/// Operador bit a bit,
/// Operador Lógico,
/// Operador Ternário e
/// Operador de atribuição.
///
/// | Tipo de Operador | Categoria               | Precedência                        |
/// |------------------|-------------------------|------------------------------------|
/// | Unário           | Pós-fixo                | `expr++` `expr--`                 |
/// |                  | Prefixo                 | `++expr` `--expr` `+expr` `-expr` `~` `!` |
/// | Aritmética       | Multiplicativo          | `*` `/` `%`                       |
/// |                  | Aditivo                 | `+` `-`                           |
/// | Mudança          | Mudança                 | `<<` `>>` `>>>`                   |
/// | Relacional       | Comparação              | `<` `>` `<=` `>=` `instanceof`    |
/// |                  | Igualdade               | `==` `!=`                         |
/// | Bit a bit        | Bit a bit E             | `&`                               |
/// |                  | Bit a bit exclusivo OU  | `^`                               |
/// |                  | Bit a bit inclusivo OU  | `|`                               |
/// | Lógico           | Lógico E                | `&&`                              |
/// |                  | Lógico OU               | `||`                              |
/// | Ternário         | Ternário                | `? :`                             |
/// | Atribuição       | Atribuição              | `=` `+=` `-=` `*=` `/=` `%=` `&=` `^=` `|=` `<<=` `>>=` `>>>=` |
public class Operadores {
    public static void main(String[] args) {
        int x = 10, a = 10, b = 10, c = 10, d = -10;
        boolean e = true, f = false;

        /**
         * Operador unário Java
         * Os operadores unários Java requerem apenas um operando. Os operadores unários são usados ​​para executar várias operações, por exemplo:
         * incrementa/decrementa um a um valor
         * negando uma expressão
         * invertendo o valor de um booleano
         */
        System.out.println(x++); // Incrementa um a variável após ser imprimido no console
        System.out.println(x);   // Verificando se o incremento foi efetuado e deve ser igual a 11

        System.out.println(++x); // Incrementa um a variável antes de ser imprimido no console

        System.out.println(x--); // Decrementa um após sem imprimido no console
        System.out.println(x);   // Verificando se o incremento foi feito e deve ser igual a 11

        System.out.println(--x); // Decrementa um a variável antes de ser imprimido no console

        System.out.println(+x); // Indica que um número é positivo e neste caso retorna o mesmo numero. Redundante se tratando de números
        System.out.println(-x); // Indica que um número é negativp e neste caso retorna o mesmo numero porém negativo.

        System.out.println(~c); // Inverte o número e incrementa um ao número.

        System.out.println(!e); // Inverte um booleano.

        /**
         * Operadores Aritméticos Java
         * Operadores aritméticos Java são usados para executar adição, subtração, multiplicação e divisão.
         * Eles agem como operações matemáticas básicas.
         * */
        a = 10;
        b = 5;

        System.out.println(a + b); // Soma dois numéros ou mais
        System.out.println(a - b); // Subtrai dois numéros ou mais
        System.out.println(a * b); // Multiplica dois numéros ou mais
        System.out.println(a / b); // Divide dois numéros ou mais
        System.out.println(a % b); // Módulo/resto da divisao de numéros ou mais
        System.out.println(a + b / a * b); // Misturando operadores expressão

        /**
         * Operador Java Left Shift
         * O operador de deslocamento para a esquerda << do Java é usado para deslocar todos os bits em um valor para o lado esquerdo de um número especificado de vezes.
         * */

        System.out.println(10 << 2); //10*2^2=10*4=40
        System.out.println(10 << 3); //10*2^3=10*8=80
        System.out.println(20 << 2); //20*2^2=20*4=80
        System.out.println(15 << 4); //15*2^4=15*16=240

        /**
         * Operador Java Right Shift
         * O operador de deslocamento para a direita do Java >> é usado para mover o valor do operando da esquerda para a direita pelo número de bits especificado pelo operando da direita.
         * */
        System.out.println(10 >> 2); //10/2^2=10/4=2
        System.out.println(20 >> 2); //20/2^2=20/4=5
        System.out.println(20 >> 3); //20/2^3=20/8=2

        //Exemplo de operador de deslocamento Java: >> vs >>>
        //Para números positivos, >> e >>> funcionam da mesma forma
        System.out.println(20 >> 2);
        System.out.println(20 >>> 2);
        //Para número negativo, >>> altera o bit de paridade (MSB) para 0
        System.out.println(-20 >> 2);
        System.out.println(-20 >>> 2);

        /**
         * Exemplo de operador AND em Java: && lógico e & bit a bit
         * O operador lógico && não verifica a segunda condição se a primeira condição for falsa.
         * Ele verifica a segunda condição somente se a primeira for verdadeira.
         * O operador bit a bit & sempre verifica ambas as condições, independentemente de a primeira condição ser verdadeira ou falsa.
         **/
        a = 10;
        b = 5;
        c = 20;
        System.out.println(a < b && a < c); //falso && verdadeiro = falso
        System.out.println(a < b & a < c);  //falso e verdadeiro = falso

        a = 10;
        b = 5;
        c = 20;

        System.out.println(a < b && a++ < c); //falso e verdadeiro = falso
        System.out.println(a); //10 porque a segunda condição não foi verificada
        System.out.println(a < b & a++ < c); //falso e verdadeiro = falso
        System.out.println(a); //11 porque a segunda condição é verificada

        /**
         * Exemplo de operador OR em Java: lógico || e bit a bit |
         * Anúncio
         * O operador lógico || não verifica a segunda condição se a primeira condição for verdadeira.
         * Ele verifica a segunda condição somente se a primeira for falsa.
         * */

        a = 10;
        b = 5;
        c = 20;
        System.out.println(a > b || a < c); //verdadeiro || verdadeiro = verdadeiro
        System.out.println(a > b | a < c); //verdadeiro | verdadeiro = verdadeiro
        // || vs |
        System.out.println(a > b || a++ < c); //verdadeiro || verdadeiro = verdadeiro
        System.out.println(a); //10 porque a segunda condição não foi verificada
        System.out.println(a > b | a++ < c); //verdadeiro | verdadeiro = verdadeiro
        System.out.println(a); //11 porque a segunda condição é verificada

        /**
         *Operador Ternário Java
         * Anúncio
         *
         * O operador Java Ternary é usado como uma substituição de linha para a instrução if-then-else e é muito usado na programação Java.
         * É o único operador condicional que aceita três operandos.
         * */

        a = 2;
        b = 5;
        c = (a < b) ? a : b;
        System.out.println(c);

        /**
         * Operador de atribuição Java
         * O operador de atribuição Java é um dos operadores mais comuns.
         * Ele é usado para atribuir o valor à sua direita ao operando à sua esquerda.
         * */

        a = 10;
        b = 20;

        a += 4; //a = a + 4 (a = 10 + 4)
        b -= 4; //b = b - 4 (b = 20 - 4)
        System.out.println(a);
        System.out.println(b);

        a += 3; //10 + 3
        System.out.println(a);
        a -= 4; //13 - 4
        System.out.println(a);
        a *= 2; //9 * 2
        System.out.println(a);
        a /= 2; //18 / 2
        System.out.println(a);

        short a1 = 10;
        short b1 = 10;
        //a1 = a1 + b1; //Compile time error por que ao fazer uma operação com qualquer número menor que o tipo int o resultado é
        // promovido a int, com isso ao tentar reatribuir a uma variavél do tipo short existe a necessidade de convertelo explicitamente
        // novamente ja que o resultado se foi promovido a int
        a1 = (short) (a1 + b1);
        a1 += b1; //a = a + b Porque desta forma não da erro? por baixo dos panos o compilador java faz a conversão
        // implícita desta forma a1 = (short) (a1 + b1)
        System.out.println(a1);

    }
}
