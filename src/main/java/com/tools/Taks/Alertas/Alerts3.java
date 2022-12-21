package com.tools.Taks.Alertas;

import com.tools.Ui.Alertas.Alertas;
import net.serenitybdd.screenplay.Actor;
import net.serenitybdd.screenplay.Task;
import net.serenitybdd.screenplay.Tasks;
import net.serenitybdd.screenplay.actions.Click;
import net.serenitybdd.screenplay.actions.Scroll;

public class Alerts3 implements Task {
    @Override
    public <T extends Actor> void performAs(T actor) {
        actor.attemptsTo(
                Scroll.to(Alertas.BOTTON_SEE_ALERT_STRING),
                Click.on(Alertas.BOTTON_SEE_ALERT_STRING)
        );
    }public static Alerts3 alerts3() {
        return Tasks.instrumented(Alerts3.class);
    }
}
