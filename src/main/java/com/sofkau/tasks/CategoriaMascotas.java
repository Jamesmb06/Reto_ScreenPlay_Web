package com.sofkau.tasks;

import net.serenitybdd.screenplay.Actor;
import net.serenitybdd.screenplay.Task;
import net.serenitybdd.screenplay.actions.Click;
import net.serenitybdd.screenplay.actions.Scroll;
import net.serenitybdd.screenplay.waits.WaitUntil;
import static com.sofkau.ui.ItemsMascotas.*;
import static net.serenitybdd.screenplay.matchers.WebElementStateMatchers.isClickable;

public class CategoriaMascotas implements Task {
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
                Click.on(ITEM2)
        );
    }
    public static CategoriaMascotas categoriaMascotas() {
        return new CategoriaMascotas();
    }

}

