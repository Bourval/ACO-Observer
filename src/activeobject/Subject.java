package activeobject;

public interface Subject<T> {

    void attach(Observer o);

    void detach(Observer o);

    public T getValue(Observer observer);
}