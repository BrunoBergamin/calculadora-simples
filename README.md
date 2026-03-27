# Calculadora Simples em Java

Status: projeto de pratica em Java puro.

Aplicacao basica em Java com interface grafica via `JOptionPane` para realizar quatro operacoes matematicas: soma, subtracao, multiplicacao e divisao.

## Visao geral

Este projeto representa um exercicio introdutorio para praticar logica e estrutura de decisao em Java. O foco aqui e aprender, testar e entender bem o fluxo do programa.

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

- Java puro, sem bibliotecas externas
- uso de `char` para representar a operacao escolhida
- estrutura `switch` para controlar o fluxo
- validacoes antes de executar a conta
- mensagens para feedback imediato ao usuario

## Limitacoes atuais

- o projeto trabalha em um unico arquivo
- nao ha historico de operacoes
- nao ha interface com botoes, apenas caixas de dialogo
- o objetivo principal e pratica de base, nao produto final

## Melhorias futuras

- aceitar simbolos (`+`, `-`, `*`, `/`) alem do menu numerico
- tratar melhor erro de digitacao numerica
- adicionar porcentagem e potencia
- migrar a interface para uma janela com botoes

## Autor

Projeto desenvolvido por Bruno Bergamin como exercicio introdutorio de Java.
