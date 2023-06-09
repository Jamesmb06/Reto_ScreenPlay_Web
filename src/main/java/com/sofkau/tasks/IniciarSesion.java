package com.sofkau.tasks;

import net.serenitybdd.screenplay.Actor;
import net.serenitybdd.screenplay.Task;
import net.serenitybdd.screenplay.actions.Click;
import net.serenitybdd.screenplay.actions.Enter;
import net.serenitybdd.screenplay.waits.WaitUntil;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.util.Properties;
import static com.sofkau.ui.PaginaPrincipal.*;
import static net.serenitybdd.screenplay.matchers.WebElementStateMatchers.isClickable;

public class IniciarSesion implements Task {

    @Override
    public <T extends Actor> void performAs(T actor) {
        Properties propiedades= null;
        try {
            propiedades = carga();
        } catch (IOException e) {
            throw new RuntimeException(e);
        }
        actor.attemptsTo(
                WaitUntil.the(BOTON_CLIENTES,isClickable()),
                Click.on(BOTON_CLIENTES),
                Enter.theValue(propiedades.getProperty("serenity.email")).into(CAMPO_CORREO),
                Enter.theValue(propiedades.getProperty("serenity.password")).into(CAMPO_CONTRASENNA),
                WaitUntil.the(BOTON_INICIAR_SESION,isClickable()),
                Click.on(BOTON_INICIAR_SESION)
        );
    }
    public static IniciarSesion iniciarSesion() throws FileNotFoundException {
        return new IniciarSesion();
    }
    public Properties carga() throws IOException{
        Properties propiedades = new Properties();
        FileInputStream archivo = new FileInputStream("src\\test\\resources\\serenity.properties");
        propiedades.load(archivo);
        return propiedades;
    }
}