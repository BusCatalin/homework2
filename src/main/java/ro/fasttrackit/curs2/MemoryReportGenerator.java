package ro.fasttrackit.curs2;

import java.util.List;

public class MemoryReportGenerator extends PersonReportGenerator{
    @Override
    List<Person> readPeople() {
        return List.of(
                new Person("Smith","John",35),
                new Person("Moe","Sally",23),
                new Person("Joestar","Joseph",50)
        );
    }
}
