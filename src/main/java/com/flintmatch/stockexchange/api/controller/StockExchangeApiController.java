package com.flintmatch.stockexchange.api.controller;

import com.flintmatch.stockexchange.api.model.Trader;
import com.flintmatch.stockexchange.api.service.TraderService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.MediaType;
import org.springframework.web.bind.annotation.*;

import javax.validation.Valid;
import java.sql.SQLException;
import java.util.List;

@RestController
public class StockExchangeApiController {

    @Autowired
    private TraderService traderService;


    @RequestMapping(value = "/api/version", method = RequestMethod.GET, produces = MediaType.APPLICATION_JSON_VALUE)
    public @ResponseBody String version()  {
        return "hello";
    }

    /*
     +++++++++++++++++ TRADERS OBJ ++++++++++++++++++
     */

    // Get all
    @RequestMapping(value = "/api/traders", method = RequestMethod.GET, produces = MediaType.APPLICATION_JSON_VALUE)
    public @ResponseBody List<Trader> allTraders() throws SQLException {
        return this.traderService.getAllTraders();
    }

    // Get by ID
    @RequestMapping(value = "/api/traders/{id}", method = RequestMethod.GET, produces = MediaType.APPLICATION_JSON_VALUE)
    public @ResponseBody Trader getTraderById(@PathVariable String id) throws SQLException {
        return this.traderService.getTraderById(Long.valueOf(id));
    }

    // Create
    @RequestMapping(value = "/api/traders", method = RequestMethod.POST, produces = MediaType.APPLICATION_JSON_VALUE)
    public @ResponseBody Trader create(@Valid Trader trader) throws SQLException {
        this.traderService.save(trader);
        return trader;
    }

    // Update
    @RequestMapping(value = "/api/traders/{id}", method = RequestMethod.PUT, produces = MediaType.APPLICATION_JSON_VALUE)
    public @ResponseBody Trader update(@Valid Trader trader) throws SQLException {
        this.traderService.save(trader);
        return trader;
    }

    // Delete
    @RequestMapping(value = "/api/traders/{id}", method = RequestMethod.DELETE, produces = MediaType.TEXT_PLAIN_VALUE)
    public @ResponseBody String delete(@PathVariable String id) throws SQLException {
        this.traderService.delete(Long.valueOf(id));
        return "Deleted: id";
    }

}
