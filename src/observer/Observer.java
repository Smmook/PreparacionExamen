package observer;

public abstract class Observer {
    protected Subject subject;

    public Observer(final Subject subject) {
        this.subject = subject;
        subject.suscribe(this);
    }

    public abstract void update();
}
