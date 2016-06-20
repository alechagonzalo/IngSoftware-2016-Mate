import java.util.ArrayList;
import java.util.Random;


public class MemoModel  extends Model{

    public static final int FACIL = 1;
    public static final int NORMAL = 2;
    public static final int DIFICIL = 3;


    public ArrayList<DificultadObserverInterface> dificultadObservers;

    private ArrayList<String> secuencias;
    private int dificultad;
    int proximo;


    public MemoModel(){
        dificultadObservers = new ArrayList<>();
        Random rand = new Random(System.currentTimeMillis());
        secuencias = new ArrayList<>();
        for(int i = 0; i < 15; i++){
            int num = rand.nextInt(100000);
            while(num < 10000) {num *= rand.nextInt(10);}
            secuencias.add(String.valueOf(num));
        }
        dificultad = NORMAL;
        proximo = 0;

    }

    public void registerObserver(DificultadObserverInterface o){
        dificultadObservers.add(o);
    }

    public void unregisterObserver(DificultadObserverInterface o){
        dificultadObservers.remove(o);
    }


    public String getNextSecuence(){
        if(proximo < secuencias.size()){
            String salida = secuencias.get(proximo);
            proximo++;
            return salida;
        }
        else{
            String salida = secuencias.get(0);
            proximo = 1;
            return salida;
        }

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

    @Override
    public void clearObservers() {
        dificultadObservers.clear();
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
