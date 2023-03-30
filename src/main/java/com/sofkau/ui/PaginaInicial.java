package com.sofkau.ui;

import net.serenitybdd.screenplay.targets.Target;
import net.thucydides.core.pages.PageObject;
import org.openqa.selenium.By;

public class PaginaInicial extends PageObject {

    public static final Target BOTON_CLIENTES = Target.the("Boton ir clientes")
            .located(By.xpath("(//i)[1]"));

    public static final Target CAMPO_CORREO = Target.the("campo correo")
            .located(By.xpath("(//input[@id='email'])[1]"));

    public static final Target CAMPO_CONTRASENNA = Target.the("campo contraseña")
            .located(By.xpath("(//input[@id='pass'])[1]"));

    public static final Target BOTON_INICIAR_SESION = Target.the("Boton iniciar sesion")
            .located(By.xpath("(//button[@id='send2'])[1]"));
}
