package Pasta1;

/// Instruções de controle Java | Fluxo de controle em Java
/// O compilador Java executa o código de cima para baixo. As instruções no código são executadas de acordo com a ordem em que aparecem.
/// No entanto, Java fornece instruções que podem ser usadas para controlar o fluxo do código Java. Essas instruções são chamadas de instruções de fluxo de controle.
/// É um dos recursos fundamentais do Java, que fornece um fluxo suave do programa.
///
/// Java fornece três tipos de instruções de fluxo de controle.
///
/// Declarações de tomada de decisão
/// declarações if
/// declaração switch
/// Instruções de loop
/// do while loop
/// while loop
/// for loop
/// for-each loop
/// Declarações de salto
/// declaração break
/// declaração continue
///
/// Declarações de tomada de decisão:
/// Como o nome sugere, as declarações de tomada de decisão decidem qual declaração executar e quando.
/// As declarações de tomada de decisão avaliam a expressão booleana e controlam o fluxo do programa dependendo do resultado da condição fornecida.
/// Existem dois tipos de declarações de tomada de decisão em Java, ou seja, declaração If e declaração switch.
public class FluxoDeControle {
    /// Declarações de tomada de decisão:
    /// Como o nome sugere, as declarações de tomada de decisão decidem qual declaração executar e quando.
    /// As declarações de tomada de decisão avaliam a expressão booleana e controlam o fluxo do programa dependendo do resultado da condição fornecida.
    /// Existem dois tipos de declarações de tomada de decisão em Java, ou seja, declaração If e declaração switch.
    public static void main(String[] args) {
        /**
         * 1) Declaração If:
         * Em Java, a declaração "if" é usada para avaliar uma condição. O controle do programa é desviado dependendo da condição específica.
         * A condição da declaração If fornece um valor booleano, true ou false. Em Java, há quatro tipos de declarações if fornecidas abaixo.
         * Simple if statement
         * if-else statement
         * escada if-else-if
         * Instrução if aninhada
         * Vamos entender as instruções if uma por uma.
         * if(condição){
         *     declaração 1; // executa qaundo a condição é verdadeira
         * }
         * */
        int x = 10;
        int y = 12;
        if (x + y > 20) {
            System.out.println("X + Y é maior que 20");
        }
        /**
         * 2) declaração if-else
         * A declaração if-else é uma extensão da declaração if, que usa outro bloco de código, ou seja, bloco else.
         * O bloco else é executado se a condição do bloco if for avaliada como falsa.
         * if(condição){
         *     declaração 1; //executa quando a condição é verdadeira
         * }else {
         *  declaração 2; //executa quando a condição é falsa
         * }
         * */
        if (x + y > 20) {
            System.out.println("x + y é menor que 10");
        } else {
            System.out.println("x + y é maior que 20");
        }
        /**
         * 3) escada if-else-if:
         * A declaração if-else-if contém a declaração if seguida por várias declarações else-if.
         * Em outras palavras, podemos dizer que é a cadeia de declarações if-else que cria uma árvore de decisão onde o programa pode entrar no bloco de código onde a condição é verdadeira.
         * Também podemos definir uma declaração else no final da cadeia.
         * if (condição){
         *    declaração 1; //executa quando a condição 1 é verdadeira
         * }else if {
         *    declaração 2; //executa quando a condição 2 é verdadeira
         * } else {
         *    declaração 2; //executa quando todas as condições são falsas
         * }
         * */
        String cidade = "Abreu e Lima";
        if (cidade == "Paulista") {
            System.out.println("A cidade é Paulista");
        } else if (cidade == "Recife") {
            System.out.println("A cidade é Recife");
        } else {
            System.out.println("A cidade é Abreu e Lima");
        }
        /**
         * Instrução if aninhada
         * Em instruções if aninhadas,
         * a instrução if pode conter uma instrução if ou if-else dentro de outra instrução if ou else-if.
         *  if (condição 1){
         *       descraração 1; //executa quando a condição 1 é verdadeira
         *      if (condição 2){
         *          descraração 2; //executa quando a condição 2 é verdadeira
         *      } else{
         *          descraração 2; //executa quando a condição 2 é falsa
         *      }
         * }
         */
        String address = "Olinda,Itamaracá";
        if (address.endsWith("Itamaracá")) {
            if (address.contains("Ilha do sono")) {
                System.out.println("Sua cidade é Ilha do sono");
            } else if (address.contains("Tabajara")) {
                System.out.println("Sua cidade é Tabajara");
            } else {
                System.out.println((address.split(",")[0]));
            }
        } else {
            System.out.println("Você não mora em Itamaracá");
        }
        /**
         * Declaração Switch:
         * Em Java, instruções Switch são semelhantes a instruções if-else-if.
         * A instrução switch contém vários blocos de código chamados cases e um único case é executado com base na variável que está sendo trocada.
         * A instrução switch é mais fácil de usar em vez de instruções if-else-if. Ela também melhora a legibilidade do programa.
         * Pontos a serem observados sobre a instrução switch:
         * As variáveis de caso podem ser int, short, byte, char ou enumeração.
         * O tipo string também é suportado desde a versão 7 do Java
         * Os casos não podem ser duplicados
         * A declaração padrão é executada quando qualquer um dos casos não corresponde ao valor da expressão. É opcional.
         * A instrução Break encerra o bloco switch quando a condição é satisfeita.
         * É opcional, se não for usada, o próximo caso é executado.
         * Ao usar instruções switch, devemos notar que a expressão case será do mesmo tipo que a variável. No entanto,
         * também será um valor constante.
         * switch (expressao){
         *     case valor1:
         *      declaracao1;
         *      break;
         *     case valorN:
         *      declaracaoN;
         *      break;
         *     default:
         *      default declaracao;
         * }
         * */
        int num = 2;
        switch (num) {
            case 0:
                System.out.println("O número é 0");
                break;
            case 1:
                System.out.println("O número é 1");
                break;
            default:
                System.out.println(num);
        }
        /**
         * Ao usar instruções switch, devemos notar que a expressão case será do mesmo tipo que a variável.
         * No entanto, também será um valor constante.
         * O switch permite que apenas variáveis do tipo int, string e Enum sejam usadas.
         * */

        /**
         * Instruções de Loop
         * Na programação, às vezes precisamos executar o bloco de código repetidamente enquanto alguma condição é avaliada como verdadeira.
         * No entanto, instruções de loop são usadas para executar o conjunto de instruções em uma ordem repetida.
         * A execução do conjunto de instruções depende de uma condição específica.
         * Em Java, temos três tipos de loops que executam de forma similar. No entanto, há diferenças em sua sintaxe e tempo de verificação de condição.
         * para laço
         * enquanto laço
         * laço do-while
         * for(inicialização;condição;incremento/decremento){
         *     // bloco de instruções
         * }
         * */
        int soma = 0;
        for (int j = 1; j <= 10; j++) {
            soma = soma + j;
        }
        System.out.println("A soma dos 10 primeiros números é " + soma);
        /**
         * Laço Java for-each
         * Java fornece um loop for aprimorado para percorrer as estruturas de dados como array ou collection. No loop for-each,
         * não precisamos atualizar a variável do loop.
         * A sintaxe para usar o loop for-each em Java é fornecida abaixo.
         * for(tipo_de_dados var: nome_da_matriz/nome_da_coleção){
         *     // declaração
         * }
         * */
        String[] nomes = {"Java", "C", "C++", "Python", "JavaScript"};
        for (String nome : nomes) {
            System.out.println(nome);
        }
        /**
         * Java enquanto loop
         * O loop while também é usado para iterar sobre o número de instruções várias vezes.
         * No entanto, se não soubermos o número de iterações com antecedência, é recomendado usar um loop while. Ao contrário do loop for,
         * a inicialização e o incremento/decremento não ocorrem dentro da instrução do loop no loop while.
         * Também é conhecido como loop controlado por entrada, já que a condição é verificada no início do loop.
         * Se a condição for verdadeira, o corpo do loop será executado; caso contrário, as instruções após o loop serão executadas.
         * while(condição){
         *     // instruções de loop
         * }
         * */
        int i = 0;
        System.out.println("Imprimindo a lista dos primeiros 10 números pares \n");
        while (i <= 10) {
            System.out.println(i);
            i = i + 2;
        }
        /**
         * Laço do-while Java
         * O loop do-while verifica a condição no final do loop após executar as instruções do loop.
         * Quando o número de iterações não é conhecido e temos que executar o loop pelo menos uma vez, podemos usar o loop do-while.
         * Também é conhecido como loop controlado por saída, já que a condição não é verificada antecipadamente.
         * A sintaxe do loop do-while é dada abaixo.
         * do{
         *     //declarações
         * }while(condição);
         * */
        i = 0;
        System.out.println("Imprimindo a lista dos primeiros 10 números pares \n");
        do {
            System.out.println(i);
            i = i + 2;
        } while (i <= 10);
        /**
         * Declarações de salto
         * As instruções de salto são usadas para transferir o controle do programa para as instruções específicas.
         * Em outras palavras, as instruções de salto transferem o controle de execução para a outra parte do programa.
         * Existem dois tipos de instruções de salto em Java, ou seja, break e continue.
         * Declaração de interrupção Java
         * Como o nome sugere, a instrução break é usada para quebrar o fluxo atual do programa e transferir o controle para a próxima instrução fora de um loop ou instrução switch.
         * No entanto, ela quebra apenas o loop interno no caso do loop aninhado.
         * A instrução break não pode ser usada independentemente no programa Java, ou seja, ela só pode ser escrita dentro da instrução loop ou switch.
         * Exemplo de instrução break com loop for
         * Considere o exemplo a seguir em que usamos a instrução break com o loop for.
         * */
        //Exemplo de instrução break
        for (i = 0; i <= 10; i++) {
            System.out.println(i);
            if (i == 6) {
                break;
            }
        }
        //Exemplo de instrução break com loop for rotulado
        rotuloA:
        for (i = 0; i <= 10; i++) {
            rotuloB:
            for (int j = 0; j <= 15; j++) {
                rotuloC:
                for (int k = 0; k <= 20; k++) {
                    System.out.println(k);
                    if (k == 5) {
                        break rotuloA;
                    }
                }
            }
        }
        /**
         * Declaração Java continue
         * Diferentemente da instrução break, a instrução continue não interrompe o loop,
         * mas pula a parte específica do loop e vai para a próxima iteração do loop imediatamente.
         * Considere o exemplo a seguir para entender o funcionamento da instrução continue em Java.
         * */
        for (i = 0; i <= 2; i++) {
            for (int j = i; j <= 5; j++) {
                if (j == 4) {
                    continue;
                }
                System.out.println(j);
            }
        }
    }
}
