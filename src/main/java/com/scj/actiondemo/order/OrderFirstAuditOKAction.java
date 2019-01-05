package com.scj.actiondemo.order;

import com.scj.actiondemo.AbstractAction;
import com.scj.actiondemo.order.common.OrderActionType;

public class OrderFirstAuditOKAction extends AbstractAction<OrderFirstAuditActionInput, OrderFirstAuditActionOutput, OrderActionType> {
    public boolean doValidate(OrderFirstAuditActionInput orderActionInput) {
        return true;
    }

    public OrderFirstAuditActionOutput doAction(OrderFirstAuditActionInput orderActionInput) {
        System.out.println("订单初审通过");
        OrderFirstAuditActionOutput result = new OrderFirstAuditActionOutput();
        result.setResult(true);
        result.setMessage("123456");
        return result;
    }

    public OrderActionType getType() {
        return new OrderActionType(1,2,1);
    }
}
