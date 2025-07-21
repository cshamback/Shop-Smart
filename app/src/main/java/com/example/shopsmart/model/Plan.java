package com.example.shopsmart.model;

import com.example.shopsmart.model.interfaces.AggregateCost;

import java.util.HashSet;
import java.util.Set;

public class Plan extends AggregateCost<Day> {
    private String name;

    public Plan() {
        super(new HashSet<>());
    }

    public Plan(String name) {
        super(new HashSet<>());
        this.name = name;
    }

    public Set<Day> getDays() {
        return (Set<Day>) items;
    }
}
