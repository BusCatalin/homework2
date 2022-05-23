package ro.fasttrackit.curs2.composition;

import lombok.RequiredArgsConstructor;
import ro.fasttrackit.curs2.Person;

import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Path;
import java.util.List;

@RequiredArgsConstructor
public class FilePersonProvider implements PersonProvider {
    private final String sourceFile;

    @Override
    public List<Person> readPeople() throws IOException {
        return Files.lines(Path.of(sourceFile))
                .map(this::toPerson)
                .toList();
    }

    private Person toPerson(String line) {
        String[] tokens = line.split(",");
        String first = tokens[0];
        String last = tokens[1];
        int number = Integer.parseInt(tokens[2]);
        return new Person(first, last, number);
    }
}
