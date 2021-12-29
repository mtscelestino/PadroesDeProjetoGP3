# Padrões De Projeto
Repositório da atividade prática sobre padrões de projeto do Grupo 03 da disciplina de análise e projeto de software 2021.1. Nosso grupo ficou responsável pelos padrões: Prototype e Composite.

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


## Exemplo implementado:

- O primeiro passo foi criar as estruturas nas quais se baseam esse tipo de padrão de projeto, como a classe abstrata do prototype:

![image](https://user-images.githubusercontent.com/54816492/147710264-bf40861b-02df-4b37-9cb2-674b532b1eff.png)

- Em seguida, definido um exemplo prático, criou-se os objetos que seriam gerados como clones do prototype, nesse caso os escolhidos foram telefones celulares da marca Xiaomi:

![image](https://user-images.githubusercontent.com/54816492/147710401-a01b9416-0823-4629-923f-e3ad0a36a18e.png)

- Por fim temos a função main, na qual iremos por em prática o exemplo escolhido:

![image](https://user-images.githubusercontent.com/54816492/147710465-0edb81fc-6717-45c8-a181-c35a018eb9f5.png)

- Executando o código da nossa função main, temos as saídas esperadas:

![WhatsApp Image 2021-12-29 at 19 58 38](https://user-images.githubusercontent.com/54816492/147710500-bf9fa5f5-0a4e-43c1-a158-e19b7269e8d1.jpeg)

- Aqui vale notar que o objeto criado no início, do protótipo, é um objeto vazio, utilizado apenas para ser replicado em objetos "reais" portanto os valores dos atributos do prototipo constam como "null"

![WhatsApp Image 2021-12-29 at 19 59 31](https://user-images.githubusercontent.com/54816492/147710515-2662d495-7cd9-4637-9ccf-0fe80d64d38d.jpeg)

- Ao analisarmos na prática a aplicação desse padrão de projeto do Protoype, podemos perceber que o mesmo de fato agiliza a criação de objetos com o mesmo formato, a partir do seu respectivo protótipo, proporcionando uma agilidade na implementação dos mesmos, sem a necessidade de uma nova classe, além de reduzir os custos de memória e processamento ao evitar a criação excessiva de classes "caras" para a máquina, no que diz respeito a memória e processamento, como já foi ressaltado.

# Composite

## O que é?

O Composite é um padrão de projeto que descreve um grupo de objetos que é tratado do mesmo jeito que uma única instância do mesmo tipo de objeto. A intenção do Composite é "compor" objetos em estruturas de árvore que representam hierarquias parte-todo. Ele permite que você tenha uma estrutura de árvore e peça cada nó da árvore pra fazer uma tarefa diferente.

## Quando usar?

