package designpatterns.Decorator;


public class HTMLProductDecorator extends ProductDecorator{

    public HTMLProductDecorator(IComponent component) {
        super(component);
    }
    @Override
    public String getDetail(){
        return 
                "<h1>Informacion del producto</h1>"
                + "<p>"
                + super.getDetail()
                + "</p>"
                ;
    }
    
}
