package com.company.bank.account.repository;

import com.company.bank.account.model.ClientModel;
import org.springframework.data.jpa.repository.JpaRepository;

import java.util.List;

public interface ClientRepository extends JpaRepository<ClientModel, Integer> {

    List<ClientModel> findByName(String name);
}
