package com.github.git_leon.observerpattern.utils.observer;

import java.util.Vector;

/**
 * @author leon on 5/8/18.
 */
public abstract class Subject<
        SomeUpdate extends Update,
        SomeObserver extends Observer<SomeUpdate>>
        implements Observable<SomeObserver> {

    private Vector<SomeObserver> observers;

    public Subject() {
        this.observers = new Vector<>();
    }

    public final void registerObserver(SomeObserver observer) {
        observers.add(observer);
    }

    public final void removeObserver(SomeObserver observer) {
        observers.remove(observer);
    }

    public final void notifyObservers() {
        observers.parallelStream().forEach(observer -> notifyObserver(observer));
    }

    @Override
    public Observer[] getObservers() {
        return observers.stream().toArray(Observer[]::new);
    }

    abstract public void notifyObserver(SomeObserver observer);

}
