package com.sparta.webSpring.prac;

public class Tutor {
    private String name;
    private String bio;

    public String getName() {
        return this.name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getBio() {
        return this.bio;
    }

    public void setBio(String bio) {
        this.bio = bio;
    }

    public Tutor() {
    }

    public Tutor(String name, String bio) {
        this.name = name;
        this.bio = bio;
    }
}

