package activeobject.impl;

import activeobject.Observer;
import activeobject.Subject;

import java.util.List;
import java.util.Set;
import java.util.logging.Level;
import java.util.logging.Logger;

public class DiffusionAtomique implements Observer {

    private Integer value = 0;
    private CapteurImpl capteur;
    Set<Observer> semaphores;
    List<Observer> canaux;

    /**
     * Notifie tout les observeurs
     * @param s
     */
    @Override
    public void update(Subject s) {
        int i = 1;
        for (Observer observer : canaux) {
            observer.update((Subject) this.capteur);
            Logger.getGlobal().log(Level.OFF, "Je vous informe que le canal" + i + " à été notifié");
            i++;
        }
    }
}
