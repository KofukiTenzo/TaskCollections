package com.tenzo.projJava.crushcourse.kharchenko;

public class MyGenerics<F, S> {
    private F first;
    private S second;

    public MyGenerics(F first, S second) {
        this.first = first;
        this.second = second;
    }

    public void setFirst(F first) {
        this.first = first;
    }

    public void setSecond(S second) {
        this.second = second;
    }

    public F getFirst() {
        return first;
    }

    public S getSecond() {
        return second;
    }
}
