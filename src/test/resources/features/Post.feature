
  #encoding: utf8
Feature: Consulta

  Scenario: Consultar Ovo de Pascoa
    Given que acesso a Wikipedia em Portugues
    When pesquiso por "Ovo de Páscoa"
    Then exibe a expressao "Ovo de Páscoa" no titulo da guia
