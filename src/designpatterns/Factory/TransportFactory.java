package designpatterns.Factory;

import designpatterns.Interfaces.ITransport;

public class TransportFactory {
    
    // Método que devuelve una instancia de un tipo de transporte basado en el tipo solicitado
    public ITransport createTransport(String type) {
        switch (type.toLowerCase()) {
            case "air":
                return new AirTransport();
            case "water":
                return new WaterTransport();
            case "land":
                return new LandTransport();
            default:
                return new ErrorTransport(type);
        }
    }
}
