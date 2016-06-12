
import java.awt.*;
import java.util.Timer;
import java.util.TimerTask;


public class MemoController implements ControllerInterface{

    private DJView view;
    private Model model;
    private MemoView botonera;

    public MemoController(Model model){
        this.model = model;
        view = new DJView(this, model);
        view.createView();
        view.createControls();
        view.disableStopMenuItem();
        view.updateDificultad();
        botonera = view.createMemoView();
    }

    @Override
    public void start() {

        int level = model.getDificultad();
        botonera.resetPulsacion();
        String secuencia = model.getNextSecuence();

        botonera.setLabel(secuencia);
        botonera.activarBotones(false);

        int duracion = model.getDuracion(level);
        tiempo(duracion);
        juega(secuencia,duracion+4000);

    }


    @Override
    public void setBPM(int bpm) {
        model.setDificultad(bpm);
    }

    private void tiempo(int mili){
        Timer timer = new Timer();

        TimerTask task = new TimerTask() {

            @Override
            public void run(){

                botonera.setLabel("");
                botonera.activarBotones(true);

            }
        };

        timer.schedule(task, mili);
    }

    private  void juega(final String secuencia, int mili){

        Timer timer = new Timer();

        TimerTask task = new TimerTask() {

            @Override
            public void run(){

                String pulsacion = botonera.getPulsacion();
                if(secuencia.equals(pulsacion)) {
                    botonera.setLabel("Acertaste!");
                    Toolkit toolkit = Toolkit.getDefaultToolkit();
                    toolkit.beep();
                }
                else {
                    botonera.setLabel("Perdiste!");
                }

                botonera.activarBotones(false);
            }
        };

        timer.schedule(task, mili);
    }

    @Override
    public void stop() {
        // TODO Auto-generated method stub

    }

    @Override
    public void increaseBPM() {

        int dificultad = model.getDificultad();
        switch(dificultad){
            case MemoModel.FACIL:
                model.setDificultad(MemoModel.NORMAL);
                break;
            case MemoModel.NORMAL:
                model.setDificultad(MemoModel.DIFICIL);
                break;
        }
    }

    @Override
    public void decreaseBPM() {

        int dificultad = model.getDificultad();
        switch(dificultad){
            case MemoModel.DIFICIL:
                model.setDificultad(MemoModel.NORMAL);
                break;
            case MemoModel.NORMAL:
                model.setDificultad(MemoModel.FACIL);
                break;
        }
    }


}
