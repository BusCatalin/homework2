package ro.fasttrackit.curs2.composition;

import lombok.RequiredArgsConstructor;
import ro.fasttrackit.curs2.Person;

import java.io.BufferedWriter;
import java.io.FileWriter;
import java.io.IOException;
import java.util.List;
@RequiredArgsConstructor
public class PersonReportGenerator {

    private final PersonProvider personProvider;

    public void generatePersons(String outputFile) throws IOException{
        List<Person> people = personProvider.readPeople();
        generatePersons(people, outputFile);
    }

    private void generatePersons(List<Person> people, String outputFile) throws IOException {
        try (BufferedWriter writer = new BufferedWriter(new FileWriter(outputFile))) {
            people.stream()
                    .map(person -> person.firstName() + " : " + person.lastName() + " : " + person.age())
                    .forEach(line -> writeLine(writer, line));
        }
    }

    private void writeLine(BufferedWriter writer, String line) {
        try {
            writer.write(line);
            writer.newLine();
        } catch (IOException e) {
            throw new RuntimeException(e);
        }
    }
}
