package com.flintmatch.stockexchange.api.repository;

import com.flintmatch.stockexchange.api.model.Order;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface OrderRepository extends JpaRepository<Order, Long> {

}
