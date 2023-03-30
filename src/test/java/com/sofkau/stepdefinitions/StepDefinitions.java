package com.sofkau.stepdefinitions;

import com.sofkau.setup.Configuracion;
import com.sofkau.tasks.AbrirPaginaInicial;
import io.cucumber.java.es.Cuando;
import io.cucumber.java.es.Dado;
import io.cucumber.java.es.Entonces;
import static com.sofkau.questions.MensajeOrdenRealizada.mensajeOrdenrealizada;
import static com.sofkau.tasks.IniciarSesion.iniciarSesion;
import static com.sofkau.tasks.RealizarCompra.realizarCompra;
import static net.serenitybdd.screenplay.GivenWhenThen.seeThat;
import static net.serenitybdd.screenplay.actors.OnStage.theActorInTheSpotlight;
import static org.hamcrest.CoreMatchers.equalTo;
import java.io.FileNotFoundException;
import java.util.logging.Logger;
public class StepDefinitions extends Configuracion {
    public static Logger LOGGER = Logger.getLogger(String.valueOf((StepDefinitions.class)));
    @Dado("que el usuario esta en la pagina principal de la vaquita express")
    public void queElUsuarioEstaEnLaPaginaPrincipalDeLaVaquitaExpress() {
        configurarNavegador();
        theActorInTheSpotlight().wasAbleTo(
                new AbrirPaginaInicial()

        );
    }
    @Cuando("se dirige a la seccion clientes e inicia sesion")
    public void seDirigeALaSeccionClientesEIniciaSesion() throws FileNotFoundException {
        theActorInTheSpotlight().attemptsTo(
                iniciarSesion()
        );
    }
    @Cuando("selecciona la categoria mascostas de productos realizando una compra")
    public void seleccionaLaCategoriaMascostasDeProductosRealizandoUnaCompra() {
        theActorInTheSpotlight().attemptsTo(
                realizarCompra()
        );
    }
    @Entonces("debera ver un mensaje de confirmacion de la compra")
    public void deberaVerUnMensajeDeConfirmacionDeLaCompra() {
        LOGGER.info("Verificando que el usuario vea un mensaje de confirmacion de compra");
        theActorInTheSpotlight().should(
                seeThat(mensajeOrdenrealizada(), equalTo("ORDER PLACED!"))
        );
        LOGGER.info("Mensaje de confirmacion de compra verificado correctamente");
        quitarDriver();
        LOGGER.info("Driver quitado");
    }
}





