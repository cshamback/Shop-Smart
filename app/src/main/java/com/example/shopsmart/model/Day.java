package com.example.shopsmart.model;

import com.example.shopsmart.model.interfaces.AggregateCost;

import java.util.HashSet;
import java.util.Set;

public class Day extends AggregateCost<Meal>{
    private String name;

    public Day() {
        super(new HashSet<>());
    }

    public Day(String name) {
        super(new HashSet<>());
        this.name = name;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public Set<Meal> getMeals() {
        return (Set<Meal>) items;
    }


}
