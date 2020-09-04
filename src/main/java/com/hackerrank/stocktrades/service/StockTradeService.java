package com.hackerrank.stocktrades.service;

import com.hackerrank.stocktrades.exception.EntityNotFoundException;
import com.hackerrank.stocktrades.exception.ServiceRequestException;
import com.hackerrank.stocktrades.model.StockTrade;
import com.hackerrank.stocktrades.repository.StockTradeRepository;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

@Service
public class StockTradeService {
    private StockTradeRepository stockTradeRepository;

    public StockTradeService( final StockTradeRepository stockTradeRepository) {
        this.stockTradeRepository = stockTradeRepository;
    }


    public StockTrade create(StockTrade newStockTrade) {
        final Integer shares = newStockTrade.getShares();
        if(shares > 100 || shares < 1) {
            throw new ServiceRequestException("Out of range");
        }

        return this.stockTradeRepository.save(newStockTrade);
    }

    public List<StockTrade> findAllStockTrades() {
        return this.stockTradeRepository.findAll();
    }

    public List<StockTrade> findByTypeAndUserId(String type, Integer userId) {
        return this.stockTradeRepository.findByTypeAndUserId (type, userId);
    }

    public List<StockTrade> findByType(String type) {
        return this.stockTradeRepository.findByType (type);
    }

    public List<StockTrade> findByUserId(Integer userId) {
        return this.stockTradeRepository.findByUserId (userId);
    }

    public StockTrade findById(Integer id) {
        final Optional<StockTrade> stockTrade = this.stockTradeRepository.findById(id);

        if(!stockTrade.isPresent()) {
            throw new EntityNotFoundException("Entity not found");
        }
        return this.stockTradeRepository.findById(id).get();
    }
}
