package Pasta1;

/**
 * Tipos de Variáveis
 * Existem três tipos de variáveis em Java :
 * variável local
 * variável de instância
 * variável estática
 */
public class TiposDeVariaveis {
    /**
     * 3) Variável estática
     * Uma variável que é declarada como static é chamada de variável estática. Ela não pode ser local.
     * Você pode criar uma única cópia da variável estática e compartilhá-la entre todas as instâncias da classe.
     * A alocação de memória para variáveis estáticas acontece apenas uma vez quando a classe é carregada na memória.
     */
    static int m = 100; // Variável estática
    /**
     * 1) Variável local:
     * Uma variável declarada dentro do corpo do método é chamada de variável local.
     * Você pode usar essa variável somente dentro daquele método e os outros métodos na classe nem sequer sabem que a variável existe.
     * Uma variável local não pode ser definida com a palavra-chave "static".
     */
    void metodo() {
        int n = 90; // Variável local
    }
    /**
     * 2) Variável de instância
     * Uma variável declarada dentro da classe, mas fora do corpo do método, é chamada de variável de instância.
     * Ela não é declarada como static.
     * Ela é chamada de variável de instância porque seu valor é específico da instância e não é compartilhado entre instâncias.
     */
    public static void main(String... args) {
        int dados = 50; // Variável de instância
    }
}