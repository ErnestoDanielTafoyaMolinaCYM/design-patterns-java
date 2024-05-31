package designpatterns.Decorator;


public class StoreProductDecorator extends ProductDecorator {

    private final Number _price;
    
    public StoreProductDecorator(IComponent component, Number price) {
        super(component);
        _price = price;
    }
    
    @Override
    public String getDetail(){
        String price = _price.toString();
        
        return  super.getDetail() + " " +price;
    }
    
}
