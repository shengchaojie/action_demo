package com.scj.actiondemo.order.spring;

import com.scj.actiondemo.Action;
import com.scj.actiondemo.ActionRegistry;
import com.scj.actiondemo.order.common.OrderActionType;

public class OrderActionSpringRegistry implements ActionRegistry<OrderActionType> {




    public void register(OrderActionType orderActionType, Action action) {

    }

    public Action lookup(OrderActionType orderActionType) {
        return null;
    }
}
