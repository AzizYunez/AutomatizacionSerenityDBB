package com.tools.Ui.Fechas;

import net.serenitybdd.core.pages.PageObject;
import net.serenitybdd.screenplay.targets.Target;
import org.openqa.selenium.By;

public class FechasConHora extends PageObject {
    public static final Target BOTTON_SELLECT_DATE_TIME = Target.the("Botton SELECT DATE AN TIME")
            .located(By.xpath("//*[@id='dateAndTimePickerInput']"));
    public static final Target SELECCIONAR_MES_TIME = Target.the("Seleccionar mes")
            .located(By.xpath("//*[@class='react-datepicker__month-read-view--down-arrow']"));
    public static final Target SELECCIONAR_MES_TIME_ = Target.the("Seleccionar mes")
            .located(By.xpath("//*[@class='react-datepicker__month-dropdown']//*[@class='react-datepicker__month-option'][1]"));
    public static final Target SELECCIONAR_ANO_TIME = Target.the("Seleccionar año")
            .located(By.xpath("//*[@class='react-datepicker__year-read-view--down-arrow']"));
    public static final Target SELECCIONAR_ANO_TIME_ = Target.the("Seleccionar año")
            .located(By.xpath("//*[@class='react-datepicker__year-option'][5]"));
    public static final Target SELECCIONAR_DIA_TIME = Target.the("Seleccionar mes")
            .located(By.xpath("//*[@class='react-datepicker__day react-datepicker__day--024']"));
    public static final Target SELECCIONAR_TIME = Target.the("Seleccionar mes")
            .located(By.xpath("//*[@class='react-datepicker__time-list-item '][5]"));

}