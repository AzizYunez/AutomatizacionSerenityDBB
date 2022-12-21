package com.tools.StepDefinitions;


import com.tools.Models.MetodosAlertas;
import com.tools.Taks.Alertas.*;
import com.tools.Ui.PaginaInicio.PaginaInicioAlert;
import cucumber.api.java.Before;
import cucumber.api.java.en.*;
import net.serenitybdd.screenplay.actions.Open;
import net.serenitybdd.screenplay.actors.OnlineCast;

import static net.serenitybdd.screenplay.actors.OnStage.*;

public class VentanasStepDefinition {
    @Before
    public void setUp(){
        setTheStage(new OnlineCast());
    }
    @Given("^Ingresamos a la pagina de inicio$")
    public void ingresamosALaPaginaDeInicio() {
        theActorCalled("Azziz").attemptsTo(Open.browserOn(new PaginaInicioAlert())
        );
    }
    @When("^Seleccionar Alerts,Frame & Windows->Alerts$")
    public void seleccionarAlertsFrameWindowsAlerts() {
        theActorInTheSpotlight().attemptsTo(RutaAlertas.rutaAlertas());
    }
    @Then("^Realizar cuatro tipos de ventana emergente$")
    public void realizarTiposDeVentanaEmergente() throws InterruptedException {
        theActorInTheSpotlight().attemptsTo(Alerts.manejoAlert());
        theActorInTheSpotlight().attemptsTo(MetodosAlertas.accept());
        theActorInTheSpotlight().attemptsTo(Alerts1.alerts1());
        Thread.sleep(8000);
        theActorInTheSpotlight().attemptsTo(MetodosAlertas.accept());
        theActorInTheSpotlight().attemptsTo(Alerts2.alerts2());
        theActorInTheSpotlight().attemptsTo(MetodosAlertas.cancel());
        theActorInTheSpotlight().attemptsTo(Alerts3.alerts3());
        theActorInTheSpotlight().attemptsTo(MetodosAlertas.Text());
        theActorInTheSpotlight().attemptsTo(MetodosAlertas.accept());
        Thread.sleep(5000);

    }
}
