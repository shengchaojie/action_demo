package com.scj.actiondemo.order;

import com.scj.actiondemo.order.common.OrderActionBaseInput;
import lombok.Data;

@Data
public class OrderInitActionInput extends OrderActionBaseInput {

    private String orderNo;

}
