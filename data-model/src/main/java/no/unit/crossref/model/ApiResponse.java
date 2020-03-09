package no.unit.crossref.model;

import com.fasterxml.jackson.annotation.JsonProperty;

public class ApiResponse {
    @JsonProperty("status")
    private String status;
    @JsonProperty("message-type")
    private String messageType;
    @JsonProperty("message-version")
    private String messageVersion;
    @JsonProperty("message")
    private Message message;

    public String getStatus() {
        return status;
    }

    public void setStatus(String input) {
        this.status = input;
    }

    public String getMessageType() {
        return messageType;
    }

    public void setMessageType(String input) {
        this.messageType = input;
    }

    public String getMessageVersion() {
        return messageVersion;
    }

    public void setMessageVersion(String input) {
        this.messageVersion = input;
    }

    public Message getMessage() {
        return message;
    }

    public void setMessage(Message input) {
        this.message = input;
    }
}

