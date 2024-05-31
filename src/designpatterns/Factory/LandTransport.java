package designpatterns.Factory;

import designpatterns.Interfaces.ITransport;

public class LandTransport implements ITransport {
    
    @Override
    public void deliver(){
        System.out.println("Entregando producto por carretera");
    }
}
