package ro.fasttrackit.curs2.composition;

import java.io.IOException;

public class PeopleMain {
    public static void main(String[] args) throws IOException {
        new PersonReportGenerator(new MemoryPersonProvider()).generatePersons("output2.txt");
    }

    private static PersonProvider getPersonProvider(){
        return System.currentTimeMillis()%2==0
                ? new MemoryPersonProvider()
                : new FilePersonProvider("people.txt");
    }
}
