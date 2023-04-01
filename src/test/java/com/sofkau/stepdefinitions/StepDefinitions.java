package com.sofkau.stepdefinitions;
import com.sofkau.setup.Configuracion;
import com.sofkau.tasks.AbrirPaginaInicial;
import io.cucumber.java.es.Cuando;
import io.cucumber.java.es.Dado;
import io.cucumber.java.es.Entonces;
import static com.sofkau.questions.MensajeOrdenRealizada.mensajeOrdenrealizada;
import static com.sofkau.tasks.CategoriaLicores.categoriaLicores;
import static com.sofkau.tasks.CategoriaMascotas.categoriaMascotas;
import static com.sofkau.tasks.IniciarSesion.iniciarSesion;
import static com.sofkau.tasks.RealizarCompra.realizarCompra;
import static net.serenitybdd.screenplay.GivenWhenThen.seeThat;
import static net.serenitybdd.screenplay.actors.OnStage.theActorInTheSpotlight;
import static org.hamcrest.CoreMatchers.equalTo;
import java.io.FileNotFoundException;
import org.apache.log4j.Logger;
import org.junit.jupiter.api.Assertions;

public class StepDefinitions extends Configuracion {
    public static Logger LOGGER = Logger.getLogger(String.valueOf((StepDefinitions.class)));

    @Dado("que el usuario esta en la pagina principal de la vaquita express")
    public void queElUsuarioEstaEnLaPaginaPrincipalDeLaVaquitaExpress() {
        try {
            configurarNavegador();
            theActorInTheSpotlight().wasAbleTo(
                    new AbrirPaginaInicial()

            );
        } catch (Exception e) {
            LOGGER.error("Error al configurar el navegador: " + e.getMessage());
            Assertions.fail();
            quitarDriver();
        }
    }

    @Cuando("se dirige a la seccion clientes e inicia sesion")
    public void seDirigeALaSeccionClientesEIniciaSesion() throws FileNotFoundException {
        theActorInTheSpotlight().attemptsTo(
                iniciarSesion()
        );
    }

    @Cuando("selecciona las categorias de mascostas y licores realizando una compra")
    public void seleccionaLasCategoriasDeMascostasYLicoresRealizandoUnaCompra() {
        try {
            theActorInTheSpotlight().attemptsTo(
                    categoriaMascotas(),
                    categoriaLicores(),
                    realizarCompra()
            );
        } catch (Exception e) {
            LOGGER.error("Error al intentar realizar la compra: " + e.getMessage());
            Assertions.fail();
            quitarDriver();
        }
    }
    @Entonces("debera ver un mensaje de confirmacion de la compra")
    public void deberaVerUnMensajeDeConfirmacionDeLaCompra() {
        try {
            LOGGER.info("Verificando que el usuario vea un mensaje de confirmacion de compra");
            theActorInTheSpotlight().should(
                    seeThat(mensajeOrdenrealizada(), equalTo("Gracias por su compra!"))
            );
            LOGGER.info("Mensaje de confirmacion de compra verificado correctamente");
        } catch (Exception e) {
            LOGGER.error("Error al verificar el mensaje de confirmacion de compra: " + e.getMessage());
        } finally {
            Assertions.fail();
            quitarDriver();
            LOGGER.info("Driver quitado");

        }
    }
}





