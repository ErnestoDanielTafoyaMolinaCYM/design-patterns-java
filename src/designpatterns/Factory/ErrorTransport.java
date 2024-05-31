package designpatterns.Factory;

import designpatterns.Interfaces.ITransport;


public class ErrorTransport implements ITransport {
    private String _type;
    public ErrorTransport(String type){
        _type = type;
    }

    @Override
    public void deliver() {
        System.out.println("No se ha implementado el tipo de transporte: "+_type);
    }
    
}
