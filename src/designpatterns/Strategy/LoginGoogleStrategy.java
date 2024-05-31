package designpatterns.Strategy;

public class LoginGoogleStrategy implements  IStrategy {
    
    @Override
    public boolean login(String user, String password) {
        
        if( user == "google" && password == "1234" ){
            System.out.println("entrando a la base de datos de google");
            return true;
        }
        System.out.println("login incorrecto");
        return false;
    }
}
