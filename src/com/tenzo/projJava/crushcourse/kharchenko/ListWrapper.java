package com.tenzo.projJava.crushcourse.kharchenko;

import java.util.Collection;
import java.util.List;

public abstract class ListWrapper<T> {
    public abstract void addOtherCollection(Collection<? extends T> otherCollection);

    public abstract int removeElementsByCollection(Collection<? extends T> collection);

    public abstract int countDuplicates(Collection<? extends T> collection);

    public abstract List<T> getList();

    public abstract T getElement(int index);

    public abstract String beautyString();

    public static <E> ListWrapper<E> fromElements(E... elements) {
        return null;
    }
}
