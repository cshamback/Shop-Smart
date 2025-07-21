package com.example.shopsmart.model;

import androidx.annotation.NonNull;

import com.example.shopsmart.model.interfaces.Nameable;

import java.util.AbstractSet;
import java.util.HashMap;
import java.util.Iterator;
import java.util.Set;
import java.util.Spliterator;
import java.util.function.Consumer;
import java.util.function.IntFunction;
import java.util.function.Predicate;
import java.util.stream.Stream;


public class NamedSet<T extends Nameable> extends AbstractSet<T> implements Set<T> {
    private final HashMap<String, T> map = new HashMap<>();

    @Override
    public boolean add(T item) {
        return map.put(item.getName(), item) == null;
    }

    public boolean remove(T o) {
        return map.remove(o.getName(), o);
    }

    @Override
    public void forEach(@NonNull Consumer<? super T> action) {
        super.forEach(action);
    }

    @NonNull
    @Override
    public Iterator<T> iterator() {
        return map.values().iterator();
    }

    @NonNull
    @Override
    public Stream<T> parallelStream() {
        return map.values().stream();
    }

    @Override
    public boolean removeIf(@NonNull Predicate<? super T> filter) {
        return map.values().removeIf(filter);
    }

    @Override
    public int size() {
        return map.size();
    }

    @NonNull
    @Override
    public Spliterator<T> spliterator() {
        return map.values().spliterator();
    }

    @NonNull
    @Override
    public Stream<T> stream() {
        return map.values().stream();
    }

    @NonNull
    @Override
    public <T1> T1[] toArray(@NonNull IntFunction<T1[]> generator) {
        throw new UnsupportedOperationException();
    }
}
