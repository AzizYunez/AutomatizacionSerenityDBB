package com.tools.Taks.Fechas;

import com.tools.Ui.Fechas.FechasConHora;
import net.serenitybdd.screenplay.Actor;
import net.serenitybdd.screenplay.Task;
import net.serenitybdd.screenplay.Tasks;
import net.serenitybdd.screenplay.actions.Click;


public class FechaHoraDataPicker implements Task {

    @Override
    public <T extends Actor> void performAs(T actor) {
        actor.attemptsTo(
                Click.on(FechasConHora.BOTTON_SELLECT_DATE_TIME),
                Click.on(FechasConHora.SELECCIONAR_MES_TIME),
                Click.on(FechasConHora.SELECCIONAR_MES_TIME_),
                Click.on(FechasConHora.SELECCIONAR_ANO_TIME),
                Click.on(FechasConHora.SELECCIONAR_ANO_TIME_),
                Click.on(FechasConHora.SELECCIONAR_DIA_TIME),
                Click.on(FechasConHora.SELECCIONAR_TIME)
        );
    }
    public static FechaHoraDataPicker fechaHoraDataPicker(){
        return Tasks.instrumented(FechaHoraDataPicker.class);
    }

}
