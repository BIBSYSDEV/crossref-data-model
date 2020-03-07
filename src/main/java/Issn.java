import com.fasterxml.jackson.annotation.JsonProperty;

public class Issn {
    @JsonProperty("value")
    private String issn;
    @JsonProperty("type")
    private IssnType type;

    public String getIssn() {
        return issn;
    }

    public void setIssn(String issn) {
        this.issn = issn;
    }

    public IssnType getType() {
        return type;
    }

    public void setType(IssnType type) {
        this.type = type;
    }

    private enum IssnType {
        PRINT("print"),
        ELECTRONIC("electronic");

        private final String name;

        IssnType(String name) {
            this.name = name;
        }

        public String getName() {
            return name;
        }
    }
}
