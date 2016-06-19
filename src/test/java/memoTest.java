import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.assertEquals;


public class memoTest{

    private int variable;
    private MemoModel model;
    private MemoController controller;

    @Before
    public void setUp(){

        model = new MemoModel();
        controller = new MemoController(model);
    }

    @Test
    public void setearDificultad(){

        controller.setBPM(MemoModel.DIFICIL);
        int valor = model.getDificultad();
        assertEquals("setar dificultad desde el controlador",MemoModel.DIFICIL,valor,0);

    }

    @Test
    public void test2(){
        controller.decreaseBPM();
        int valor = model.getDificultad();
        assertEquals("bajar dificultad",MemoModel.FACIL,valor, 0);
    }
}