package Pasta1;

/**
 * Tipos de dados em Java <br>
 * Os tipos de dados especificam os diferentes tamanhos e valores que podem ser armazenados na variável. Existem dois tipos de dados em Java:
 * Tipos de dados primitivos: Os tipos de dados primitivos incluem boolean, char, byte, short, int, long, float e double.
 * Tipos de dados não primitivos: Os tipos de dados não primitivos incluem Classes , Interfaces e Arrays .
 * Tipos de dados primitivos Java
 * Na linguagem Java, tipos de dados primitivos são os blocos de construção da manipulação de dados.
 * Esses são os tipos de dados mais básicos disponíveis na linguagem Java .
 * Java é uma linguagem de programação estaticamente tipada. Isso significa que todas as variáveis devem ser declaradas antes de seu uso.
 * É por isso que precisamos declarar o tipo e o nome da variável.
 * Existem 8 tipos de dados primitivos:
 * tipo de dado boolean
 * tipo de dados byte
 * tipo de dados char
 * tipo de dados short
 * tipo de dado int
 * tipo de dados long
 * tipo de dados float
 * tipo de dado double
 */
public class TiposDeDados {
    /// | Tipo de Dados | Valor Padrão | Tamanho Padrão |
    /// |---------------|--------------|----------------|
    /// | boolean       | `false`      | 1 bit          |
    /// | char          | `'\u0000'`   | 2 bytes        |
    /// | byte          | `0`          | 1 byte         |
    /// | short         | `0`          | 2 bytes        |
    /// | int           | `0`          | 4 bytes        |
    /// | long          | `0L`         | 8 bytes        |
    /// | float         | `0.0f`       | 4 bytes        |
    /// | double        | `0.0d`       | 8 bytes        |
    ///
    /// Tipo de dados booleanos
    /// O tipo de dado Boolean é usado para armazenar apenas dois valores possíveis: true e false.
    /// Esse tipo de dado é usado para flags simples que rastreiam condições true/false.
    /// O tipo de dado booleano especifica um bit de informação, mas seu "tamanho" não pode ser definido com precisão.
    boolean a = false;
    /// Tipo de dados byte
    /// O tipo de dado byte é um exemplo de tipo de dado primitivo. É um inteiro de complemento de dois com sinal de 8 bits.
    /// Seu intervalo de valores fica entre -128 e 127 (inclusive). Seu valor mínimo é -128 e o valor máximo é 127.Seu valor padrão é 0.
    /// O tipo de dado byte é usado para economizar memória em grandes arrays onde a economia de memória é mais necessária.
    /// Ele economiza espaço porque um byte é 4 vezes menor que um inteiro. Ele também pode ser usado no lugar do tipo de dado "int".
    byte b = 127, c = -128;
    /**
     * Tipo de dados short
     * O tipo de dado short é um inteiro de complemento de dois com sinal de 16 bits.
     * Seu intervalo de valores fica entre -32.768 a 32.767 (inclusive). Seu valor mínimo é -32.768 e o valor máximo é 32.767. Seu valor padrão é 0.
     * O tipo de dado short também pode ser usado para economizar memória, assim como o tipo de dado byte.
     * Um tipo de dado short é 2 vezes menor que um inteiro.
     */
    short d = 32767, e = -32768;
    /**
     * Tipo de dados Int
     * O tipo de dado int é um inteiro de complemento de dois com sinal de 32 bits. Seu intervalo de valores fica entre - 2.147.483.648 (-2^31) a 2.147.483.647 (2^31 -1) (inclusive).
     * Seu valor mínimo é - 2.147.483.648 e o valor máximo é 2.147.483.647. Seu valor padrão é 0.
     * O tipo de dados int é geralmente usado como um tipo de dados padrão para valores integrais, a menos que não haja problemas de memória.
     **/
    int f = 1000000, g = -2000000;
    /**
     * Tipo de dados longo
     * O tipo de dado long é um inteiro de complemento de dois de 64 bits. Seu intervalo de valores fica entre -9.223.372.036.854.775.808(-2^63) a 9.223.372.036.854.775.807(2^63 -1)(inclusive). Seu valor mínimo é - 9.223.372.036.854.775.808 e o valor máximo é 9.223.372.036.854.775.807. Seu valor padrão é 0.
     * O tipo de dado long é usado quando você precisa de um intervalo de valores maior do que aqueles fornecidos por int.
     **/
    long h = 10000000000L, i = -200000000L; // o L no final é obrigatório
    /**
     * Tipo de dados flutuante
     * O tipo de dado float é um ponto flutuante IEEE 754 de precisão simples de 32 bits. Seu intervalo de valores é ilimitado.
     * É recomendado usar um float (em vez de double) se você precisar economizar memória em grandes matrizes de números de ponto flutuante.
     * O tipo de dado float nunca deve ser usado para valores precisos, como moeda. Seu valor padrão é 0,0F.
     */
    float j = 234.5F; // o f ou F no final é obrigatório
    /**
     * Tipo de dados duplo
     * O tipo de dado double é um ponto flutuante IEEE 754 de 64 bits de precisão dupla. Seu intervalo de valores é ilimitado.
     * O tipo de dado double é geralmente usado para valores decimais, assim como float.
     * O tipo de dado double também nunca deve ser usado para valores precisos, como moeda. Seu valor padrão é 0,0d.
     */
    double l = 12.3D; // o d ou D no final é opcional
    /**
     * Tipo de dados Char
     * O tipo de dado char é um único caractere Unicode de 16 bits. Seu intervalo de valores fica entre "\u0000" (ou 0) a "\uffff" (ou 65.535 inclusive).
     * O tipo de dado char é usado para armazenar caracteres.
     * Por que char usa 2 bytes em Java e o que é \u0000 ?
     * É porque o Java usa o sistema Unicode, não o sistema de código ASCII. O \u0000 é o menor intervalo do sistema Unicode.
     * Para obter uma explicação detalhada sobre o Unicode.
     * Sistema Unicode
     * Unicode é uma codificação de caracteres padrão internacional universal capaz de representar a maioria dos idiomas escritos do mundo.
     * Por que o Java usa o sistema Unicode?
     * Antes do Unicode, havia muitos padrões de linguagem:
     * ASCII (Código Padrão Americano para Intercâmbio de Informações) para os Estados Unidos.
     * ISO 8859-1 para idiomas da Europa Ocidental.
     * KOI-8 para russo.
     * GB18030 e BIG-5 para chinês, e assim por diante.
     * Problema
     * Isso causou dois problemas:
     * Um valor de código específico corresponde a diferentes letras nos vários padrões de linguagem.
     * As codificações para idiomas com grandes conjuntos de caracteres têm comprimento variável. Alguns caracteres comuns são codificados como bytes únicos, outros requerem dois ou mais bytes.
     * Solução
     * Para resolver esses problemas, um novo padrão de linguagem foi desenvolvido, o Sistema Unicode.
     * Em Unicode, um caractere contém 2 bytes, então Java também usa 2 bytes para caracteres.
     * menor valor: \u0000
     * maior valor: \uFFFF
     * */
    char letraA = 'A'; // É obrigatório que o dado esteja entre aspas '' simples
}
