package observer;

public class ByTenChangedObserver extends Observer {
    private int preValue;

    public ByTenChangedObserver(final Subject subject) {
        super(subject);
        preValue = subject.getValue();
    }

    @Override
    public void update() {
        if (Math.abs(subject.getValue() - preValue) > 10) {
            System.out.println("By Ten Changed observer: " + subject.getValue());
        }
        preValue = subject.getValue();
    }
}
