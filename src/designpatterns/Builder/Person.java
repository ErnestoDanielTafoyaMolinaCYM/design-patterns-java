package designpatterns.Builder;

import java.util.List;

public class Person {
    private final String name;
    private final String lastName;
    private final Number age;
    private final String country;
    private final String city;
    private final List<String> hobbies;
    
    public Person(String name, String lastName, Number age, String country, String city, List<String> hobbies) {
        this.name = name;
        this.lastName = lastName;
        this.age = age;
        this.country = country;
        this.city = city;
        this.hobbies = hobbies;
    }
    
    public String getFullName(){
        return 
                this.name 
               +" "
               +this.lastName;
    }
}
