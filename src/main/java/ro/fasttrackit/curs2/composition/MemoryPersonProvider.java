package ro.fasttrackit.curs2.composition;

import ro.fasttrackit.curs2.Person;

import java.util.List;

public class MemoryPersonProvider implements PersonProvider{
    @Override
    public List<Person> readPeople() {
        return List.of(
                new Person("Smith","John",35),
                new Person("Moe","Sally",23),
                new Person("Joestar","Joseph",50)
        );
    }
}
