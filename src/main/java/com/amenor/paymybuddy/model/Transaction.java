package com.amenor.paymybuddy.model;

import lombok.AllArgsConstructor;
import lombok.Data;

@Data
@AllArgsConstructor
public class Transaction {

    private Integer transactionId;
    private Integer accountSourceId;
    private Integer accountRecipientId;
    private float amount;

}
