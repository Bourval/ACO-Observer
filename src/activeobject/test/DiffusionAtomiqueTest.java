import activeobject.impl.Afficheur;
import activeobject.impl.Canal;
import activeobject.impl.CapteurImpl;
import activeobject.impl.StrategyDiffusion;

class DiffusionAtomiqueTest {

    @org.junit.jupiter.api.Test
    public void test1() {
        CapteurImpl capteur = new CapteurImpl("capteur A", StrategyDiffusion.Atomique);

        Canal canal1 = new Canal("canal1", capteur);
        Afficheur afficheur1 = new Afficheur("afficheur1 ", canal1);
        Canal canal2 = new Canal("canal2", capteur);
        Afficheur afficheur2 = new Afficheur("afficheur2 ", canal2);
        Canal canal3 = new Canal("canal3", capteur);
        Afficheur afficheur3 = new Afficheur("afficheur3 ", canal3);
    }
}