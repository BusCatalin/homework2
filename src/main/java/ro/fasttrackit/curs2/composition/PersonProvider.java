package ro.fasttrackit.curs2.composition;

import ro.fasttrackit.curs2.Person;

import java.io.IOException;
import java.util.List;

public interface PersonProvider {
    List<Person> readPeople() throws IOException;
}
