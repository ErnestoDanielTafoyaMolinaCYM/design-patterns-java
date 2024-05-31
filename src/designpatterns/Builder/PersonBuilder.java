package designpatterns.Builder;


public interface PersonBuilder {
    PersonBuilder setName(String name);
    PersonBuilder setLastName(String lastName);
    PersonBuilder setAge(int age);
    PersonBuilder setCountry(String country);
    PersonBuilder setCity(String city);
    PersonBuilder addHobbie(String hobby);
    Person build();
}
