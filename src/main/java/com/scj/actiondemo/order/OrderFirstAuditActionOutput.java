package com.scj.actiondemo.order;

import com.scj.actiondemo.order.common.OrderActionBaseOutput;
import lombok.Data;

@Data
public class OrderFirstAuditActionOutput extends OrderActionBaseOutput {

    private Boolean result;

    private String message;
}
