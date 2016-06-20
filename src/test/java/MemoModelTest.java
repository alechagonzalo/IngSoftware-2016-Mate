import org.junit.After;
import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.*;


public class MemoModelTest {

    private MemoModel model;

    @Before
    public void setUp()throws Exception{

        model = new MemoModel();

    }


    @Test
    public void modelTest1(){
        String nombre = model.getNombre(MemoModel.NORMAL);
        String esperado = "Normal";
        assertEquals(esperado, nombre);
    }

    @Test
    public void modelTest2(){
        int duracion = model.getDuracion(MemoModel.NORMAL);
        int expected = 4000;
        assertEquals("la duracion no es la esperada", expected, duracion,0);
    }

    @Test
    public void modelTest3(){
        for(int i = 0; i < 10; i++){
            int numero = Integer.parseInt(model.getNextSecuence());
            assertTrue("algun numero no cumplio la condicion",numero > 10000);
        }
    }

    @Test
    public void modelTest4(){
        int numero = Integer.parseInt(model.getNextSecuence());
        boolean condicion = false;
        for(int i = 0; i < 10; i++){
            if(numero == Integer.parseInt(model.getNextSecuence()))
                condicion = false;
            else
                condicion = true;
        }
        assertTrue(condicion);
    }

    @After
    public void tearDown() throws Exception {
        model = null;
        System.gc();

    }
}