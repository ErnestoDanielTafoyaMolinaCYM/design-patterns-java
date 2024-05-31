package designpatterns.Observer;


public interface ISubject<T> {
    void subscribe(IObserver<T> observer);
    void unsubscribe(IObserver<T> observer);
    void notify(T value);
};