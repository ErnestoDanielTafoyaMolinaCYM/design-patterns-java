package designpatterns;


public class Singleton {
    private static Singleton instance = null;
    public String _database;
    
    private  Singleton(String database){
        _database = database;
    }
    
    public static Singleton getInstance(String database){
        synchronized(Singleton.class){
            if( instance == null ){
                instance = new Singleton(database);
            }
        }
        return instance;
    }
}
 