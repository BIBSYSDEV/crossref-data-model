package no.unit.crossref.model;

import com.fasterxml.jackson.annotation.JsonProperty;

import java.util.List;

public class CrossrefDate {
    @JsonProperty("date-parts")
    private int[][] dateParts;
    @JsonProperty("date-time")
    private String dateTime;
    @JsonProperty("timestamp")
    private double timestamp;

    public int[][] getDateParts() {
        return dateParts;
    }

    public void setDateParts(int[][] input) {
        this.dateParts = input;
    }

    public String getDateTime() {
        return dateTime;
    }

    public void setDateTime(String input) {
        this.dateTime = input;
    }

    public double getTimestamp() {
        return timestamp;
    }

    public void setTimestamp(double input) {
        this.timestamp = input;
    }
}
