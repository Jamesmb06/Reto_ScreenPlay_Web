#language:es
#encoding:UTF-8
#Author: James Arley Muñoz Borja

Característica: Compra en pagina de la vaquita
  yo como usuario de la pagina de la vaquita express
  quiero crear una cuenta e ingresar
  para poder comprar productos en la página

  Escenario: Iniciar sesion y realizar una compra
    Dado que el usuario esta en la pagina principal de la vaquita express
    Cuando se dirige a la seccion clientes e inicia sesion
    Y selecciona la categoria mascostas de productos realizando una compra
    Entonces debera ver un mensaje de confirmacion de la compra

