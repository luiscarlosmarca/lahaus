package models.builder;

import javafx.util.Builder;
import models.User;

import static util.GenerateDataFake.generateTo;

public class UserBuilder implements Builder<User> {

    private String nameBuilder;
    private String jobBuilder;

    public UserBuilder basic(){
        this.nameBuilder =generateTo().aName();
        this.jobBuilder =generateTo().ajob();
        return this;
    }

    public String getNameBuilder() {
        return nameBuilder;
    }

    public String getJobBuilder() {
        return jobBuilder;
    }

    public static UserBuilder aNewUser() {
        return new UserBuilder();
    }
    @Override
    public User build(){
        return new User(this);
    }
}
