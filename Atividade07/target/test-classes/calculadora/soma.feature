# language: en
Feature: Soma
  Como um usuario
  eu quero saber a soma de dois numeros
  para evitar erros simples

  Scenario Outline: Adicionar dois numeros
    Given que eu entrei <numero1> na calculadora
    And eu entrei <numero2> na calculadora
    When eu pressionar add
    Then o resultado deve ser <saida>

    Examples: 
      | numero1 | numero2 | saida |
      | 50      | 70      | 120   |
      | -10     | -15     | -25   |
      | 10      | -15     | -5    |