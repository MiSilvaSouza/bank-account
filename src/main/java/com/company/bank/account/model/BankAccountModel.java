package com.company.bank.account.model;

import lombok.Data;
import lombok.NoArgsConstructor;

import javax.persistence.*;
import java.math.BigDecimal;
import java.util.Date;

@Data
@NoArgsConstructor
@Entity(name = "bank_account")
public class BankAccountModel {

    @Id
    private String code;
    @ManyToOne
    private ClientModel client;
    private Date date;
    private BigDecimal valueIn;
    private BigDecimal valueOut;
}
