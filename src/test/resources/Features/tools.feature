  Feature:Pruebas ShoposSolution

    @Scenario
    Scenario Outline: Agregar registro y eliminar cualquier registro
    Given ingresar la a pagina toolQA
    When Seleccionar element y despues Web Tables, Add
    Then realizar registros <firtname> <lastname> <email> <age> <salary> <departament>
      Examples:
      | firtname| lastname   | email               | age   | salary | departament|
      ##@externaldata@./src/test/resources/TestData/Datos.xlsx@Hoja1
   |Azziz   |Yunez   |Vazziz@hotmail.com   |28   |1800000   |ant|
   |Jose   |verga   |a@hotmail.com   |29   |150   |med|
   |Juan   |Youssef   |q@hotmail.com   |21   |150000   |bolivar|




    @Scenario1
    Scenario: Agregar fechas y hora
      Given ingresar la a pagina inicio
      When Seleccionar widgets y opcion date picker
      Then realizar asignacion de fechas

    @Scenario2
    Scenario: Interactuar con ventanas emergentes
      Given Ingresamos a la pagina de inicio
      When Seleccionar Alerts,Frame & Windows->Alerts
      Then Realizar cuatro tipos de ventana emergente



