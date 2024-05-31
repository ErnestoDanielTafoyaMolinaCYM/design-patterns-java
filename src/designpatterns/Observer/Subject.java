package designpatterns.Observer;

import java.util.ArrayList;
import java.util.List;

public class Subject<T> implements ISubject<T> {
    
    private List<IObserver<T>> observers;

    public Subject(){
        this.observers = new ArrayList<>();
    }
    @Override
    public void subscribe(IObserver<T> observer) {
        this.observers.add(observer);
    }

    @Override
    public void unsubscribe(IObserver<T> observer) {
        this.observers.remove(observer);
    }

    @Override
    public void notify(T value) {
        this.observers.stream().forEach(observer->{
            observer.update(value);
        });
    }
    
}
