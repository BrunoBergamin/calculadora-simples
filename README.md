# Calculadora Simples em Java

Aplicacao basica em Java com interface grafica via `JOptionPane` para realizar quatro operacoes matematicas: soma, subtracao, multiplicacao e divisao.

## Visao geral

Este projeto foi criado para treinar conceitos fundamentais da linguagem Java de forma pratica:

- entrada de dados
- estrutura condicional
- `switch`
- tratamento de casos invalidos
- organizacao de fluxo simples de execucao

## Funcionalidades

- escolha da operacao por menu numerico
- leitura de dois numeros pelo usuario
- suporte a:
  - soma
  - subtracao
  - multiplicacao
  - divisao
- validacao de operacao invalida
- bloqueio de divisao por zero

## Tecnologias

- Java
- Swing (`JOptionPane`)

## Estrutura

```text
calculadora-simples/
|-- src/
|   `-- program/
|       `-- Main.java
`-- README.md
```

## Como executar

### Opcao 1: IDE

Abra o projeto no IntelliJ IDEA ou em outra IDE Java e execute:

```text
src/program/Main.java
```

### Opcao 2: terminal

```bash
javac -d out src/program/Main.java
java -cp out program.Main
```

## O que foi praticado

- uso de `char` para representar a operacao escolhida
- estrutura `switch` para controlar o fluxo
- validacoes antes de executar a conta
- mensagens para feedback imediato ao usuario

## Melhorias futuras

- aceitar simbolos (`+`, `-`, `*`, `/`) alem do menu numerico
- tratar melhor erro de digitacao numerica
- adicionar porcentagem e potencia
- migrar a interface para uma janela com botoes

## Autor

Projeto desenvolvido por Bruno Bergamin como exercicio introdutorio de Java.
