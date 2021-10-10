package models.builder;

import javafx.util.Builder;
import models.Input;

import static util.GenerateDataFake.generateTo;

public class InputBuilder implements Builder<Input> {

    private String fromBuilder;
    private String toBuilder;
    private String externalIdBuilder;

    public InputBuilder basic(){
        this.fromBuilder ="2021-08-09T00:00:00Z";
//        this.toBuilder = generateTo().aDate()+"+T00:00:00Z";
        return this;
    }

    public InputBuilder to(String toBuilder) {
        this.toBuilder = toBuilder;
        return this;

    }
    public InputBuilder externalId(String externalIdBuilder) {
        this.externalIdBuilder = externalIdBuilder;
        return this;

    }
    public InputBuilder from(String fromBuilder) {
        this.fromBuilder = fromBuilder;
        return this;

    }
    public String getFromBuilder() {
        return fromBuilder;
    }


    public String getToBuilder() {
        return toBuilder;
    }

    public String getExternalIdBuilder() {
        return externalIdBuilder;
    }

    public static InputBuilder aInput() {
        return new InputBuilder();
    }
    @Override
    public Input build(){
        return new Input(this);
    }
}
