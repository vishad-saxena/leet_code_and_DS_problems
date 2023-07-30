package observerdesignpattern.observable.impl;

import observerdesignpattern.observable.ObservableInterface;
import observerdesignpattern.observer.ObserverInterface;

import java.util.ArrayList;
import java.util.List;

public class NotifyInAppObservable implements ObservableInterface {
    List<ObserverInterface> list=new ArrayList<>();
    int stock=0;

    @Override
    public void add(ObserverInterface observer) {
        list.add(observer);
    }

    @Override
    public void remove(ObservableInterface observer) {
        list.remove(observer);
    }

    @Override
    public void notifyObservers() {
        for (ObserverInterface observer:list) {
            observer.update();
        }
    }

    @Override
    public int getData() {
        return stock;
    }

    @Override
    public void setData(int num) {
        notifyObservers();
        this.stock = num;
    }
}
