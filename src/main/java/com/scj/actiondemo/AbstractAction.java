package com.scj.actiondemo;

public abstract class AbstractAction<I,O,T> implements Action<I,O,T>{

    public O action(I i) {
        if(!doValidate(i)){
            throw new RuntimeException("验证不通过");
        }
        return doAction(i);
    }

    public abstract boolean doValidate(I i);

    public abstract O doAction(I i);

}
