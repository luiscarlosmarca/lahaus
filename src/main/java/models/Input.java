package models;

import models.builder.InputBuilder;

public class Input {

    private String from;
    private String to;
    private String externalId;

    public Input(InputBuilder builder) {
        this.from = builder.getFromBuilder();
        this.to = builder.getToBuilder();
    }

    public String getFrom() {
        return from;
    }

    public String getExternalId() {
        return externalId;
    }

    public String getTo() {
        return to;
    }

}
