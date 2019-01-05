package com.scj.actiondemo;

public interface Action<I,O,T> {

    T getType();

    O action(I o);

}
