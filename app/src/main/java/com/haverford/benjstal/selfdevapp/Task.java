package com.haverford.benjstal.selfdevapp;

public class Task {
    String id;
    String title;
    int xpboost;
    char category;
    String description;
    char difficulty;
    String shortdes;
    String tips;


    public Task() {

    }

    public Task(String id, String tit, char cat, int xp, String des, String shrt, char dif, String tip) {
        this.id = id;
        this.title = tit;
        this.category = cat;
        this.xpboost = xp;
        this.shortdes = shrt;
        this.description = des;
        this.difficulty = dif;
        this.tips = tip;

    }
}
