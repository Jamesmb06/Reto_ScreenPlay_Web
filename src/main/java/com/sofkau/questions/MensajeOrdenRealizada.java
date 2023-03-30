package com.sofkau.questions;

import net.serenitybdd.screenplay.Actor;
import net.serenitybdd.screenplay.Question;

import static com.sofkau.ui.ConfirmarCompra.MENSAJE_ORDER;

public class MensajeOrdenRealizada implements Question<String> {
    @Override
    public String answeredBy(Actor actor) {
        return MENSAJE_ORDER.resolveFor(actor).getText();
    }

    public static MensajeOrdenRealizada mensajeOrdenrealizada(){
        return new MensajeOrdenRealizada();
    }
}

