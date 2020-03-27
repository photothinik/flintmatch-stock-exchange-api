package com.flintmatch.stockexchange.api.repository;

import com.flintmatch.stockexchange.api.model.OrderTransaction;
import org.springframework.data.jpa.repository.JpaRepository;

public interface OrderTransactionRepository extends JpaRepository<OrderTransaction, Long> {
}
