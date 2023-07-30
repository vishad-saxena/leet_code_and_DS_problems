package observerdesignpattern.observer.impl;

import observerdesignpattern.observable.ObservableInterface;
import observerdesignpattern.observer.ObserverInterface;

public class NotifyMeStockObserver implements ObserverInterface {
    ObservableInterface observable;

    public NotifyMeStockObserver(ObservableInterface observable) {
        this.observable = observable;
    }

    @Override
    public void update() {
        int stockCount=observable.getData();
        System.out.println("NotifyMe stockObserver "+stockCount);
    }
}
