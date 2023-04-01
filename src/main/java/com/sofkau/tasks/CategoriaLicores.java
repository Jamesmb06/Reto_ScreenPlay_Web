package com.sofkau.tasks;

import net.serenitybdd.screenplay.Actor;
import net.serenitybdd.screenplay.Task;
import net.serenitybdd.screenplay.actions.Click;
import net.serenitybdd.screenplay.actions.Scroll;
import net.serenitybdd.screenplay.waits.WaitUntil;

import static com.sofkau.ui.ItemsLicores.*;
import static net.serenitybdd.screenplay.matchers.WebElementStateMatchers.isClickable;

public class CategoriaLicores implements Task {
    @Override
    public <T extends Actor> void performAs(T actor) {

        actor.attemptsTo(
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
                Click.on(ITEM3)
        );
    }
    public static CategoriaLicores categoriaLicores() {
        return new CategoriaLicores();
    }

}

