import org.junit.Before;
import org.junit.Test;

import javax.xml.bind.annotation.XmlAttribute;

import static org.junit.Assert.*;

/**
 * Created by ignacio on 20/06/16.
 */
public class MemoControllerTest{

    private MemoModel model;
    private MemoController controller;

    @Before
    public void setUp() throws Exception {

        model = new MemoModel();
        controller = new MemoController(model);
    }

    @Test
    public void controllerTest1() throws Exception{

        controller.increaseBPM();

        assertEquals("el puntaje no es el que deberia", MemoModel.DIFICIL, model.getDificultad(),0);
    }

    @Test
    public void controllerTest2() throws Exception{

        controller.setBPM(MemoModel.FACIL);

        assertEquals(" el puntaje no es el esperado", model.getDificultad(), MemoModel.FACIL,0);
    }

    @Test
    public void controllerTest3() throws Exception{

        controller.decreaseBPM();

        assertEquals(" el puntaje no es el esperado", MemoModel.FACIL, model.getDificultad(),0);
    }
}
