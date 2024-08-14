import java.util.ArrayList;
import java.util.List;
public class Grupo {

    List<Persona> integrante;

    public Grupo() {
        integrante=new ArrayList<>();
    }

    public List<Persona> getIntegrante() {
        return integrante;
    }

    public void setIntegrante(List<Persona> integrante) {
        this.integrante = integrante;
    }
    public void agregarPersona(Persona persona){
        if(persona.tiene18años()&&persona.nombreCincoLetras()&&persona.nombreContienesoloAZ()){
            this.integrante.add(persona);
        }


    }
}
