package com.tools.Taks.AddDelete;

import com.tools.Ui.AddDelete.PaginaResultadoElement;
import net.serenitybdd.screenplay.Actor;
import net.serenitybdd.screenplay.Task;
import net.serenitybdd.screenplay.Tasks;
import net.serenitybdd.screenplay.actions.Click;
import net.serenitybdd.screenplay.actions.Scroll;

public class BottonElement implements Task {
    @Override
    public <T extends Actor> void performAs(T actor) {
        actor.attemptsTo(Scroll.to(PaginaResultadoElement.BOTTON_ELEMENT),
                Click.on(PaginaResultadoElement.BOTTON_ELEMENT));
    }
    public static BottonElement bottonElement() {
        return Tasks.instrumented(BottonElement.class);
    }
}
