package com.tools.Taks.Alertas;

import com.tools.Ui.Alertas.Alertas;
import net.serenitybdd.screenplay.Actor;
import net.serenitybdd.screenplay.Task;
import net.serenitybdd.screenplay.Tasks;
import net.serenitybdd.screenplay.actions.Click;

public class Alerts2 implements Task {
    @Override
    public <T extends Actor> void performAs(T actor) {
        actor.attemptsTo(
                Click.on(Alertas.BOTTON_SEE_ALERT_ACCEPT_CANCEL)
        );
    }
    public static Alerts2 alerts2() {
        return Tasks.instrumented(Alerts2.class);
    }
}
