import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.assertEquals;


public class memoTest{

    private MemoModel model;
    private MemoController controller;

    @Before
    public void setUp()throws Exception{

        model = new MemoModel();
        //controller = new MemoController(model);
    }

/*    @Test
    public void setearDificultad() throws Exception{

        controller.setBPM(MemoModel.DIFICIL);
        int valor = model.getDificultad();
        assertEquals("setar dificultad desde el controlador",MemoModel.DIFICIL,valor,0);

    }

    @Test
    public void test2() throws Exception{
        controller.decreaseBPM();
        int valor = model.getDificultad();
        assertEquals("bajar dificultad",MemoModel.FACIL,valor, 0);
    }
*/
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
        assertEquals(" ", expected, duracion,0);
    }
}