package com.stackroute.domain;

public class Movie {
    Actor actor;
    public Actor getActor() {
        return actor;
    }
    public void setActor(Actor actor) {
        this.actor = actor;
    }
    @Override
    public String toString() {
        return "Movie{" +
                "actor=" + actor +
                '}';
    }
    public Movie() {
    }
    public Movie(Actor actor) {
        this.actor = actor;
    }
}
