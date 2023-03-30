package com.sofkau.tasks;

import com.sofkau.ui.ProcesoCompra;
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
                WaitUntil.the(CAT_MASCOTAS,isClickable()),
                Click.on(CAT_MASCOTAS),
                WaitUntil.the(ORDENAR,isClickable()),
                Click.on(ORDENAR),
                WaitUntil.the(ORDENAR_POR_NOMBRE,isClickable()),
                Click.on(ORDENAR_POR_NOMBRE),
                WaitUntil.the(ITEM1,isClickable()),
                Scroll.to(SCROLL),
                Click.on(ITEM1),
                WaitUntil.the(ITEM2,isClickable()),
                Click.on(ITEM2),
                WaitUntil.the(CAT_LICORES,isClickable()),
                Click.on(CAT_LICORES),
                WaitUntil.the(CERVEZAS,isClickable()),
                Click.on(CERVEZAS),
                WaitUntil.the(ORDENAR,isClickable()),
                Click.on(ORDENAR),
                WaitUntil.the(ORDENAR_POR_PRECIO,isClickable()),
                Click.on(ORDENAR_POR_PRECIO),
                WaitUntil.the(FLECHA,isClickable()),
                Click.on(FLECHA),
                WaitUntil.the(ITEM3,isClickable()),
                Scroll.to(SCROLL),
                Click.on(ITEM3),
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
                Scroll.to(COMPRAR),
                Click.on(ProcesoCompra.COMPRAR)
        );
    }
    public static RealizarCompra realizarCompra() {
        return new RealizarCompra();
    }

}
