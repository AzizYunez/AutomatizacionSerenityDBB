package com.tools.Taks.Fechas;

import com.tools.Ui.Fechas.Fechas;
import net.serenitybdd.screenplay.Actor;
import net.serenitybdd.screenplay.Task;
import net.serenitybdd.screenplay.Tasks;
import net.serenitybdd.screenplay.actions.Click;
import net.serenitybdd.screenplay.actions.Scroll;

public class FechaDatePicker implements Task {

    @Override
    public <T extends Actor> void performAs(T actor) {
        actor.attemptsTo(
                Scroll.to(Fechas.BOTTON_SELLECT_DATE_PICKER),
                Click.on(Fechas.BOTTON_SELLECT_DATE_PICKER),
                Click.on(Fechas.BOTTON_SELLECT_DATE),
                Click.on(Fechas.SELECCIONAR_ANO),
                Click.on(Fechas.SELECCIONAR_ANO_),
                Click.on(Fechas.SELECCIONAR_MES),
                Click.on(Fechas.SELECCIONAR_MES_),
                Click.on(Fechas.SELECCIONAR_DIA)
        );
    }
    public static FechaDatePicker datePicker(){
        return Tasks.instrumented(FechaDatePicker.class);
    }
}
