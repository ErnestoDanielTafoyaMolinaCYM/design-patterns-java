package designpatterns.Factory;

import designpatterns.Interfaces.ITransport;


public class WaterTransport implements ITransport {
    @Override
    public void deliver(){
        System.out.println("Entregando producto por el awa");
    }
}
