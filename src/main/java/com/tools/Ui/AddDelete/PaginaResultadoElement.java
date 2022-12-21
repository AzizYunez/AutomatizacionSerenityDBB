package com.tools.Ui.AddDelete;

import net.serenitybdd.core.pages.PageObject;
import net.serenitybdd.screenplay.targets.Target;
import org.openqa.selenium.By;

public class PaginaResultadoElement {
    public static final Target BOTTON_ELEMENT = Target.the("Botton Element")
            .located(By.xpath("//*[@class='card mt-4 top-card'][1]"));
    public static final Target BOTTON_WEB_TABLES= Target.the("Botton WEB TABLES")
            .located(By.xpath("/html/body/div[2]/div/div/div[2]/div[1]/div/div/div[1]/div/ul/li[4]"));
    public static final Target BOTTON_ADD = Target.the("Botton ADD")
            .located(By.xpath("//*[@id='addNewRecordButton']"));
    public static final Target NAME = Target.the("Ingresar name")
            .located(By.id("firstName"));
    public static final Target LAST_NAME = Target.the("Ingresar  last name")
            .located(By.xpath("//*[@id='lastName']"));
    public static final Target EMAIL = Target.the("Ingresar  email")
            .located(By.xpath("//*[@id='userEmail']"));
    public static final Target AGE = Target.the("Ingresar  age")
            .located(By.xpath("//*[@id='age']"));
    public static final Target SALARY = Target.the("Ingresar  salary")
            .located(By.xpath("//*[@id='salary']"));
    public static final Target DEPARTAMENT = Target.the("Ingresar  departament")
            .located(By.xpath("//*[@id='department']"));
    public static final Target BUTTON_SUMMIT = Target.the("Button summit")
            .located(By.xpath("//*[@id='submit']"));
    public static final Target BUTTON_DELETE = Target.the("button summit")
            .located(By.xpath("//*[@id='delete-record-1']"));

}
