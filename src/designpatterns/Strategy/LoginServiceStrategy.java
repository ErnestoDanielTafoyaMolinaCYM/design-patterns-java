package designpatterns.Strategy;


public class LoginServiceStrategy implements IStrategy {

    @Override
    public boolean login(String user, String password) {
        
        if( user == "mongo" && password == "1234" ){
            System.out.println("entrando a la base de datos en monogo");
            return true;
        }
        System.out.println("login incorrecto");
        return false;
    }
    
}
