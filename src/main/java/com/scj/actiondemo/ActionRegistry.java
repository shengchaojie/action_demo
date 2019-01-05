package com.scj.actiondemo;

public interface ActionRegistry<T> {

    void register(T t ,Action action);

    Action lookup(T t );
}
