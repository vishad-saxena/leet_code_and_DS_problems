package observerdesignpattern.observable;

import observerdesignpattern.observer.ObserverInterface;

public interface ObservableInterface {
    public void add(ObserverInterface observer);
    public void remove(ObservableInterface observer);
    public void notifyObservers();
    int getData();
    void setData(int num);
}
