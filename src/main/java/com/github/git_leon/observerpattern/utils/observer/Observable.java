package com.github.git_leon.observerpattern.utils.observer;

/**
 * @author leon on 5/8/18.
 */
public interface Observable<SomeObserver extends Observer> {
    void registerObserver(SomeObserver observer);
    void removeObserver(SomeObserver observer);
    void notifyObserver(SomeObserver observer);
    void notifyObservers();
    Observer[] getObservers();
}
