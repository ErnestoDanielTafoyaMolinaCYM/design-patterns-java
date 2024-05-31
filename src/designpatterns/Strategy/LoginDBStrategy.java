package designpatterns.Strategy;

public class LoginDBStrategy implements IStrategy{

    @Override
    public boolean login(String user, String password) {
        
        if( user == "admin" && password == "1234" ){
            System.out.println("entrando a la base de datos mysql");
            return true;
        }
        System.out.println("login incorrecto");
        return false;
    }
    
}
