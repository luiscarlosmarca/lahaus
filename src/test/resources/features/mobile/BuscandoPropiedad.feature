#autor:luiscarlosmarca

Feature: Primera busqueda de propiedad de un usuario nuevo

  Background:
    Given Inició la busqueda de su propiedad

  @TC001
  Scenario: Busquedas de casas habilitadas para Colombia
    When el usuario selecciona el Colombia para la ciudad de Medellin
    And selecciona el tipo de vivienda Casa
    Then el usuario visualizará el módulo de login


  @TC002
  Scenario: Busquedas de apartamentos habilitados para Colombia
    When el usuario selecciona el Colombia para la ciudad de Bogota
    And selecciona el tipo de vivienda Apartamento
    Then el usuario visualizará el módulo de login


  @TC003
  Scenario: Busquedas de apartamentos habilitados para Mexico
    When el usuario selecciona el Mexico para la ciudad de Guadalajara
    And selecciona el tipo de vivienda Casa
    Then el usuario visualizará el módulo de login


  @TC004 @test
  Scenario: Ciudades inhabilitados para Mexico
    When el usuario selecciona el Mexico
    Then el usuario visualizará las ciudades inhabilitadas para Mexico


