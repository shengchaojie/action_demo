package com.scj.actiondemo.order.common;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@AllArgsConstructor
@NoArgsConstructor
public class OrderActionType {

    private Integer type;

    private Integer status;

    private Integer option;

}