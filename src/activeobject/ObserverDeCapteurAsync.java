package activeobject;

import java.util.concurrent.Future;

public interface ObserverDeCapteurAsync {

    Future<Integer> getValue(Observer o);

}