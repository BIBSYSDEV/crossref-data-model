package no.unit.crossref.model;

import com.fasterxml.jackson.annotation.JsonProperty;

import java.util.List;

public class Relation {
    @JsonProperty("cites")
    private List<String> cites;
}
