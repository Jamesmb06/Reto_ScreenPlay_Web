package com.sofkau.ui;

import net.serenitybdd.screenplay.targets.Target;
import net.thucydides.core.pages.PageObject;
import org.openqa.selenium.By;

public class ProcesoCompra extends PageObject {

    public static final Target CATEGORIA_PRODUCTOS = Target.the("Productos").located(By.xpath("(//a[@href='https://vaquitaexpress.com.co/mascotas.html'])[1]"));
    public static final Target ORDENAR = Target.the("ORDENAR").located(By.xpath("(//div)[69]"));
    public static final Target ORDENAR_POR_NOMBRE = Target.the("Hombres").located(By.xpath("(//div[@data-value='name'])[1]"));
    public static final Target ITEM1 = Target.the("item1").located(By.xpath("(//*[name()='svg'])[10]"));
    public static final Target ITEM2 = Target.the("item2").located(By.xpath("(//*[name()='svg'])[8]"));
    public static final Target ITEM3 = Target.the("item3").located(By.xpath("(//*[name()='svg'])[9]"));
    public static final Target CARRITO = Target.the("carrito").located(By.xpath("(//a[@data-bind=\"scope: 'minicart_content'\"])[1]"));
    public static final Target REALIZAR_PEDIDO = Target.the("realizar pedido").located(By.xpath("(//button[@id='top-cart-btn-checkout'])[1]"));
    public static final Target SIGUIENTE = Target.the("siguiente").located(By.xpath("(//button[@data-role='opc-continue'])[1]"));
    public static final Target PAGO_EFECTIVO = Target.the("metodo de pago").located(By.xpath("(//input[@id='cashondelivery'])[1]"));
    public static final Target COMPRAR = Target.the("realizar el pedido").located(By.xpath("(//button[@title='Realizar pedido'])[2]"));

}
