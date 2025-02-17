### Percorrendo o Java

### Revisar toda a linguagem alimentando o conhecimento sobre a mesma

### O que é Java?

- Java é uma linguagem de programação e uma plataforma criada pela Sun Microsystems em 1995
  James Gosling é considerado pai da linguagem que antes de Java, seu nome era Oak (Carvalho).
  Como Oak já era uma empresa registrada, James Gosling e sua equipe mudaram o nome de Oak para Java.
  O slogan da linguagem java é "Escreva uma vez rode em qualquer lugar".

- Plataforma: Qualquer ambiente de hardware ou software no qual um programa roda,
  é conhecido como plataforma. Como Java tem um ambiente de tempo de execução (JRE) e API, ele é chamado de plataforma.

### Exemplo Java
Vamos dar uma olhada rápida no exemplo de programação Java. Uma descrição detalhada do exemplo Hello Java está
disponível na próxima página.

```java
class Exemplo {
    public static void main() {
        System.out.println("Olá Java");
    }
} 
```

- Aplicativo
  De acordo com a Sun, 3 bilhões de dispositivos rodam Java. 
  Há muitos dispositivos onde Java é usado atualmente. 
  Alguns deles são os seguintes:

1. Aplicativos de desktop, como leitor de acrobat, reprodutor de mídia, antivírus, etc.
2. Aplicações Web como Banco do brasil, Alura, etc.
3. Aplicações empresariais, como aplicativos bancários.
4. Aplicativos móveis
5. Sistemas Embarcados 
6. Cartões Inteligentes
7. Robótica
8. Jogos, etc.

- Tipos de Aplicações Java
  Existem principalmente tipos de aplicativos que podem ser criados usando programação Java.

- Aplicação autônoma
  Aplicativos autônomos também são conhecidos como aplicativos de desktop ou aplicativos
  baseados em janelas. Esses são softwares tradicionais que precisamos instalar em todas
  as máquinas. Exemplos de aplicativos autônomos são Media player, antivírus, etc.
  AWT e Swing são usados em Java para criar aplicativos autônomos.

- Aplicações Web
  Um aplicativo que roda no lado servidor e cria uma página dinâmica chamado de aplicativo
  web. Atualmente, as tecnologias Servlet, JSP, Struts, Spring, Hibernate, JSF, etc.
  São usadas para criar aplicativos web.

- Aplicação empresarial
  Um aplicativo que é distribuido por natureza, como aplicativos bancários, etc.
  É chamado de aplicativo empresarial. Ele tem vantagens como segurança de alto nível,
  balanceamento de carda e clustering. Em java, o EJB é usado para criar aplicativos empresariais.

- Aplicativo móvel
  Um aplicativo criado para dispositivos móveis é chamado de aplicativo móvel. 
  Atualmente Android e Java ME são usados para criar aplicativos móveis.

- Plataformas / Edições Java
  Existem 4 plataformas ou edições do Java:

1) Java SE (Java Standard Edition)
   É uma plataforma de programação Java. Inclui APIs de programação Java como: java.lang, java.io, java.net, java.util,
   java.sql, java.math etc. Inclui tópicos principais como OOPs, String , Regex, Exception, Inner classes,
   Multithreading, I/O Stream, Networking, AWT, Swing, Reflection, Collection, etc.

2) Java EE (Edição Java Enterprise)
   É uma plataforma empresarial usada principalmente para desenvolver aplicativos web e empresariais. 
   É construída sobre a plataforma Java SE. Inclui tópicos como Servlet, JSP, Web Services, EJB, JPA , etc.

3) Java ME (Java Micro Edition)
   É uma micro plataforma dedicada a aplicativos móveis.

4) JavaFX
   É usado para desenvolver aplicativos de internet ricos. Ele usa uma API de interface de usuário leve.

- Pré-requisito
  Para aprender Java, você precisa ter conhecimento em lógica de programação.


- Diferença entre JDK, JRE e JVM
  Precisamos entender as diferenças entre JDK, JRE e JVM antes de prosseguir para Java.

### JVM

- JVM (Java Virtual Machine) é uma máquina abstrata. É chamada de máquina virtual porque não existe fisicamente.
  É uma especificação que fornece um ambiente de tempo de execução no qual o bytecode Java pode ser executado.
  Ela também pode executar aqueles programas que são escritos em outras linguagens e compilados para o bytecode Java.

- JVMs estão disponíveis para muitas plataformas de hardware e software. JVM,
  JRE e JDK são dependentes de plataforma porque a configuração de cada SO é diferente uma da outra. No entanto,
  Java é independente de plataforma. Existem três noções de JVM: especificação , implementação e instância .

- A JVM executa as seguintes tarefas principais:

Carrega código
Verifica o código
Executa código
Fornece ambiente de tempo de execução

- JRE
  JRE é uma sigla para Java Runtime Environment.
  Também é escrito como Java RTE. O Java Runtime Environment é um conjunto de ferramentas de software que são usadas
  para desenvolver aplicativos Java.
  Ele é usado para fornecer o ambiente de tempo de execução. É a implementação da JVM. Ele existe fisicamente.
  Ele contém um conjunto de bibliotecas + outros arquivos que a JVM usa no tempo de execução.

A implementação da JVM também é ativamente lançada por outras empresas além da Sun Micro Systems.

- JDK
  JDK é uma sigla para Java Development Kit. O Java Development Kit (JDK) é um ambiente de desenvolvimento de software
  que é usado para desenvolver aplicativos e applets Java.
  Ele existe fisicamente. Ele contém JRE + ferramentas de desenvolvimento.

O JDK é uma implementação de qualquer uma das plataformas Java abaixo, lançadas pela Oracle Corporation:

Plataforma Java Standard Edition
Plataforma Java Enterprise Edition
Plataforma Java Micro Edition

- O JDK contém uma Máquina Virtual Java (JVM) privada e alguns outros recursos, como um interpretador/carregador (java),
  um compilador (javac), um arquivador (jar), um gerador de documentação (Javadoc), etc.
  para concluir o desenvolvimento de um aplicativo Java.


- Arquitetura JVM (Java Virtual Machine)
  JVM (Java Virtual Machine) é uma máquina abstrata.
  É uma especificação que fornece ambiente de tempo de execução no qual bytecode java pode ser executado.
  As JVMs estão disponíveis para muitas plataformas de hardware e software (ou seja, a JVM depende da plataforma).

O que é JVM
Isso é:
Uma especificação onde o funcionamento da Java Virtual Machine é especificado.
Mas o provedor de implementação é independente para escolher o algoritmo. Sua implementação foi fornecida pela Oracle e
outras empresas.
Uma implementação Sua implementação é conhecida como JRE (Java Runtime Environment).
Instância de tempo de execução Sempre que você escreve o comando java no prompt de comando para executar a classe java,
uma instância da JVM é criada.

O que ele faz
A JVM executa a seguinte operação:

Carrega código
Verifica o código
Executa código
Fornece ambiente de tempo de execução
A JVM fornece definições para:

Área de memória
Formato de arquivo de classe
Conjunto de registros
Pilha de lixo coletado
Relatório de erros fatais etc.

1) Carregador de classe
   Classloader é um subsistema da JVM que é usado para carregar arquivos de classe. Sempre que executamos o programa
   Java, ele é carregado primeiro pelo classloader. Existem três classloaders internos em Java.

Bootstrap ClassLoader : Este é o primeiro classloader que é a superclasse do Extension classloader. Ele carrega o
arquivo rt.jar que contém todos os arquivos de classe do Java Standard Edition,
como classes de pacote java.lang, classes de pacote java.net, classes de pacote java.util, classes de pacote java.io,
classes de pacote java.sql, etc.
Extension ClassLoader : Este é o classloader filho do Bootstrap e classloader pai do classloader System.
Ele carrega os arquivos jar localizados dentro do diretório $JAVA_HOME/jre/lib/ext .
System/Application ClassLoader : Este é o classloader filho do Extension classloader.
Ele carrega os classfiles do classpath. Por padrão, o classpath é definido como o diretório atual. Você pode alterar o
classpath usando o switch "-cp" ou "-classpath". Ele também é conhecido como Application classloader.

```java
//Vamos ver um exemplo para imprimir o nome do classloader  
public class ClassLoaderExample {
    public static void main(String[] args) {
        // Vamos imprimir o nome do carregador de classe da classe atual.   
        //O carregador de classe do aplicativo/sistema carregará esta classe 
        Class<ClassLoaderExample> c = ClassLoaderExample.class;
        System.out.println(c.getClassLoader());
        //Se imprimirmos o nome do carregador de classe String, ele imprimirá nulo porque é um  
        //classe embutida que é encontrada no rt.jar, por isso é carregada pelo carregador de classe Bootstrap
        System.out.println(String.class.getClassLoader());
    }
}     
```

Esses são os classloaders internos fornecidos pelo Java. Se você quiser criar seu próprio classloader,
você precisa estender a classe ClassLoader.

2) Área de Classe(Método)
   A área Class(Method) armazena estruturas por classe, como o pool de constantes de tempo de execução, dados de campo e
   método, e o código para métodos.

3) Heap
   É a área de dados de tempo de execução na qual os objetos são alocados.

4) Pilha
   Java Stack stores frames. It holds local variables and partial results, and plays a part in method invocation and
   return.

Cada thread tem uma pilha JVM privada, criada ao mesmo tempo que o thread.

Um novo frame é criado cada vez que um método é invocado. Um frame é destruído quando sua invocação de método é
concluída.

5) Registro de Contador de Programa
   O registrador PC (contador de programa) contém o endereço da instrução da máquina virtual Java que está sendo
   executada no momento.

6) Pilha de Métodos Nativos
   Ele contém todos os métodos nativos usados no aplicativo.

7) Motor de execução
   Ele contém:
   Anúncio

Um processador virtual
Intérprete: lê o fluxo de bytecode e executa as instruções.
Compilador Just-In-Time (JIT): É usado para melhorar o desempenho. O JIT compila partes do código de bytes que têm
funcionalidade semelhante ao mesmo tempo e,
portanto, reduz a quantidade de tempo necessária para a compilação. Aqui, o termo "compilador" se refere a um tradutor
do conjunto de instruções de uma máquina virtual Java (JVM) para o conjunto de instruções de uma CPU específica.

8) Interface nativa Java
   Java Native Interface (JNI) é uma estrutura que fornece uma interface para comunicação com outro aplicativo escrito
   em outra linguagem,
   como C, C++, Assembly etc. O Java usa a estrutura JNI para enviar saída para o console ou interagir com bibliotecas
   do sistema operacional.



## Agora vamos entrar no estudo teórico/prático
- Siga a sequência de pastas de acordo com a ordem crescente númerica Pasta1, Pasta 2, etc de cima para baixo.