Recursividade em Java – Contagem de Ocorrências de um Dígito em um Número Inteiro

Enunciado

Criar uma aplicação em Java com uma função recursiva que receba dois números inteiros como parâmetros:
* Um número inteiro entre **10 e 999999**
* Um segundo número inteiro entre **0 e 9** (um dígito)

A função deve retornar quantas vezes o segundo número aparece dentro do primeiro.


Exemplos:

* 1º Número = 523578
  2º Número = 5
  
  Retorno esperado: aparece 2 vezes

* 1º Número = 836363
  2º Número = 3
  
  Retorno esperado: aparece 3 vezes

A validação dos valores de entrada deve ser realizada fora da função recursiva.


Objetivo

O objetivo deste exercício é praticar:
* Recursividade em Java
* Identificação e implementação da condição de parada
* Redução do problema em termos do caso anterior
* Manipulação matemática de números inteiros utilizando divisão e resto
* Raciocínio lógico aplicado à decomposição de números


Funcionamento Lógico da Recursão

A estratégia consiste em separar o último dígito do número utilizando:
* Divisão inteira por 10 → reduz o número
* Operador módulo (%) → obtém o último dígito

Exemplo:

Número 1234
1234 / 10 = 123 (resto 4)
123 / 10 = 12 (resto 3)
12 / 10 = 1 (resto 2)
1 / 10 = 0 (resto 1)

A cada chamada recursiva:

* Verifica-se se o último dígito é igual ao dígito procurado
* Soma-se 1 se for igual
* Continua a chamada com o número dividido por 10


Tecnologias
* Oracle Java
* Recursividade
* Manipulação de números inteiros


Observações

Este exercício faz parte dos estudos de Introdução às Estruturas de Dados, com foco no desenvolvimento do raciocínio lógico, na compreensão de técnicas recursivas e na decomposição progressiva de um problema em partes menores até atingir a condição de parada.
