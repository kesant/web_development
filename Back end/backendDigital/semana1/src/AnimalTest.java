import static org.junit.jupiter.api.Assertions.*;

class AnimalTest {

    @org.junit.jupiter.api.Test
    void esPesado() {
        Animal caballo =new Animal("caballo","grande",500);
        Animal perro =new Animal("caballo","grande",500);
        boolean esPesado=caballo.esPesado();
        boolean esPesado1=perro.esPesado();

        assertEquals(true,caballo.esPesado());
        assertFalse(esPesado1);
    }

}