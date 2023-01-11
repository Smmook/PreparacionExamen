package observer;

import java.util.ArrayList;
import java.util.List;

public class DemoObserver {
    public static void main(String[] args) {
        Subject subject = new Subject();
        List<Observer> observers = new ArrayList<>(List.of(new ConcreteValueObserver(subject), new ValueLoweredObserver(subject), new ByTenChangedObserver(subject)));
        subject.suscribe(observers);
        subject.changeData(-50);
    }
}
