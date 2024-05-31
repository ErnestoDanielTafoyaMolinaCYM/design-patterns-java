package designpatterns.Factory;

import designpatterns.Interfaces.ITransport;

public class AirTransport implements ITransport {
    @Override
    public void deliver(){
        System.out.println("Entregando bomba por aire");
    }
}
