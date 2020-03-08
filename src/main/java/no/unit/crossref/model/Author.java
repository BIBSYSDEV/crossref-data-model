package no.unit.crossref.model;

import com.fasterxml.jackson.annotation.JsonProperty;

import java.util.List;

public class Author {

    @JsonProperty("given")
    private String givenName;
    @JsonProperty("family")
    private String familyName;
    @JsonProperty("sequence")
    private String sequence;
    @JsonProperty("affiliation")
    private List<String> affiliation;

    public String getGivenName() {
        return givenName;
    }

    public void setGivenName(String givenName) {
        this.givenName = givenName;
    }

    public String getFamilyName() {
        return familyName;
    }

    public void setFamilyName(String familyName) {
        this.familyName = familyName;
    }

    public String getSequence() {
        return sequence;
    }

    public void setSequence(String sequence) {
        this.sequence = sequence;
    }

    public List<String> getAffiliation() {
        return affiliation;
    }

    public void setAffiliation(List<String> affiliation) {
        this.affiliation = affiliation;
    }
}
