package com.company.bank.account.model;

import lombok.Data;
import lombok.NoArgsConstructor;

import javax.persistence.*;
import java.util.Set;

@Data
@NoArgsConstructor
@Entity(name = "client")
public class ClientModel {

    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private Integer code;
    private String name;
    @OneToMany

    private Set<BankAccountModel> bankAccount;
}
