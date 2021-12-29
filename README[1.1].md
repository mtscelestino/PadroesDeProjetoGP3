# Padrões De Projeto
Repositório da atividade prática sobre padrões de projeto do Grupo 03 da disciplina de análise e projeto de software 2021.1

### Grupo
João Victor da Silva Prado  
Mateus Souza Celestino  
Henrique Miranda Queiroz  

# Prototype

## O que é?

Basicamente o padrão de projeto prototype utiliza de uma estratégia, a qual consiste na criação de novos objetos a partir de um modelo original (prototype), onde o mesmo seria clonado na criação desse novo objeto. Na prática, esse padrão foi criado com o objetivo de especificar os tipos de objetos a serem criados usando uma instância-protótipo e criar novos objetos pela cópia desse protótipo.

## Quando usar?

É indicado usar o padrão prototype quando um sistema tiver que ser independente de como seus produtos são criados e representados. Quando as instâncias de uma classe puderem ter uma dentre poucas combinações diferentes de estados. Quando as classes a instanciar forem especificadas em tempo de execução, por exemplo, por carga dinâmica.

## Estrutura

![image](https://user-images.githubusercontent.com/54816492/147685427-44b1e5cb-58bb-427d-9be7-b305dce95c31.png)


Exemplo implementado:




# Composite

## O que é?

O Composite é um padrão de projeto que descreve um grupo de objetos que é tratado do mesmo jeito que uma única instância do mesmo tipo de objeto. A intenção do Composite é "compor" objetos em estruturas de árvore que representam hierarquias parte-todo. Ele permite que você tenha uma estrutura de árvore e peça cada nó da árvore pra fazer uma tarefa diferente.

## Quando usar?

