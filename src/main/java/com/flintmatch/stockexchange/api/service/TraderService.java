package com.flintmatch.stockexchange.api.service;

import com.flintmatch.stockexchange.api.model.Trader;
import com.flintmatch.stockexchange.api.repository.TraderRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.sql.SQLException;
import java.util.List;
import java.util.Optional;

@Service
public class TraderService {

    @Autowired
    private TraderRepository traderRepository;

    public List<Trader> getAllTraders() throws SQLException {
        return this.traderRepository.findAll();
    }

    public Trader getTraderById(Long id) throws SQLException {
        Optional<Trader> result = this.traderRepository.findById(id);
        if( result.isPresent())
            return result.get();
        else
            throw new IllegalArgumentException("Unable to find stock trader with id '" + id + "'");
    }

    public void save(Trader t) {
        this.traderRepository.save(t);
    }

    public void delete(Long id) {
        this.traderRepository.deleteById(id);
    }

}
