package com.example.shopsmart.model;

import java.util.Objects;

public class Unit {
    private Integer amount;
    private String name;

    public Integer getAmount() {
        return amount;
    }

    public void setAmount(Integer amount) {
        this.amount = amount;
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
        Unit unit = (Unit) o;
        return Objects.equals(amount, unit.amount) &&
                Objects.equals(name, unit.name);
    }

    @Override
    public int hashCode() {
        return Objects.hash(amount, name);
    }
}
