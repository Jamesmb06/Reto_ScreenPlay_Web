package com.sofkau.ui;

import net.serenitybdd.screenplay.targets.Target;
import net.thucydides.core.pages.PageObject;
import org.openqa.selenium.By;

public class ItemsLicores extends PageObject {

    public static final Target ORDENAR = Target.the("ORDENAR").located(By.xpath("(//div)[69]"));
    public static final Target FLECHA = Target.the("carrito").located(By.xpath("(//*[name()='polygon'])[1]"));
    public static final Target SCROLL = Target.the("item1").located(By.xpath("(//*[name()='svg'])[10]"));
    public static final Target ITEM3 = Target.the("item3").located(By.xpath("(//*[name()='svg'])[13]"));
    public static final Target CAT_LICORES = Target.the("item3").located(By.xpath("(//a[@href='https://vaquitaexpress.com.co/licores-bebidas-y-snacks.html'])[1]"));
    public static final Target CERVEZAS = Target.the("item3").located(By.xpath("(//label[@for='filter_item_cat_2513'])[1]"));
    public static final Target ORDENAR_POR_PRECIO = Target.the("item3").located(By.xpath("(//div[@data-value='price'])[1]"));
}