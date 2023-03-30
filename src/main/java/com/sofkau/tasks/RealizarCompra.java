package com.sofkau.tasks;

import com.sofkau.ui.ProcesoCompra;
import net.serenitybdd.screenplay.Actor;
import net.serenitybdd.screenplay.Task;
import net.serenitybdd.screenplay.actions.Click;

public class RealizarCompra implements Task {
    @Override
    public <T extends Actor> void performAs(T actor) {

        actor.attemptsTo(
                Click.on(ProcesoCompra.CATEGORIA_PRODUCTOS),
                Click.on(ProcesoCompra.ORDENAR),
                Click.on(ProcesoCompra.ORDENAR_POR_NOMBRE),
                Click.on(ProcesoCompra.ITEM1),
                Click.on(ProcesoCompra.CARRITO),
                Click.on(ProcesoCompra.REALIZAR_PEDIDO),
                Click.on(ProcesoCompra.SIGUIENTE),
                Click.on(ProcesoCompra.PAGO_EFECTIVO)
                //Click.on(ProcesoCompra.COMPRAR)
        );
    }
    public static RealizarCompra realizarCompra() {
        return new RealizarCompra();
    }

}
