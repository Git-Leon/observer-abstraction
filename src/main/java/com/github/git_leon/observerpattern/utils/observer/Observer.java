package com.github.git_leon.observerpattern.utils.observer;

/**
 * @author leon on 5/8/18.
 */
public interface Observer<SomeUpdate extends Update> {
    void update(SomeUpdate update);
}
