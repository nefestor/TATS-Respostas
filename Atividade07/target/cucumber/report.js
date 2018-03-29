$(document).ready(function() {var formatter = new CucumberHTML.DOMFormatter($('.cucumber-report'));formatter.uri("calculadora/divisao.feature");
formatter.feature({
  "name": "Divisao",
  "description": "  Como um usuario\n  eu quero saber a divisao de dois numeros\n  para evitar erros simples",
  "keyword": "Feature"
});
formatter.scenario({
  "name": "dividir dois numeros inteiros",
  "description": "",
  "keyword": "Scenario"
});
formatter.step({
  "name": "que eu entrei com 25",
  "keyword": "Given "
});
formatter.match({
  "location": "DivisaoSteps.que_eu_entrei_com(int)"
});
formatter.result({
  "status": "passed"
});
formatter.step({
  "name": "entrei com 5",
  "keyword": "And "
});
formatter.match({
  "location": "DivisaoSteps.entrei_com(int)"
});
formatter.result({
  "status": "passed"
});
formatter.step({
  "name": "eu pressionei dividir",
  "keyword": "When "
});
formatter.match({
  "location": "DivisaoSteps.eu_pressionei_dividir()"
});
formatter.result({
  "status": "passed"
});
formatter.step({
  "name": "o resultado da divisao deve ser 5",
  "keyword": "Then "
});
formatter.match({
  "location": "DivisaoSteps.o_resultado_da_divisao_deve_ser(int)"
});
formatter.result({
  "status": "passed"
});
formatter.scenario({
  "name": "dividir um numero por zero",
  "description": "",
  "keyword": "Scenario"
});
formatter.step({
  "name": "que eu entrei com 25",
  "keyword": "Given "
});
formatter.match({
  "location": "DivisaoSteps.que_eu_entrei_com(int)"
});
formatter.result({
  "status": "passed"
});
formatter.step({
  "name": "entrei com 0",
  "keyword": "And "
});
formatter.match({
  "location": "DivisaoSteps.entrei_com(int)"
});
formatter.result({
  "status": "passed"
});
formatter.step({
  "name": "eu pressionei dividir",
  "keyword": "When "
});
formatter.match({
  "location": "DivisaoSteps.eu_pressionei_dividir()"
});
formatter.result({
  "status": "passed"
});
formatter.step({
  "name": "o resultado da divisao dever ser um numero negativo",
  "keyword": "Then "
});
formatter.match({
  "location": "DivisaoSteps.o_resultado_da_divisao_dever_ser_um_numero_negativo()"
});
formatter.result({
  "status": "passed"
});
formatter.step({
  "name": "a mensagem \"erro: divisao por zero\" deve aparecer",
  "keyword": "And "
});
formatter.match({
  "location": "DivisaoSteps.a_mensagem_deve_aparecer(String)"
});
formatter.result({
  "status": "passed"
});
formatter.uri("calculadora/soma.feature");
formatter.feature({
  "name": "Soma",
  "description": "  Como um usuario\n  eu quero saber a soma de dois numeros\n  para evitar erros simples",
  "keyword": "Feature"
});
formatter.scenarioOutline({
  "name": "Adicionar dois numeros",
  "description": "",
  "keyword": "Scenario Outline"
});
formatter.step({
  "name": "que eu entrei \u003cnumero1\u003e na calculadora",
  "keyword": "Given "
});
formatter.step({
  "name": "eu entrei \u003cnumero2\u003e na calculadora",
  "keyword": "And "
});
formatter.step({
  "name": "eu pressionar add",
  "keyword": "When "
});
formatter.step({
  "name": "o resultado deve ser \u003csaida\u003e",
  "keyword": "Then "
});
formatter.examples({
  "name": "",
  "description": "",
  "keyword": "Examples",
  "rows": [
    {
      "cells": [
        "numero1",
        "numero2",
        "saida"
      ]
    },
    {
      "cells": [
        "50",
        "70",
        "120"
      ]
    },
    {
      "cells": [
        "-10",
        "-15",
        "-25"
      ]
    },
    {
      "cells": [
        "10",
        "-15",
        "-5"
      ]
    }
  ]
});
formatter.scenario({
  "name": "Adicionar dois numeros",
  "description": "",
  "keyword": "Scenario Outline"
});
formatter.step({
  "name": "que eu entrei 50 na calculadora",
  "keyword": "Given "
});
formatter.match({
  "location": "SomaSteps.que_eu_entrei_na_calculadora(int)"
});
formatter.result({
  "status": "passed"
});
formatter.step({
  "name": "eu entrei 70 na calculadora",
  "keyword": "And "
});
formatter.match({
  "location": "SomaSteps.eu_entrei_na_calculadora(int)"
});
formatter.result({
  "status": "passed"
});
formatter.step({
  "name": "eu pressionar add",
  "keyword": "When "
});
formatter.match({
  "location": "SomaSteps.eu_pressionar_add()"
});
formatter.result({
  "status": "passed"
});
formatter.step({
  "name": "o resultado deve ser 120",
  "keyword": "Then "
});
formatter.match({
  "location": "SomaSteps.o_resultado_deve_ser(int)"
});
formatter.result({
  "status": "passed"
});
formatter.scenario({
  "name": "Adicionar dois numeros",
  "description": "",
  "keyword": "Scenario Outline"
});
formatter.step({
  "name": "que eu entrei -10 na calculadora",
  "keyword": "Given "
});
formatter.match({
  "location": "SomaSteps.que_eu_entrei_na_calculadora(int)"
});
formatter.result({
  "status": "passed"
});
formatter.step({
  "name": "eu entrei -15 na calculadora",
  "keyword": "And "
});
formatter.match({
  "location": "SomaSteps.eu_entrei_na_calculadora(int)"
});
formatter.result({
  "status": "passed"
});
formatter.step({
  "name": "eu pressionar add",
  "keyword": "When "
});
formatter.match({
  "location": "SomaSteps.eu_pressionar_add()"
});
formatter.result({
  "status": "passed"
});
formatter.step({
  "name": "o resultado deve ser -25",
  "keyword": "Then "
});
formatter.match({
  "location": "SomaSteps.o_resultado_deve_ser(int)"
});
formatter.result({
  "status": "passed"
});
formatter.scenario({
  "name": "Adicionar dois numeros",
  "description": "",
  "keyword": "Scenario Outline"
});
formatter.step({
  "name": "que eu entrei 10 na calculadora",
  "keyword": "Given "
});
formatter.match({
  "location": "SomaSteps.que_eu_entrei_na_calculadora(int)"
});
formatter.result({
  "status": "passed"
});
formatter.step({
  "name": "eu entrei -15 na calculadora",
  "keyword": "And "
});
formatter.match({
  "location": "SomaSteps.eu_entrei_na_calculadora(int)"
});
formatter.result({
  "status": "passed"
});
formatter.step({
  "name": "eu pressionar add",
  "keyword": "When "
});
formatter.match({
  "location": "SomaSteps.eu_pressionar_add()"
});
formatter.result({
  "status": "passed"
});
formatter.step({
  "name": "o resultado deve ser -5",
  "keyword": "Then "
});
formatter.match({
  "location": "SomaSteps.o_resultado_deve_ser(int)"
});
formatter.result({
  "status": "passed"
});
});