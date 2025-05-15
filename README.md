# Cofrinho (Piggy Bank) - Java Application

## Descrição do Projeto
O Cofrinho é uma aplicação Java que simula um cofrinho virtual onde você pode adicionar, remover e gerenciar diferentes tipos de moedas. A aplicação permite converter todas as moedas para o valor equivalente em Real (BRL) e visualizar o total economizado.

## Funcionalidades
- Adicionar moedas de diferentes tipos (Real, Dólar, Euro, Libra Esterlina, Iene, Peso Argentino, Franco Suíço)
- Remover moedas específicas do cofrinho
- Listar todas as moedas armazenadas no cofrinho
- Calcular o valor total convertido para Real (BRL)

## Estrutura do Projeto
O projeto segue um design orientado a objetos com as seguintes classes principais:

- `Moeda`: Classe abstrata base para todos os tipos de moedas
- `Cofrinho`: Gerencia a coleção de moedas e operações relacionadas
- `Principal`: Contém o menu principal e a interface do usuário
- Classes específicas para cada tipo de moeda (Real, Dolar, Euro, etc.)

## Como Executar
1. Certifique-se de ter o Java JDK instalado em seu sistema
2. Compile os arquivos Java:
   ```
   javac *.java
   ```
3. Execute a aplicação:
   ```
   java Principal
   ```

## Como Usar
Ao iniciar a aplicação, você verá um menu com as seguintes opções:
1. Adicionar moeda
2. Remover moeda
3. Listar moedas
4. Calcular total convertido para Real
5. Sair

Selecione a opção desejada digitando o número correspondente e siga as instruções na tela.

## Taxas de Câmbio
As taxas de câmbio utilizadas neste projeto são valores de exemplo e podem não refletir as taxas reais de mercado. As taxas podem ser atualizadas editando as constantes `TAXA_CAMBIO` nas respectivas classes de moeda.

## Autor
Álvaro Amaral
