package com.sofkau.ui;

import net.serenitybdd.screenplay.targets.Target;
import net.thucydides.core.pages.PageObject;
import org.openqa.selenium.By;

public class ProcesoCompra extends PageObject {

    public static final Target CARRITO = Target.the("carrito").located(By.xpath("(//a[@data-bind=\"scope: 'minicart_content'\"])[1]"));
    public static final Target REALIZAR_PEDIDO = Target.the("realizar pedido").located(By.xpath("(//button[@id='top-cart-btn-checkout'])[1]"));
    public static final Target SIGUIENTE = Target.the("siguiente").located(By.xpath("(//button[@data-role='opc-continue'])[1]"));
    public static final Target PAGO_CONSIGNACION = Target.the("metodo de pago").located(By.xpath("(//input[@id='banktransfer'])[1]"));
    public static final Target COMPRAR = Target.the("realizar el pedido").located(By.xpath("(//button[@title='Realizar pedido'])[1]"));

}
