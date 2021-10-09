#autor:luiscarlosmarca

Feature: Primera busqueda de propiedad de un usuario nuevo

  Background:
    Given Inició la busqueda de su propiedad

  @TC001
  Scenario: Busquedas de propiedadess habilitadas para Colombia
    When el usuario selecciona el Colombia para la Medellin
    And selecciona el tipo de vivienda Casa
    Then el usuario visualizará el módulo de login

