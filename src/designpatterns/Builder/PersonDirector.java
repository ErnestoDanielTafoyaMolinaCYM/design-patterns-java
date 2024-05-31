package designpatterns.Builder;


public class PersonDirector {
    private PersonBuilder personBuilder;

    public PersonDirector(PersonBuilder personBuilder) {
        this.personBuilder = personBuilder;
    }
    
    public void setPersonBuilder(PersonBuilder personBuilder){
        this.personBuilder = personBuilder;
    }
    
    public void createSimplePerson(String name, String lastname){
        this.personBuilder.setName(name).setLastName(lastname);
    }
}
