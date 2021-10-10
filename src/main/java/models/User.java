package models;

import models.builder.UserBuilder;

public class User {

    private String name;
    private String job;
    private String id;

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

    public void setId(String id) {
        this.id = id;
    }

    public void setName(String name) {
        this.name = name;
    }

    public void setJob(String job) {
        this.job = job;
    }

    public String getId() {
        return id;
    }
}
