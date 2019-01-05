package com.scj.actiondemo.order;

import com.scj.actiondemo.AbstractAction;
import com.scj.actiondemo.order.common.OrderActionType;

public class OrderInitAction extends AbstractAction<OrderInitActionInput, OrderInitActionOutput, OrderActionType> {
    public boolean doValidate(OrderInitActionInput orderActionInput) {
        return orderActionInput.getOrderNo()!=null;
    }

    public OrderInitActionOutput doAction(OrderInitActionInput orderActionInput) {
        System.out.println("订单初始化");
        OrderInitActionOutput result = new OrderInitActionOutput();
        result.setResult(true);
        return result;
    }

    public OrderActionType getType() {
        return new OrderActionType(1,1,1);
    }
}
