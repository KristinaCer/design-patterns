package com.kristina.behaviuoral_patterns.observer;

public interface Subject {
    public void attach(Observer o);
    public void detach(Observer o);
    public void notifyUpdate(Message m);
}
