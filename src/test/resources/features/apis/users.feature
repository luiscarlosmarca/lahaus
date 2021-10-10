#autor:luiscarlosmarca

Feature: Regresion del CRUD del Api USERS

@TC001
  Scenario: Crear, listar, actualizar y eliminar un usuario
    Given Consumiendo la api User se crea un usuario nuevo
    When  Lo actualiza
    And   elimina
    Then el usuario creado ya no sera visible

