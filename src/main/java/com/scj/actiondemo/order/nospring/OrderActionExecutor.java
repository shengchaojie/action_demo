package com.scj.actiondemo.order.nospring;

import com.scj.actiondemo.Action;
import com.scj.actiondemo.ActionExecutor;
import com.scj.actiondemo.ActionRegistry;
import com.scj.actiondemo.order.common.OrderActionBaseInput;
import com.scj.actiondemo.order.common.OrderActionBaseOutput;
import com.scj.actiondemo.order.common.OrderActionType;

public class OrderActionExecutor implements ActionExecutor<OrderActionBaseInput, OrderActionBaseOutput, OrderActionType> {

    private ActionRegistry<OrderActionType> actionRegistry = new OrderActionRegistry();

    public OrderActionBaseOutput execute(OrderActionType orderActionType, OrderActionBaseInput orderBaseInput) {
        Action action = actionRegistry.lookup(orderActionType);
        if(action==null){
            throw new RuntimeException("找不到对应Action");
        }
        return (OrderActionBaseOutput)action.action(orderBaseInput);
    }
}
