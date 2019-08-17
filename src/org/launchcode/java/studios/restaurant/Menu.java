package org.launchcode.java.studios.restaurant;

import java.util.ArrayList;
import java.util.Date;


public class Menu {
    private String name;
    private ArrayList category;
    private Date lastUpdated;

    public Menu() {
    }

    public Menu(String name, ArrayList category, Date lastUpdated){
        this.name = name;
        this.category = category;
        this.lastUpdated = lastUpdated;
    }

    public String getName() {
        return name;
    }
    public ArrayList getCategory() {
        return category;
    }
    public Date getLastUpdated() {
        return lastUpdated;
    }




}
