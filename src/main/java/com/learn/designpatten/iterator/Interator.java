package com.learn.designpatten.iterator;

public interface Interator<E> {
    public E next();
    public boolean hasNext();
    public E last();
    public E first();
}