import com.fasterxml.jackson.annotation.JsonProperty;

import java.util.List;

public class CrossrefDate {
    @JsonProperty("date-parts")
    private List<DateParts> dateParts;
    @JsonProperty("date-time")
    private String dateTime;
    @JsonProperty("timestamp")
    private int timestamp;

    public List<DateParts>getDateParts() {
        return dateParts;
    }

    public void setDateParts(List<DateParts>input) {
        this.dateParts = input;
    }

    public String getDateTime() {
        return dateTime;
    }

    public void setDateTime(String input) {
        this.dateTime = input;
    }

    public int getTimestamp() {
        return timestamp;
    }

    public void setTimestamp(int input) {
        this.timestamp = input;
    }
}
