package designpatterns;

import designpatterns.Builder.NormalPersonBuilder;
import designpatterns.Builder.Person;
import designpatterns.Builder.PersonDirector;
import designpatterns.Decorator.CommercialInfoProductDecorator;
import designpatterns.Decorator.HTMLProductDecorator;
import designpatterns.Decorator.ProductComponent;
import designpatterns.Decorator.StoreProductDecorator;
import designpatterns.Observer.IObserver;
import designpatterns.Observer.ISubject;
import designpatterns.Observer.Observer;
import designpatterns.Observer.Subject;



public class DesignPatterns {
    

    public static void main(String[] args) {
        builder();

    }
    
    public static void builder(){
        
        final NormalPersonBuilder personBuilder = new NormalPersonBuilder();
        final Person daniel = personBuilder
                                     .setName("Daniel")
                                     .setLastName("Molina")
                                     .addHobbie("Comer")
                                     .addHobbie("Jugar")
                                     .build();
        System.out.println(daniel.getFullName());
        
        final Person juan = personBuilder
                                     .setName("Juan")
                                     .setLastName("Perez")
                                     .build();
        System.out.println(juan.toString());
        
        //creación con director
        final PersonDirector director = new PersonDirector(personBuilder);
        director.createSimplePerson("Jhon", "Cena");
        Person JhonCena = personBuilder.build();
        System.out.println(JhonCena.getFullName());
        
    }
    
    public static void observable(){
        
        final ISubject<Number> subject = new Subject<>();
        final IObserver<Number> obs1 = new Observer<>((n)->{
             System.out.println(n);
        });
        
        subject.subscribe(obs1);
        subject.notify(20);
        subject.notify(10);
        subject.notify(150);
        
        final ISubject<String> subject2 = new Subject<>(); 
        final IObserver<String> obs2 = new Observer<>((s)->{
            System.out.println(s.toString().toUpperCase());
        });
        final IObserver<String> obs3 = new Observer<>((s)->{
            System.out.println(s.toString().toLowerCase());
        });
        
        subject2.subscribe(obs2);
        subject2.subscribe(obs3);
        
        subject2.notify("EsTe MeNsAjE sE vE hOrRiBlE");
    }
    public static void decorator(){
        final ProductComponent cerveza = new ProductComponent("Cerveza");
        System.out.println( cerveza.getDetail() );
        
        final CommercialInfoProductDecorator cervezaInfo = new CommercialInfoProductDecorator(cerveza, "London Porter", "Fuller's");
        System.out.println( cervezaInfo.getDetail() );
        
        final StoreProductDecorator cervezaInfoStore = new StoreProductDecorator(cervezaInfo, 10);
        System.out.println(cervezaInfoStore.getDetail());
        
        final HTMLProductDecorator cervezaHTML = new HTMLProductDecorator(cervezaInfoStore);
        System.out.println(cervezaHTML.getDetail());
        
        final ProductComponent refresco = new ProductComponent("Doctor Peper");
        System.out.println(refresco.getDetail());
        
        final HTMLProductDecorator refrescoHTML = new HTMLProductDecorator(refresco);
        System.out.println(refrescoHTML.getDetail());}
}
