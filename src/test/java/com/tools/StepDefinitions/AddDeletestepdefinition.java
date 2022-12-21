package com.tools.StepDefinitions;

import com.tools.Taks.AddDelete.BottonElement;
import com.tools.Taks.AddDelete.LlenarFormulario;
import com.tools.Ui.PaginaInicio.PaginainicioElement;
import cucumber.api.java.Before;
import cucumber.api.java.en.*;
import net.serenitybdd.screenplay.actions.Open;
import net.serenitybdd.screenplay.actors.OnlineCast;

import static com.tools.Ui.AddDelete.PaginaResultadoElement.*;
import static net.serenitybdd.screenplay.actors.OnStage.*;


public class AddDeletestepdefinition {
    @Before
    public void setUp(){
        setTheStage(new OnlineCast());
    }

    @Given("^ingresar la a pagina toolQA$")
    public void ingresarLaAPaginaToolQA() {
        theActorCalled("Azziz").wasAbleTo(Open.browserOn(new PaginainicioElement())
        );
    }

    @When("^Seleccionar element y despues Web Tables, Add$")
    public void seleccionarElementYDespuesWebTablesAdd() {
        theActorInTheSpotlight().attemptsTo(BottonElement.bottonElement());
    }

    @Then("^realizar registros (.*) (.*) (.*) (.*) (.*) (.*)$")
    public void realizarRegistrosAzzizyunezyunezAHotmailComAntioquia(String firtname,String lastname,String email,String age,String salary,String departament) {
        theActorInTheSpotlight().attemptsTo(LlenarFormulario.llenarFormulario(firtname, lastname, email, age, salary, departament,NAME, LAST_NAME,EMAIL,AGE,SALARY,DEPARTAMENT));

    }
}

