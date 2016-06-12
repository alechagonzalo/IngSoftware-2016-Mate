/**
 * Created by ignacio on 11/06/16.
 */
public abstract class Model implements BeatModelInterface, MemoModelIterface, HeartModelInterface {
    @Override
    public void initialize() {

    }

    @Override
    public void on() {

    }

    @Override
    public void off() {

    }

    @Override
    public void setBPM(int bpm) {

    }

    @Override
    public int getBPM() {
        return 0;
    }

    @Override
    public int getHeartRate() {
        return 0;
    }

    @Override
    public void registerObserver(BeatObserver o) {

    }

    @Override
    public void removeObserver(BeatObserver o) {

    }

    @Override
    public void registerObserver(BPMObserver o) {

    }

    @Override
    public void removeObserver(BPMObserver o) {

    }

    @Override
    public int getDificultad() {
        return 0;
    }

    @Override
    public void registerObserver(DificultadObserverInterface o) {

    }

    @Override
    public void unregisterObserver(DificultadObserverInterface o) {

    }

    @Override
    public String getNextSecuence() {
        return null;
    }

    @Override
    public void setDificultad(int dificultad) {

    }

    @Override
    public int getDuracion(int dificultad) {
        return 0;
    }

    @Override
    public String getNombre(int dificultad){
        return "";
    }

    abstract public void clearObservers();
}
