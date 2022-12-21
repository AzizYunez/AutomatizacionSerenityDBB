package com.tools.Taks.AddDelete;

import com.tools.Ui.AddDelete.PaginaResultadoElement;
import net.serenitybdd.screenplay.Actor;
import net.serenitybdd.screenplay.Task;
import net.serenitybdd.screenplay.Tasks;
import net.serenitybdd.screenplay.actions.Click;
import net.serenitybdd.screenplay.actions.Enter;
import net.serenitybdd.screenplay.actions.Scroll;
import net.serenitybdd.screenplay.targets.Target;

public class LlenarFormulario implements Task{
private String firtname;
    private Target fielFirtname;
    private String lastname;
    private Target fielLastname;
    private String email;
    private Target fielEmail;
    private String age;
    private Target fielAge;
    private String salary;
    private Target fielSalary;
    private String departament;
    private Target fielDepartamen;

    public LlenarFormulario(String firtname,String lastname, String email, String age, String salary, String departament, Target... targets){
        this.firtname=firtname;
        this.fielFirtname = targets[0];
        this.lastname=lastname;
        this.fielLastname = targets[1];
        this.email=email;
        this.fielEmail = targets[2];
        this.age=age;
        this.fielAge = targets[3];
        this.salary=salary;
        this.fielSalary = targets[4];
        this.departament=departament;
        this.fielDepartamen = targets[5];
    }
    public static LlenarFormulario llenarFormulario(String firtname,String lastname, String email, String age, String salary, String departament, Target... targets){
        return Tasks.instrumented(LlenarFormulario.class, firtname,lastname,email,age,salary,departament,targets);
    }
    @Override
    public <T extends Actor> void performAs(T actor) {
        actor.attemptsTo(
                Scroll.to(PaginaResultadoElement.BOTTON_WEB_TABLES),
                Click.on(PaginaResultadoElement.BOTTON_WEB_TABLES),
                Click.on(PaginaResultadoElement.BOTTON_ADD),
                Enter.theValue(firtname).into(fielFirtname),
                Enter.theValue(lastname).into(fielLastname),
                Enter.theValue(email).into(fielEmail),
                Enter.theValue(age).into(fielAge),
                Enter.theValue(salary).into(fielSalary),
                Enter.theValue(departament).into(fielDepartamen),
                Click.on(PaginaResultadoElement.BUTTON_SUMMIT),
                Click.on(PaginaResultadoElement.BUTTON_DELETE)
        );
    }
}

