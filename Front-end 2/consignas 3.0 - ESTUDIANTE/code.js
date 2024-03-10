/* --------------------------- NO TOCAR DESDE ACÁ --------------------------- */
let datosPersona = {
  nombre: "",
  edad: 0,
  ciudad: "",
  interesPorJs: "",
};

const listado = [{
    imgUrl: "https://huguidugui.files.wordpress.com/2015/03/html1.png",
    lenguajes: "HTML y CSS",
    bimestre: "1er bimestre",
  },
  {
    imgUrl: "https://jherax.files.wordpress.com/2018/08/javascript_logo.png",
    lenguajes: "Javascript",
    bimestre: "2do bimestre",
  },
  {
    imgUrl: "https://upload.wikimedia.org/wikipedia/commons/thumb/4/47/React.svg/1200px-React.svg.png",
    lenguajes: "React JS",
    bimestre: "3er bimestre",
  },
];

const profileBtn = document.querySelector("#completar-perfil");
const materiasBtn = document.querySelector("#obtener-materias");
const verMasBtn = document.querySelector("#ver-mas");
const cambiarTema = document.querySelector('#cambiar-tema');

profileBtn.addEventListener("click", renderizarDatosUsuario);
materiasBtn.addEventListener("click", recorrerListadoYRenderizarTarjetas);
cambiarTema.addEventListener("click", alternarColorTema);
/* --------------------------- NO TOCAR HASTA ACÁ --------------------------- */

function obtenerDatosDelUsuario() {
  /* --------------- PUNTO 1: Escribe tu codigo a partir de aqui --------------- */
 
  do {
    datosPersona.nombre=prompt("Ingresa tu nombre : ");
  }while(datosPersona.nombre=="");
  let año_nacimiento;
  do{
    año_nacimiento=parseInt(prompt("Ingrea tu año de nacimiento: "));
  }while(isNaN(año_nacimiento))
  datosPersona.edad=2024-año_nacimiento;
  do {
    datosPersona.ciudad=prompt("Ingresa la ciudad donde vives : ");
  }while(datosPersona.ciudad=="");
  let interes=confirm("Te interesa Javascript?");
  if (interes){
    datosPersona.interesPorJs="Si";
  }else{
    datosPersona.interesPorJs="No";
  }


}

function renderizarDatosUsuario() {
  /* ------------------- NO TOCAR NI ELIMINAR ESTA FUNCION. ------------------- */
  obtenerDatosDelUsuario();
  /* --------------- PUNTO 2: Escribe tu codigo a partir de aqui --------------- */
  document.querySelector("#nombre").innerHTML=datosPersona.nombre;
  document.querySelector("#edad").innerHTML=datosPersona.edad;
  document.querySelector("#ciudad").innerHTML=datosPersona.ciudad;
  document.querySelector("#javascript").innerHTML=datosPersona.interesPorJs;
}


function recorrerListadoYRenderizarTarjetas() {
  /* ------------------ PUNTO 3: Escribe tu codigo desde aqui ------------------ */
  
  const tarjetas = document.querySelector("#fila");
  console.log(tarjetas)
  for (var tarjeta of listado){
      const template =`
      <div class="caja">
      <img src=${tarjeta.imgUrl} alt=${tarjeta.lenguajes} />
      <p class="lenguajes">${tarjeta.lenguajes}</p>
      <p class ="bimestre">${tarjeta.bimestre}</p>
      </div>`;
      tarjetas.innerHTML += template;
  }
  materiasBtn.removeEventListener("click", recorrerListadoYRenderizarTarjetas);

}

function alternarColorTema() {
  /* --------------------- PUNTO 4: Escribe tu codigo aqui --------------------- */
  document.querySelector("#sitio").classList.toggle("dark");
  


}

/* --------------------- PUNTO 5: Escribe tu codigo aqui --------------------- */
document.addEventListener("keydown",function(e){
  console.log(e.key);
  if (e.key.toLowerCase()=="f"){
    document.querySelector("#sobre-mi").classList.remove("oculto");
  }
})