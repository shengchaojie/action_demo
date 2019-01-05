package com.scj.actiondemo.order;

import com.scj.actiondemo.order.common.OrderActionBaseInput;
import lombok.Data;

@Data
public class OrderFirstAuditActionInput extends OrderActionBaseInput {

    private String orderNo;

}
