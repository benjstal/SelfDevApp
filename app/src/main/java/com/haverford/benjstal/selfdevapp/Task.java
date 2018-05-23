package com.haverford.benjstal.selfdevapp;

public class Task {
    String title;
    int xpboost;
    char category;
    String description;
    char difficulty;

    public Task() {

    }

    public Task(String tit, int xp, char cat, String des, char dif) {
        this.title = tit;
        this.xpboost = xp;
        this.category = cat;
        this.description = des;
        this.difficulty = dif;
    }
}

