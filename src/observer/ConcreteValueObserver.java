package observer;

public class ConcreteValueObserver extends Observer {

    public ConcreteValueObserver(final Subject subject) {
        super(subject);
    }

    @Override
    public void update() {
        System.out.println("Concrete value observer: " + subject.getValue());
    }
}
