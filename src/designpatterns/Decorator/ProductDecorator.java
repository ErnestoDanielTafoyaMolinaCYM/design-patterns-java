package designpatterns.Decorator;


public abstract class ProductDecorator implements IComponent {
    protected IComponent component;
    
    public ProductDecorator(IComponent component){
        this.component = component;
    }
    @Override
    public String getDetail(){
        return this.component.getDetail();
    }
    
}
