package com.monopolardesigns.trackey.repository;

import com.monopolardesigns.trackey.entity.Transactions;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.rest.core.annotation.RepositoryRestResource;

@RepositoryRestResource
public interface TransactionRepository extends JpaRepository<Transactions, Long> {

}
