package org.demointernetshop.services.fileService.fileReadAndWriteExample.FileReaderWriter;

import java.util.Calendar;

public class Match {
    private Calendar date;
    private String team1;
    private String result;
    private String team2;
    private String watchers;
    private String stadium;

    public Match(Calendar date, String team1, String result, String team2, String watchers, String stadium) {
        this.date = date;
        this.team1 = team1;
        this.result = result;
        this.team2 = team2;
        this.watchers = watchers;
        this.stadium = stadium;
    }

    public Calendar getDate() {
        return date;
    }

    public String getTeam1() {
        return team1;
    }

    public String getResult() {
        return result;
    }

    public String getTeam2() {
        return team2;
    }

    public String getWatchers() {
        return watchers;
    }

    public String getStadium() {
        return stadium;
    }

    @Override
    public String toString() {
        return date.get(Calendar.YEAR) + "-" + date.get(Calendar.MONTH) + "-" + date.get(Calendar.DATE) + " " + team1 + " " + getResult()  + " " + team2 + " " + getWatchers();

    }
}
