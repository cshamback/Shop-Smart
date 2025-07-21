package com.example.shopsmart.model;

import android.graphics.Color;

import com.example.shopsmart.model.interfaces.Costable;

import java.util.Objects;

public class Item implements Costable {
    private String name;
    private Double price;
    private String location;

    private Unit unit;

    private Color color;

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public Double getPrice() {
        return price;
    }

    public void setPrice(Double price) {
        this.price = price;
    }

    public String getLocation() {
        return location;
    }

    public void setLocation(String location) {
        this.location = location;
    }

    public Unit getUnit() {
        return unit;
    }

    public void setUnit(Unit unit) {
        this.unit = unit;
    }

    public Color getColor() {
        return color;
    }

    public void setColor(Color color) {
        this.color = color;
    }

    @Override
    public boolean equals(Object o) {
        if (o == null || getClass() != o.getClass()) return false;
        Item item = (Item) o;
        return Objects.equals(name, item.name) &&
                Objects.equals(price, item.price) &&
                Objects.equals(location, item.location) &&
                Objects.equals(unit, item.unit) &&
                Objects.equals(color, item.color);
    }

    @Override
    public int hashCode() {
        return Objects.hash(name, price, location, unit, color);
    }

    @Override
    public Double getCost() {
       return price;
    }
}
