//Parseando
let edad = prompt("ingrese su edad");
console.log(edad+2021);
//parseint
parseInt("22");
parseInt(prompt("Ingrese edad"));
let a = parseInt("22");
let b = parseInt(prompt("Ingrese edad"));
let c = parseInt("22"+"150");
let d = parseInt(22+150)
let e = parseInt(22+parseInt("150"));
let f = parseInt(22.55);
console.log(a);
console.log(b);
console.log(c);
console.log(d);
console.log(e);
console.log(f);
//parsefloat
console.log(parseFloat(22.34));
console.log(parseFloat(22.3456284));
//NaN
let edad = parseInt(prompt("Ingrese su edad"));
if(edad>18){
console.log("Es mayor de edad");
}else{
console.log("Es menor de edad");
}