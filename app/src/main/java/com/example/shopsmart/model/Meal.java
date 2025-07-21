package com.example.shopsmart.model;

import com.example.shopsmart.model.interfaces.AggregateCost;

import java.util.ArrayList;
import java.util.List;
import java.util.Objects;

public class Meal extends AggregateCost<Item> {

   private String name;

   public Meal() {
       super(new ArrayList<>());
   }

   public Meal(String name) {
       super(new ArrayList<>());
       this.name = name;
   }

    public List<Item> getItems() {
        return (List<Item>) items;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    @Override
    public boolean equals(Object o) {
        if (o == null || getClass() != o.getClass()) return false;
        Meal meal = (Meal) o;
        return Objects.equals(items, meal.items) &&
                Objects.equals(name, meal.name);
    }

    @Override
    public int hashCode() {
        return Objects.hash(items, name);
    }
}
