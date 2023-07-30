package observerdesignpattern;

import observerdesignpattern.observable.ObservableInterface;
import observerdesignpattern.observable.impl.NotifyInAppObservable;
import observerdesignpattern.observer.ObserverInterface;
import observerdesignpattern.observer.impl.NotifyMeStockObserver;
import observerdesignpattern.observer.impl.NotifyOverEmailObserver;

public class MainMethodClass {
    public static void main(String[] args) {
        ObservableInterface observableInterface=new NotifyInAppObservable();
        ObserverInterface notifyMeObserver =new NotifyMeStockObserver(observableInterface);
        ObserverInterface emailObserver=new NotifyOverEmailObserver(observableInterface);
        observableInterface.add(notifyMeObserver);
        observableInterface.add(emailObserver);
        observableInterface.setData(10);
        observableInterface.setData(10);

    }
}
