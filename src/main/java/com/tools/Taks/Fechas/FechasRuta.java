package com.tools.Taks.Fechas;

import com.tools.Ui.Fechas.Fechas;
import net.serenitybdd.screenplay.Actor;
import net.serenitybdd.screenplay.Task;
import net.serenitybdd.screenplay.Tasks;
import net.serenitybdd.screenplay.actions.Click;
import net.serenitybdd.screenplay.actions.Scroll;

public class FechasRuta implements Task {

    @Override
    public <T extends Actor> void performAs(T actor) {
        actor.attemptsTo(
                Scroll.to(Fechas.BOTTON_WIDGETS),
                Click.on(Fechas.BOTTON_WIDGETS)
        );
    }
    public static FechasRuta fechasRuta(){
        return Tasks.instrumented(FechasRuta.class);
    }

}
