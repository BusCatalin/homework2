package ro.fasttrackit.curs2;

import java.io.IOException;

public class PersonMain {
    public static void main(String[] args) throws IOException {
       // var generator = new MemoryReportGenerator();
        var generator = new FileReportGenerator("people.txt");
        generator.generatePersons("output.txt");
    }
}
