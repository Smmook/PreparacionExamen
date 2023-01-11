package observer;

import java.util.ArrayList;
import java.util.List;

public class Subject {
    private List<Observer> observers;
    private int value = 0;

    public Subject() {
        observers = new ArrayList<>();
    }

    public void suscribe(final Observer observer) {
        if (!observers.contains(observer)) {
            observers.add(observer);
        }
    }

    public void suscribe(final List<Observer> observerList) {
        observers.forEach(o -> {
            if (!observers.contains(o)) {
                observers.add(o);
            }
        });
    }

    public void changeData(int value) {
        this.value = value;
        observers.forEach(Observer::update); // Lo mismo que observers.forEach(e -> e.update());
    }

    public int getValue() {
        return value;
    }
}
