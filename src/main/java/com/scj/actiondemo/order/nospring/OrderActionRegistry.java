package com.scj.actiondemo.order.nospring;

import com.scj.actiondemo.Action;
import com.scj.actiondemo.ActionRegistry;
import com.scj.actiondemo.order.OrderFirstAuditOKAction;
import com.scj.actiondemo.order.OrderFirstAuditRefuseAction;
import com.scj.actiondemo.order.OrderInitAction;
import com.scj.actiondemo.order.common.OrderActionType;
import lombok.extern.slf4j.Slf4j;

import java.util.concurrent.ConcurrentHashMap;

@Slf4j
public class OrderActionRegistry implements ActionRegistry<OrderActionType> {

    private ConcurrentHashMap<OrderActionType,Action> registry = new ConcurrentHashMap<OrderActionType, Action>();

    public OrderActionRegistry() {
        init();
    }

    public void init(){
        OrderInitAction initAction = new OrderInitAction();
        registry.put(initAction.getType(),initAction);

        OrderFirstAuditOKAction firstAuditOKAction = new OrderFirstAuditOKAction();
        registry.put(firstAuditOKAction.getType(),firstAuditOKAction);

        OrderFirstAuditRefuseAction firstAuditRefuseAction = new OrderFirstAuditRefuseAction();
        registry.put(firstAuditRefuseAction.getType(),firstAuditRefuseAction);
    }

    public void register(OrderActionType orderActionType, Action action) {
        if(null != registry.get(orderActionType)){
            log.error("该OrderActionType已经注册了Action,orderActionType={}",orderActionType);
            return;
        }
        registry.put(orderActionType,action);
    }

    public Action lookup(OrderActionType orderActionType) {
        return registry.get(orderActionType);
    }
}
