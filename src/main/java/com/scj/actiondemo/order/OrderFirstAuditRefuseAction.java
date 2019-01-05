package com.scj.actiondemo.order;

import com.scj.actiondemo.AbstractAction;
import com.scj.actiondemo.order.common.OrderActionType;

public class OrderFirstAuditRefuseAction extends AbstractAction<OrderFirstAuditActionInput, OrderFirstAuditActionOutput, OrderActionType> {
    public boolean doValidate(OrderFirstAuditActionInput orderActionInput) {
        return true;
    }

    public OrderFirstAuditActionOutput doAction(OrderFirstAuditActionInput orderActionInput) {
        System.out.println("初审失败");
        OrderFirstAuditActionOutput result = new OrderFirstAuditActionOutput();
        result.setResult(false);
        result.setMessage("88764");
        return result;
    }

    public OrderActionType getType() {
        return new OrderActionType(1,2,2);
    }
}
