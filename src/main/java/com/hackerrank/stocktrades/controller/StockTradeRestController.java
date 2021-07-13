package com.hackerrank.stocktrades.controller;

import com.hackerrank.stocktrades.exception.NotSupportedException;
import com.hackerrank.stocktrades.model.StockTrade;
import com.hackerrank.stocktrades.service.StockTradeService;
import com.hackerrank.stocktrades.util.Mappings;
import org.springframework.http.HttpStatus;
import org.springframework.web.bind.annotation.*;

import javax.validation.Valid;
import java.util.Collections;
import java.util.List;

@RestController
@RequestMapping(Mappings.TRADES)
public class StockTradeRestController {
    private final StockTradeService stockTradeService;

    public StockTradeRestController(StockTradeService stockTradeService) {
        this.stockTradeService = stockTradeService;
    }

    @GetMapping
    @ResponseStatus(HttpStatus.OK)
    public List<StockTrade> findStockTrade(@RequestParam(required = false) String type,
                                           @RequestParam(required = false) Integer userId) {

        if( type!= null && userId !=null ) {
            return this.stockTradeService.findByTypeAndUserId(type, userId);
        } else if( type!= null && userId ==null ) {
            return this.stockTradeService.findByType(type);
        } else if( type == null && userId !=null ) {
            return this.stockTradeService.findByUserId(userId);
        } else {
            return this.stockTradeService.findAllStockTrades();
        }
    }

    @GetMapping("/{id}")
    @ResponseStatus(HttpStatus.OK)
    public StockTrade findStockTradeById(@PathVariable("id") Integer id) {
        return this.stockTradeService.findById(id);
    }

    @PostMapping
    @ResponseStatus(HttpStatus.CREATED)
    public StockTrade create(@RequestBody @Valid StockTrade stockTrade) {
        return this.stockTradeService.create(stockTrade);
    }

    @DeleteMapping("/{id}")
    @ResponseStatus(HttpStatus.METHOD_NOT_ALLOWED)
    public void delete(){
        throw new NotSupportedException("This action is not supported");
    }

    @PutMapping("/{id}")
    @ResponseStatus(HttpStatus.METHOD_NOT_ALLOWED)
    public void update(){
        throw new NotSupportedException("This action is not supported");
    }

    @PatchMapping("/{id}")
    @ResponseStatus(HttpStatus.METHOD_NOT_ALLOWED)
    public void patch(){
        throw new NotSupportedException("This action is not supported");
    }

}
