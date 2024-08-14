import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class GrupoTest {
    @Test
    void testearSoloMayoresAcincoLetras(){
        Persona persona1=new Persona("Juan",20);
        Persona persona2=new Persona("Pedro",20);
        Persona persona3=new Persona("Ana",20);
        Persona persona4=new Persona("Luz",20);
        Persona persona5=new Persona("Julian",20);

        Grupo grupo =new Grupo();
        /////
        grupo.agregarPersona(persona1);
        grupo.agregarPersona(persona2);
        grupo.agregarPersona(persona3);
        grupo.agregarPersona(persona4);
        grupo.agregarPersona(persona5);
        assertEquals(grupo.integrante.size(),2);
    }
}