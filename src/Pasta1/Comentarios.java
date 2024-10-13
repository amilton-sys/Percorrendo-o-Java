package Pasta1;

/// Comentários Java
/// Os comentários Java são as instruções em um programa que não são executadas pelo compilador e interpretador.
///
/// Por que usamos comentários em um código?
/// Comentários são usados ​​para tornar o programa mais legível adicionando detalhes do código.
/// Facilita a manutenção do código e a localização de erros com facilidade.
/// Os comentários podem ser usados para fornecer informações ou explicações sobre a variável , método, classe ou qualquer instrução.
/// Ele também pode ser usado para impedir a execução de código de programa durante o teste do código alternativo.
/// Tipos de comentários Java
/// Existem três tipos de comentários em Java.
///
/// Comentário de linha única
/// Comentário de várias linhas
/// Comentário da documentação

public class Comentarios {
    /**
     * 1) Comentário de linha única Java
     * O comentário de linha única é usado para comentar apenas uma linha do código.
     * É a maneira mais fácil e amplamente usada de comentar as declarações.
     * Comentários de linha única começam com duas barras (//) . Qualquer texto antes de // não é executado pelo Java.
     * */

    // Este é um comentário de linha única.

    /**
     * 2) Comentário de várias linhas Java
     * O comentário multi-linha é usado para comentar múltiplas linhas de código. Ele pode ser usado para explicar um trecho de código complexo ou para comentar múltiplas linhas de código de uma vez (pois será difícil usar comentários de linha única ali).
     * Esta explicação é um comentário de multi-linhas.
     * */

    /*
        Este é um comentário de várias linhas
     */

    /**
     *3) Comentário da documentação Java
     * Comentários de documentação são geralmente usados para escrever programas grandes para um projeto ou aplicativo de software,
     * pois ajudam a criar API de documentação. Essas APIs são necessárias para referência, ou seja, quais classes, métodos, argumentos, etc.,
     * são usados no código. Para criar a API de documentação, precisamos usar a ferramenta javadoc .
     * Este explicação é um comentário em estilo javadoc
     * */

    /**
     * Este é um comentário de documentação
     * */

    /// | Marcação    | Sintaxe                             | Descrição                                                                                          |
    /// |-------------|-------------------------------------|----------------------------------------------------------------------------------------------------|
    /// | `{@docRoot}`| `{@docRoot}`                       | Para descrever o caminho relativo para o diretório raiz do documento gerado a partir de qualquer página. |
    /// | `@author`    | `@nome do autor - texto`           | Para adicionar o autor da classe.                                                                   |
    /// | `@code`   | `{@textodocódigo}`               | Para mostrar o texto em fonte de código sem interpretá-lo como marcação HTML ou tag javadoc aninhada. |
    /// | `@version`   | `@versão versão-texto`             | Para especificar o subtítulo "Versão" e o texto da versão quando a opção `-version` for usada.       |
    /// | `@since`    | `@desde o lançamento`              | Para adicionar o título "Desde" com o texto "desde" à documentação gerada.                          |
    /// | `@param`    | `@param nome-do-parâmetro descrição` | Para adicionar um parâmetro com nome e descrição fornecidos à seção 'Parâmetros'.                  |
    /// | `@return` | `@return descrição`                | Obrigatório para cada método que retorna algo (exceto `void`).                                      |


    /**
     * Este é um comentário de documentação
     *
     * @param numero
     * @return int
     * @author amilt
     * @code {
     *      public int numero(int numero) {
     *         return numero;
     *      }
     * }
     * @version 0.1
     * @since 13/10/2024
     */
    public int numero(int numero) {
        return numero;
    }
}
