package com.sofkau.tasks;


import net.serenitybdd.screenplay.Actor;
import net.serenitybdd.screenplay.Task;
import net.serenitybdd.screenplay.actions.Click;
import net.serenitybdd.screenplay.actions.Scroll;
import net.serenitybdd.screenplay.waits.WaitUntil;
import static com.sofkau.ui.ProcesoCompra.*;
import static net.serenitybdd.screenplay.matchers.WebElementStateMatchers.*;
public class RealizarCompra implements Task {
    @Override
    public <T extends Actor> void performAs(T actor) {

        actor.attemptsTo(
                WaitUntil.the(CARRITO,isClickable()),
                Click.on(CARRITO),
                WaitUntil.the(REALIZAR_PEDIDO,isClickable()),
                Click.on(REALIZAR_PEDIDO),
                WaitUntil.the(SIGUIENTE,isClickable()),
                Scroll.to(SIGUIENTE),
                Click.on(SIGUIENTE),
                WaitUntil.the(PAGO_CONSIGNACION,isClickable()),
                Click.on(PAGO_CONSIGNACION),
                WaitUntil.the(COMPRAR,isClickable()),
                Scroll.to(COMPRAR)
                //Click.on(COMPRAR)
        );
    }
    public static RealizarCompra realizarCompra() {
        return new RealizarCompra();
    }

}
