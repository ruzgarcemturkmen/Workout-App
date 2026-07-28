package com.example.workoutapp.Domain;

import java.io.Serializable;
import java.util.ArrayList;

public class Workout implements Serializable {
    private  String title;
    private  String duraction;
    private String picPath;
    private int kcal;
    private String duractionAll;
    private ArrayList<Lession> lessions;

    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public String getDuraction() {
        return duraction;
    }

    public void setDuraction(String duraction) {
        this.duraction = duraction;
    }

    public String getPicPath() {
        return picPath;
    }

    public void setPicPath(String picPath) {
        this.picPath = picPath;
    }

    public int getKcal() {
        return kcal;
    }

    public void setKcal(int kcal) {
        this.kcal = kcal;
    }

    public String getDuractionAll() {
        return duractionAll;
    }

    public void setDuractionAll(String duractionAll) {
        this.duractionAll = duractionAll;
    }

    public ArrayList<Lession> getLessions() {
        return lessions;
    }

    public void setLessions(ArrayList<Lession> lessions) {
        this.lessions = lessions;
    }

    public Workout(String title, String duraction, String picPath, int kcal, String duractionAll, ArrayList<Lession> lessions) {
        this.title = title;
        this.duraction = duraction;
        this.picPath = picPath;
        this.kcal = kcal;
        this.duractionAll = duractionAll;
        this.lessions = lessions;
    }
}
