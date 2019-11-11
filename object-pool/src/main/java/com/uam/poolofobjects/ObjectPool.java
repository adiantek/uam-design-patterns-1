package com.uam.poolofobjects;

import java.util.HashSet;
import java.util.Iterator;
import java.util.Optional;
import java.util.Set;

public abstract class ObjectPool<T extends PoolingObject> {

    private Set<T> available = new HashSet<>();

    private Set<T> notAvailable = new HashSet<>();

    public T getObject() {
        return getNextValidObject().orElseGet(this::getNewObject);
    }

    private Optional<T> getNextValidObject() {
        Iterator<T> iterator = available.iterator();
        while (iterator.hasNext()) {
            T t = iterator.next();
            if (validate(t)) {
                available.remove(t);
                notAvailable.add(t);
                return Optional.of(t);
            } else {
                available.remove(t);
                t = null;
            }
        }
        return Optional.empty();
    }

    private T getNewObject() {
        T t = create();
        notAvailable.add(t);
        return t;
    }

    public void returnObject(T t) {
        notAvailable.remove(t);
        available.add(t);
    }

    protected abstract T create();

    protected abstract boolean validate(T t);
}
