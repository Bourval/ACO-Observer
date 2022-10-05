package activeobject.impl;

import activeobject.*;

import java.util.concurrent.Future;

public class Canal implements ObserverDeCapteurAsync, SubjectAsync {

    private String nom;
    private Capteur capteur;

    public Canal(String canal, CapteurImpl capteur) {
        this.nom = canal;
        this.capteur = capteur;
    }

    @Override
    public void attach(Observer o) {

    }

    @Override
    public void detach(Observer o) {

    }

    @Override
    public Future<Integer> getValue(Observer o) {
        return null;
    }
}
