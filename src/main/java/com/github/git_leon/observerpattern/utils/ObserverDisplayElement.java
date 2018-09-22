package com.github.git_leon.observerpattern.utils;

import com.github.git_leon.observerpattern.utils.observer.Observer;
import com.github.git_leon.observerpattern.utils.observer.Update;

/**
 * @author leon on 5/8/18.
 */
public abstract class ObserverDisplayElement implements Observer, DisplayElement {
    public void update(Update update) {
        update.execute();
    }
}
