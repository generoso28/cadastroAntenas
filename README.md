# Projeto Cadastro de Antenas

## Descrição

Este projeto em Java gerencia o cadastro de diferentes tipos de antenas (4G e 5G), permitindo a configuração de suas frequências e o armazenamento/leitura dessas informações em um arquivo de texto.

## Funcionalidades

* Criação de objetos para antenas do tipo 4G e 5G.
* Configuração de frequência específica para cada tipo de antena, com validação para faixas permitidas.
* Lançamento de uma exceção customizada (`FrequenciaInvalidaException`) caso a frequência configurada seja inválida para o tipo de antena.
* Persistência dos dados das antenas em um arquivo chamado `antenas.txt`.
* Leitura e exibição dos dados das antenas armazenadas no arquivo `antenas.txt`.

## Estrutura do Projeto

O projeto está organizado nos seguintes pacotes e classes principais:

* **`br.inatel.cdg.antenas`**:
    * `Antena.java`: Classe abstrata base para todas as antenas. Define atributos comuns como ID, localização (coordenadas x, y) e frequência. Implementa a funcionalidade de salvar e ler antenas de um arquivo.
    * `Antena4g.java`: Subclasse de `Antena`, representa uma antena 4G. Implementa a validação de frequência específica para 4G (faixa de 700 a 2600 MHz).
    * `Antena5g.java`: Subclasse de `Antena`, representa uma antena 5G. Implementa a validação de frequência específica para 5G (faixas Sub-6GHz: 3300-4200 MHz ou mmWave: 24250-52600 MHz).
* **`br.inatel.cdg.exceptions`**:
    * `FrequenciaInvalidaException.java`: Exceção customizada lançada quando uma tentativa de configurar uma frequência inválida para um tipo de antena é feita.
* **`br.inatel.cdg.interfaces`**:
    * `Configuravel.java`: Interface que define o contrato para configuração de frequência.
* **`Main.java`**: Classe principal que demonstra o uso das classes de antena, incluindo a criação, configuração de frequência, salvamento em arquivo e leitura do arquivo.
* **`antenas.txt`**: Arquivo de texto utilizado para armazenar os dados das antenas cadastradas. Cada linha representa uma antena com seus atributos separados por vírgula.

## Como Executar

1.  Compile todas as classes Java do projeto.
2.  Execute a classe `Main.java`.
3.  A execução da classe `Main` irá:
    * Criar instâncias de `Antena4g` e `Antena5g`.
    * Configurar suas frequências.
    * Salvar os dados dessas antenas no arquivo `antenas.txt`.
    * Ler e exibir os dados de todas as antenas salvas no arquivo `antenas.txt` no console.

    O arquivo `antenas.txt` será criado no diretório raiz do projeto (ou atualizado caso já exista) com as informações das antenas.

## Detalhes Técnicos

* Linguagem: Java
* Versão do JDK: 23 (conforme configurado no `misc.xml`)
