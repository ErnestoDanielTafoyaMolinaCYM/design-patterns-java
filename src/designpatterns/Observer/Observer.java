package designpatterns.Observer;

import java.util.function.Consumer;


public class Observer<T> implements IObserver<T> {
    
    private Consumer<T> fn;

    public Observer(Consumer fn){
        this.fn = fn;
    }
    
    @Override
    public void update(Object value) {
        fn.accept((T) value);
    }
}
