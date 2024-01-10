package com.amenor.paymybuddy.model;

import lombok.AllArgsConstructor;
import lombok.Data;

@Data
@AllArgsConstructor
public class Account {

    private Integer accountId;
    private Integer personId;
    private float finances;

}
