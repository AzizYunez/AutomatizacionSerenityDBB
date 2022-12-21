package com.tools.Ui.Fechas;

import net.serenitybdd.core.pages.PageObject;
import net.serenitybdd.screenplay.targets.Target;
import org.openqa.selenium.By;

public class Fechas extends PageObject {
    public static final Target BOTTON_WIDGETS = Target.the("Botton Widgets")
            .located(By.xpath("//*[@class='card mt-4 top-card'][4]"));
    public static final Target BOTTON_SELLECT_DATE_PICKER = Target.the("Botton SELECT DATE PICKER")
            .located(By.xpath("/html/body/div[2]/div/div/div[2]/div[1]/div/div/div[4]/div/ul/li[3]"));
    public static final Target BOTTON_SELLECT_DATE = Target.the("Botton SELECT DATE")
            .located(By.xpath("//input[@id='datePickerMonthYearInput']"));
    public static final Target SELECCIONAR_MES = Target.the("Seleccionar mes")
            .located(By.xpath("//*[@class='react-datepicker__month-select']"));
    public static final Target SELECCIONAR_MES_ = Target.the("Seleccionar mes")
            .located(By.xpath("/html/body/div[2]/div/div/div[2]/div[2]/div[2]/div[1]/div[2]/div[2]/div[2]/div/div/div[2]/div[1]/div[2]/div[1]/select/option[1]"));
    public static final Target SELECCIONAR_ANO = Target.the("Seleccionar año")
            .located(By.xpath("//*[@class='react-datepicker__year-select']"));
    public static final Target SELECCIONAR_ANO_ = Target.the("Seleccionar año")
            .located(By.xpath("//*[@id=\"datePickerMonthYear\"]/div[2]/div[2]/div/div/div[2]/div[1]/div[2]/div[2]/select/option[121]"));
    public static final Target SELECCIONAR_DIA = Target.the("Seleccionar mes")
            .located(By.xpath("//*[@class='react-datepicker__day react-datepicker__day--020']"));

}
