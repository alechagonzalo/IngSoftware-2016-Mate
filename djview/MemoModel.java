import java.util.ArrayList;
import java.util.Random;


public class MemoModel  extends Model{

    public static final int FACIL = 1;
    public static final int NORMAL = 2;
    public static final int DIFICIL = 3;


    public ArrayList<DificultadObserverInterface> dificultadObservers;

    private ArrayList<String> secuencias;
    private int dificultad;
    private String secuencia;


    public MemoModel(){
        dificultadObservers = new ArrayList<>();
        Random rand = new Random(32847);
        secuencias = new ArrayList<>();
        for(int i = 0; i < 10; i++){
            secuencias.add(String.valueOf(rand.nextInt(100000)));
        }
        dificultad = NORMAL;
        secuencia = "";

    }

    public void registerObserver(DificultadObserverInterface o){
        dificultadObservers.add(o);
    }

    public void unregisterObserver(DificultadObserverInterface o){
        dificultadObservers.remove(o);
    }


    public String getNextSecuence(){
        return secuencias.get(new Random().nextInt(10));
    }


    public String getNombre(int dificultad){
        switch (dificultad){
            case FACIL:
                return "Facil";
            case NORMAL:
                return "Normal";
            case DIFICIL:
                return "Dificil";
            default:
                return "Inexistente";
        }
    }


    public int getDuracion(int level){
        switch(level){
            case FACIL:
                return 5000;
            case NORMAL:
                return 4000;
            case DIFICIL:
                return 3000;
            default:
                return 0;
        }
    }

    public void notifySecuencia(){

    }

    public void notifyDificultad(){
        for( DificultadObserverInterface obs : dificultadObservers)
            obs.updateDificultad();
    }

    public int getDificultad() {
        return dificultad;
    }

    public void setDificultad(int dificultad){

        if(dificultad == FACIL  || dificultad == NORMAL || dificultad == DIFICIL) {
            this.dificultad = dificultad;
            notifyDificultad();
        }
    }

}
