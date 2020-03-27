package com.flintmatch.stockexchange.api.service;

import com.flintmatch.stockexchange.api.model.OrderTransaction;
import com.flintmatch.stockexchange.api.repository.OrderTransactionRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

@Service
public class OrderTransactionService {

    @Autowired
    private OrderTransactionRepository orderTransactionRepository;

    public List<OrderTransaction> getAllOrderTransactions() {
        return this.orderTransactionRepository.findAll();
    }

    public OrderTransaction getOrderTransactionById(Long id) {
        Optional<OrderTransaction> result = this.orderTransactionRepository.findById(id);
        if( result.isPresent())
            return result.get();
        else
            throw new IllegalArgumentException("Unable to find stock order transaction with id '" + id + "'");
    }


}
