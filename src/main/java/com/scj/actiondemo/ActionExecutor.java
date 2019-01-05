package com.scj.actiondemo;

public interface ActionExecutor<I,O,T> {

    O execute(T t,I i);

}
