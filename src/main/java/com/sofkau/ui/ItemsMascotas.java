package com.sofkau.ui;

import net.serenitybdd.screenplay.targets.Target;
import net.thucydides.core.pages.PageObject;
import org.openqa.selenium.By;

public class ItemsMascotas extends PageObject {
    public static final Target CAT_MASCOTAS = Target.the("Productos").located(By.xpath("(//a[@href='https://vaquitaexpress.com.co/mascotas.html'])[1]"));
    public static final Target ORDENAR = Target.the("ORDENAR").located(By.xpath("(//div)[69]"));
    public static final Target ORDENAR_POR_NOMBRE = Target.the("Hombres").located(By.xpath("(//div[@data-value='name'])[1]"));
    public static final Target SCROLL = Target.the("item1").located(By.xpath("(//*[name()='svg'])[10]"));
    public static final Target ITEM1 = Target.the("item1").located(By.xpath("(//*[name()='svg'])[13]"));
    public static final Target ITEM2 = Target.the("item2").located(By.xpath("(//*[name()='svg'])[14]"));

}
