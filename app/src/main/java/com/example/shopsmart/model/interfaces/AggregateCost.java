package com.example.shopsmart.model.interfaces;


import java.util.Collection;

/**
 * This class is a contract for objects that cost is aggregate of other objects costs.
 * A class
 * @param <T> this is some object
 */
public abstract class AggregateCost<T extends Costable> implements Costable{
    protected final Collection<T> items;
    protected Double totalCost;

    protected AggregateCost(Collection<T> items) {
        this.items = items;
    }

    public void add(T item) {
        this.items.add(item);
        this.totalCost += item.getCost();
    }

    public void addAll(Collection<T> items) {
        this.items.addAll(items);
        for (T item: items) {
            this.totalCost += item.getCost();
        }
    }

    public void remove(T item) {
        items.remove(item);
        totalCost -= item.getCost();
    }

    public Double getCost() {
        return totalCost;
    }


}
