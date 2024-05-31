package designpatterns.Decorator;

public class ProductComponent implements IComponent {

    protected String name;
    
    public ProductComponent( String name ){
        this.name = name;
    }
    @Override
    public String getDetail() {
        return this.name;
    }
    
}
