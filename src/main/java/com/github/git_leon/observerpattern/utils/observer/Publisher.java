package com.github.git_leon.observerpattern.utils.observer;

/**
 * @author leon on 5/8/18.
 */
public abstract class Publisher<
        SomeUpdate extends Update,
        SomeObserver extends Observer<SomeUpdate>>
        implements Observer<SomeUpdate> {

    private final Observable<SomeObserver> observable;

    public Publisher(Observable<SomeObserver> observable) {
        this.observable = observable;
    }

    @Override
    public final void update(SomeUpdate update) {
        update.execute();
    }

    abstract public void update();
}