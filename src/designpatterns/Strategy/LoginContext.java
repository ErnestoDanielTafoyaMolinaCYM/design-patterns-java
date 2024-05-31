package designpatterns.Strategy;


public final class LoginContext {
    private IStrategy strategy;
    
    public LoginContext(IStrategy strategy){
        this.setStrategy(strategy);
    }
    public void setStrategy(IStrategy strategy){
        this.strategy = strategy;
    }
    
    public boolean login(String user, String password){
        return this.strategy.login(user, password);
    }
}
