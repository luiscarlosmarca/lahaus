#autor:lmarin

Feature: Api USERS of microservice KING'S LANDING

@TC001
  Scenario: Create an alone user successfully
    Given created a alone user
    When  consuming an API Users
    And   active the account new
    Then  the user can do login

@TC002

  Scenario: Create an alone user unsuccessfully
    Given created a alone user
    When  consuming an API Users
    Then  the user cannot do login

@TC003

  Scenario: Create an enterprise user successfully
    Given created a enterprise user
    When  consuming an API Users
    And   active the account new
    Then  the user can do login

@TC004
  Scenario: Create an enterprise user unsuccessfully
    Given created a enterprise user
    When  consuming an API Users
    Then  the user cannot do login

@TC005

  Scenario: Create a member user successfully
    Given authenticacion with a user Enterprise
    Given created a member of enterprise user
    When  using the key of a user enterprise an API users
    And   active the account new
    Then  the user can do login

@TC006
  Scenario: Create a member user unsuccessfully
    Given authenticacion with a user Enterprise
    Given created a member of enterprise user
    When  using the key of a user enterprise an API users
    Then  the user cannot do login

