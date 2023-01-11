package observer;

public class ValueLoweredObserver extends Observer {
    private int preValue;

    public ValueLoweredObserver(final Subject subject) {
        super(subject);
        preValue = subject.getValue();
    }

    @Override
    public void update() {
        if (subject.getValue() < preValue) {
            System.out.println("Value lowered observer: " + subject.getValue());
        }
        preValue = subject.getValue();
    }
}
