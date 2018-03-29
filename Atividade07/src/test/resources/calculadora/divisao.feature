# language: en
Feature: Divisao
  Como um usuario
  eu quero saber a divisao de dois numeros
  para evitar erros simples

  Scenario: dividir dois numeros inteiros
    Given que eu entrei com 25
    And entrei com 5
    When eu pressionei dividir
    Then o resultado da divisao deve ser 5

  Scenario: dividir um numero por zero
    Given que eu entrei com 25
    And entrei com 0
    When eu pressionei dividir
    Then o resultado da divisao dever ser um numero negativo
    And a mensagem "erro: divisao por zero" deve aparecer