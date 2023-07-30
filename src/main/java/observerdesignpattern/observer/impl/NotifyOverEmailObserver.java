package observerdesignpattern.observer.impl;

import observerdesignpattern.observable.ObservableInterface;
import observerdesignpattern.observer.ObserverInterface;

public class NotifyOverEmailObserver implements ObserverInterface {
    ObservableInterface observableInterface;

    public NotifyOverEmailObserver(ObservableInterface observableInterface) {
        this.observableInterface = observableInterface;
    }

    @Override
    public void update() {
       int data= observableInterface.getData();
        System.out.println("NotifyEmail "+data);
    }
}
