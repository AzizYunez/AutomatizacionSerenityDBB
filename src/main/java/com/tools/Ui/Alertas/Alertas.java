package com.tools.Ui.Alertas;
import net.serenitybdd.core.pages.PageObject;
import net.serenitybdd.screenplay.targets.Target;
import org.openqa.selenium.By;

public class Alertas extends PageObject {
    public static final Target BOTTON_ALERT = Target.the("BOTTON ALERT INICIAL")
            .located(By.xpath("//*[@class='card mt-4 top-card'][3]"));
    public static final Target BOTTON_ALERTS = Target.the("BOTTON ALERTS")
            .located(By.xpath("/html/body/div[2]/div/div/div[2]/div[1]/div/div/div[3]/div/ul/li[2]"));
    public static final Target BOTTON_SEE_ALERT = Target.the("BOTTON SEE ALERT")
            .located(By.xpath("//*[@id='alertButton']"));
    public static final Target BOTTON_SEE_ALERT_5SEG = Target.the("BOTTON 5 SEG")
            .located(By.xpath("//*[@id='timerAlertButton']"));
    public static final Target BOTTON_SEE_ALERT_ACCEPT_CANCEL = Target.the("BOTTON COMFIRM BOX")
            .located(By.xpath("//*[@id='confirmButton']"));
    public static final Target BOTTON_SEE_ALERT_STRING = Target.the("BOTTON STRING")
            .located(By.xpath("//*[@id='promtButton']"));


}
