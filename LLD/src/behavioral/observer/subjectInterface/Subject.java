package behavioral.observer.subjectInterface;

import behavioral.observer.observerInterface.Observer;

public interface Subject {

    void addObserver(Observer observer);
    void removeObserver(Observer observer);
    void notifyObservers();
}
