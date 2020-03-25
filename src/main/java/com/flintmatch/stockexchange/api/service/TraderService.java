package com.flintmatch.stockexchange.api.service;

import com.flintmatch.stockexchange.api.model.Trader;
import com.flintmatch.stockexchange.api.repository.TraderRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.sql.SQLException;
import java.util.List;

@Service
public class TraderService {

    @Autowired
    private TraderRepository traderRepository;

    public List<Trader> getAllTraders() throws SQLException {
        return this.traderRepository.findAll();
    }

    public Trader getTraderById(Long id) throws SQLException {
        return this.traderRepository.findById(id).get();
    }

    public void save(Trader t) {
        this.traderRepository.save(t);
    }

    public void delete(Long id) {
        this.traderRepository.deleteById(id);
    }

}
