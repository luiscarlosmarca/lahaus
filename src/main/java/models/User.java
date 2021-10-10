package models;

import models.builder.UserBuilder;

public class User {

    private String name;
    private String job;

    public User(UserBuilder builder) {
        this.name = builder.getNameBuilder();
        this.job = builder.getJobBuilder();
    }

    public String getName() {
        return name;
    }

    public String getJob() {
        return job;
    }
}
