package com.sofkau.ui;

import net.serenitybdd.screenplay.targets.Target;
import net.thucydides.core.pages.PageObject;
import org.openqa.selenium.By;

public class ProcesoCompra extends PageObject {

    public static final Target CAT_MASCOTAS = Target.the("Productos").located(By.xpath("(//a[@href='https://vaquitaexpress.com.co/mascotas.html'])[1]"));
    public static final Target ORDENAR = Target.the("ORDENAR").located(By.xpath("(//div)[69]"));
    public static final Target ORDENAR_POR_NOMBRE = Target.the("Hombres").located(By.xpath("(//div[@data-value='name'])[1]"));
    public static final Target SCROLL = Target.the("item1").located(By.xpath("(//*[name()='svg'])[10]"));
    public static final Target ITEM1 = Target.the("item1").located(By.xpath("(//*[name()='svg'])[13]"));
    public static final Target ITEM2 = Target.the("item2").located(By.xpath("(//*[name()='svg'])[14]"));
    public static final Target ITEM3 = Target.the("item3").located(By.xpath("(//*[name()='svg'])[13]"));
    public static final Target CAT_LICORES = Target.the("item3").located(By.xpath("(//a[@href='https://vaquitaexpress.com.co/licores-bebidas-y-snacks.html'])[1]"));
    public static final Target CERVEZAS = Target.the("item3").located(By.xpath("(//label[@for='filter_item_cat_2513'])[1]"));
    public static final Target ORDENAR_POR_PRECIO = Target.the("item3").located(By.xpath("(//div[@data-value='price'])[1]"));
    public static final Target CARRITO = Target.the("carrito").located(By.xpath("(//a[@data-bind=\"scope: 'minicart_content'\"])[1]"));
    public static final Target FLECHA = Target.the("carrito").located(By.xpath("(//*[name()='polygon'])[1]"));
    public static final Target REALIZAR_PEDIDO = Target.the("realizar pedido").located(By.xpath("(//button[@id='top-cart-btn-checkout'])[1]"));
    public static final Target SIGUIENTE = Target.the("siguiente").located(By.xpath("(//button[@data-role='opc-continue'])[1]"));
    public static final Target PAGO_CONSIGNACION = Target.the("metodo de pago").located(By.xpath("(//input[@id='banktransfer'])[1]"));
    public static final Target COMPRAR = Target.the("realizar el pedido").located(By.xpath("(//button[@title='Realizar pedido'])[1]"));

}
