console.log("Esto es un mensaje por consola");
console.log("Hola, soy otro texto");
console.log(25);
console.log(true);
//variantes
/*.error( ) → Escribe un error en consola.
.warn( ) → Escribe una advertencia en consola.
.table( ) → Escribe una tabla en la consola.
*/
let miObjeto = {
    mensaje: "Mensaje de texto",
    utilidad: "prueba de JS"
    };
let miArray = [ "Primer mensaje del array", "Segundo mensaje del array","Tercer mensaje del array"]
console.table(miObjeto);
console.table(miArray);
//OPERACIONES
let numero = 5;
let numeroEnLetras = "5";
console.log(numero == numeroEnLetras);
console.log(numero === numeroEnLetras);
/*ALERTAS
mensajes de alerta que puede ver el
usuario.
*/
alert("Esto es una alerta.");