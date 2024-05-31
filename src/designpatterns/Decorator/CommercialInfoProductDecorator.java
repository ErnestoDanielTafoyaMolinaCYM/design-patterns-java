package designpatterns.Decorator;


public class CommercialInfoProductDecorator extends ProductDecorator {
    private final String _tradename;
    private final String _brand;

    public CommercialInfoProductDecorator(IComponent component, String tradename, String brand) {
        super(component);
        
        _tradename = tradename;
        _brand = brand;
    }
    
    @Override
    public String getDetail(){
        return _tradename + " " +_brand + "  " + super.getDetail();
    }
}
