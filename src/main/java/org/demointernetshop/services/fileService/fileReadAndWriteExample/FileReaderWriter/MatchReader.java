package org.demointernetshop.services.fileService.fileReadAndWriteExample.FileReaderWriter;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;
import java.util.Calendar;
import java.util.GregorianCalendar;
import java.util.LinkedList;
import java.util.List;


public class MatchReader {
    public static void main(String[] args) throws IOException {
        BufferedReader reader = new BufferedReader(new FileReader("matches.txt"));

        String line = "";

        List<Match> matches = new LinkedList<>();

        while ((line = reader.readLine()) != null) {

            Match newMatchInfo = getNewMatchInfo(line);
            matches.add(newMatchInfo);
        }

        System.out.println("==============");

        matches.stream().forEach(System.out::println);
        System.out.println(matches.stream().count());

    }

    private static Match getNewMatchInfo(String line){


        String[] lineParsed = line.split(", ");

        Calendar date = new GregorianCalendar(
                Integer.parseInt(lineParsed[0]),
                Integer.parseInt(lineParsed[1]),
                Integer.parseInt(lineParsed[2]));

        String team1 = lineParsed[3];
        String result = lineParsed[4];
        String team2 = lineParsed[5];
        String watchers = lineParsed[6];
        String stadium = lineParsed[7];

        return new Match(date, team1,result,team2,watchers,stadium);
    }
}
