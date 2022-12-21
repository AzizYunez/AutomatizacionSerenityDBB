package com.tools.StepDefinitions;

import com.tools.Taks.Fechas.FechaDatePicker;
import com.tools.Taks.Fechas.FechaHoraDataPicker;
import com.tools.Taks.Fechas.FechasRuta;
import com.tools.Ui.PaginaInicio.PaginaInicioWidgets;
import cucumber.api.java.Before;
import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;
import net.serenitybdd.screenplay.actions.Open;
import net.serenitybdd.screenplay.actors.OnlineCast;

import static net.serenitybdd.screenplay.actors.OnStage.*;

public class FechasStepdefinition {
    @Before
    public void setUp(){
        setTheStage(new OnlineCast());
    }

    @Given("^ingresar la a pagina inicio$")
    public void ingresarLaAPaginaInicio() {
        theActorCalled("Azziz").wasAbleTo(Open.browserOn(new PaginaInicioWidgets()));
    }
    @When("^Seleccionar widgets y opcion date picker$")
    public void seleccionarWidgetsYOpcionDatePicker() {
        theActorInTheSpotlight().attemptsTo(FechasRuta.fechasRuta());
    }
    @Then("^realizar asignacion de fechas$")
    public void realizarAsignacionDeFechas() {
        theActorInTheSpotlight().attemptsTo(FechaDatePicker.datePicker());
        theActorInTheSpotlight().attemptsTo(FechaHoraDataPicker.fechaHoraDataPicker());

    }
}
