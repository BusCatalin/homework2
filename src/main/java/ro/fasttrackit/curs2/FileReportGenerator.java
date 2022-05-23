package ro.fasttrackit.curs2;

import lombok.RequiredArgsConstructor;

import javax.crypto.spec.PSource;
import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Path;
import java.util.List;
@RequiredArgsConstructor
public class FileReportGenerator extends PersonReportGenerator{
    private final String sourceFile;
    @Override
    List<Person> readPeople() throws IOException {
        return Files.lines(Path.of(sourceFile))
                .map(this :: toPerson)
                .toList();
    }

    private Person toPerson(String line){
        String[] tokens = line.split(",");
        String first = tokens[0];
        String last= tokens[1];
        int number= Integer.parseInt(tokens[2]);
        return new Person(first,last,number);
    }
}