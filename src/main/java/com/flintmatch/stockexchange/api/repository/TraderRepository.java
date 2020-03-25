package com.flintmatch.stockexchange.api.repository;

import com.flintmatch.stockexchange.api.model.Trader;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public interface TraderRepository extends JpaRepository<Trader, Long> {

//    List<Trader> findAll();

}
