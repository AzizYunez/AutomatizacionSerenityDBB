package com.tools.Taks.Alertas;

import com.tools.Ui.Alertas.Alertas;
import net.serenitybdd.screenplay.Actor;
import net.serenitybdd.screenplay.Task;
import net.serenitybdd.screenplay.Tasks;
import net.serenitybdd.screenplay.actions.Click;
import net.serenitybdd.screenplay.actions.Scroll;

public class RutaAlertas implements Task {
    @Override
    public <T extends Actor> void performAs(T actor) {
        actor.attemptsTo(
                Scroll.to(Alertas.BOTTON_ALERT),
                Click.on(Alertas.BOTTON_ALERT),
                Scroll.to(Alertas.BOTTON_ALERTS),
                Click.on(Alertas.BOTTON_ALERTS)
        );
    }
    public static RutaAlertas rutaAlertas() {
        return Tasks.instrumented(RutaAlertas.class);
    }
}
