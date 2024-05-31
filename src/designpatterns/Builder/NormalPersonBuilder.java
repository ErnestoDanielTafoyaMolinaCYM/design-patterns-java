package designpatterns.Builder;

import java.util.ArrayList;
import java.util.List;


public class NormalPersonBuilder implements PersonBuilder{
    private String name;
    private String lastName;
    private Number age;
    private String country;
    private String city;
    private List<String> hobbies;
    
    public NormalPersonBuilder(){
        this.name = "";
        this.lastName = "";
        this.age = null;
        this.country = "";
        this.city = "";
        this.hobbies = new ArrayList<>();
    }
    
    public void reset(){
        this.name = "";
        this.lastName = "";
        this.age = null;
        this.country = "";
        this.city = "";
        this.hobbies = new ArrayList<>();
    }

    @Override
    public PersonBuilder setName(String name) {
        this.name = name;
        return this;
    }

    @Override
    public PersonBuilder setLastName(String lastName) {
        this.lastName = lastName;
        return this;
    }

    @Override
    public PersonBuilder setAge(int age) {
        this.age = age;
        return this;
    }

    @Override
    public PersonBuilder setCountry(String country) {
        this.country = country;
        return this;
    }

    @Override
    public PersonBuilder setCity(String city) {
        this.city = city;
        return this;
    }

    @Override
    public PersonBuilder addHobbie(String hobby) {
        this.hobbies.add(hobby);
        return this;
    }

    @Override
    public Person build() {
        final Person person = new Person(
            this.name,
            this.lastName,
            this.age, 
            this.country,
            this.city,
            this.hobbies
        );
        this.reset();
        return person;
    }
}
