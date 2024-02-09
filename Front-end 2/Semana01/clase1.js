/* -------------------------------------------------------------------------- */
/*                                  FUNCION 1                                 */
/* -------------------------------------------------------------------------- */
function iniciarJuego() {
let nombre;
alert('bienvenido al juego de piedra , papel , tijera')

do {
nombre =prompt('Ingrese su nombre minimo 3 caracteres')
}while(!nombre||nombre.length<3);

nombre=nombre.toUpperCase();
console.log('----------------')
console.log(`el nombre  es :${nombre}`);
console.log('----------------')


return nombre;
}
let nombreUsuario=iniciarJuego()

/* -------------------------------------------------------------------------- */
/*                          CONSIGNA MESA DE TRABAJO                          */
/* -------------------------------------------------------------------------- */
// 1- Modificar la funcion de iniciarJuego(), validar si ingresa un dato válido como nombre.
// 2- Si no ingresa un texto, o tiene menos de 3 caracteres debemos volverle a pedir que lo ingrese.
// 3- Finalmente el nombre devuelto debe estar todo en mayúsculas.

