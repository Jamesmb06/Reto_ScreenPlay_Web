package com.sofkau.tasks;

import com.sofkau.ui.ProcesoCompra;
import net.serenitybdd.screenplay.Actor;
import net.serenitybdd.screenplay.Task;
import net.serenitybdd.screenplay.actions.Click;
import net.serenitybdd.screenplay.waits.WaitUntil;
import static com.sofkau.ui.ProcesoCompra.*;
import static net.serenitybdd.screenplay.matchers.WebElementStateMatchers.*;
public class RealizarCompra implements Task {
    @Override
    public <T extends Actor> void performAs(T actor) {

        actor.attemptsTo(
                WaitUntil.the(CATEGORIA_PRODUCTOS,isClickable()),
                Click.on(CATEGORIA_PRODUCTOS),
                WaitUntil.the(ORDENAR,isClickable()),
                Click.on(ORDENAR),
                WaitUntil.the(ORDENAR_POR_NOMBRE,isClickable()),
                Click.on(ORDENAR_POR_NOMBRE),
                WaitUntil.the(ITEM1,isClickable()),
                Click.on(ProcesoCompra.ITEM1),
                WaitUntil.the(CARRITO,isClickable()),
                Click.on(ProcesoCompra.CARRITO),
                WaitUntil.the(REALIZAR_PEDIDO,isClickable()),
                Click.on(ProcesoCompra.REALIZAR_PEDIDO),
                WaitUntil.the(SIGUIENTE,isClickable()),
                Click.on(ProcesoCompra.SIGUIENTE),
                WaitUntil.the(PAGO_EFECTIVO,isClickable()),
                Click.on(ProcesoCompra.PAGO_EFECTIVO),
                WaitUntil.the(COMPRAR,isClickable())
                //Click.on(ProcesoCompra.COMPRAR)
        );
    }
    public static RealizarCompra realizarCompra() {
        return new RealizarCompra();
    }

}
