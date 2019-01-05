package com.scj.actiondemo.order;

import com.scj.actiondemo.order.common.OrderActionType;
import com.scj.actiondemo.order.nospring.OrderActionExecutor;

public class Main {

    public static void main(String[] args) {
        OrderActionExecutor executor = new OrderActionExecutor();

        OrderInitActionInput input = new OrderInitActionInput();
        input.setOrderNo("1234");

        OrderActionType orderActionType = new OrderActionType(1,1,1);
        OrderInitActionOutput output = (OrderInitActionOutput)executor.execute(orderActionType,input);
        System.out.println(output);

        OrderFirstAuditActionInput firstAuditActionInput = new OrderFirstAuditActionInput();
        firstAuditActionInput.setOrderNo("8888");
        orderActionType = new OrderActionType(1,2,1);
        OrderFirstAuditActionOutput orderFirstAuditActionOutput = (OrderFirstAuditActionOutput)executor.execute(orderActionType,firstAuditActionInput);
        System.out.println(orderFirstAuditActionOutput);

        orderActionType = new OrderActionType(1,2,2);
        OrderFirstAuditActionOutput orderFirstAuditActionOutput1 = (OrderFirstAuditActionOutput)executor.execute(orderActionType,firstAuditActionInput);
        System.out.println(orderFirstAuditActionOutput1);
    }

}
