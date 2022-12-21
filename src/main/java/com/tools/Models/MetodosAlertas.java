package com.tools.Models;
import net.serenitybdd.screenplay.Performable;
import net.serenitybdd.screenplay.Task;
import net.serenitybdd.screenplay.abilities.BrowseTheWeb;

public class MetodosAlertas {
    public static Performable accept() {
        return Task.where("You clicked a button",
                actor -> BrowseTheWeb.as(actor).getDriver().switchTo().alert().accept());
    }
    public static Performable cancel() {
        return Task.where("Do you confirm action?",
                actor -> BrowseTheWeb.as(actor).getDriver().switchTo().alert().dismiss());
    }
    public static Performable Text() {
        return Task.where("Please enter your name",
                actor -> BrowseTheWeb.as(actor).getDriver().switchTo().alert().sendKeys("Azziz"));
    }
}
