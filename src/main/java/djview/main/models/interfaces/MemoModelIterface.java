package main.models.interfaces;

import main.interfaces.DificultadObserverInterface;

/**
 * Created by ignacio on 11/06/16.
 */
public interface MemoModelIterface {

     int getDificultad();

     void registerObserver(DificultadObserverInterface o);

     void unregisterObserver(DificultadObserverInterface o);

     String getNextSecuence();

     void setDificultad(int dificultad);

     int getDuracion(int dificultad);

     String getNombre(int dificultad);

}
