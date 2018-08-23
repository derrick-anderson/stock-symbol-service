package com.solstice.stocksymbol.controllers;

import com.solstice.stocksymbol.data.SymbolRepository;
import com.solstice.stocksymbol.domain.Symbol;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class StockSymbolController {

    private SymbolRepository  symbolRepository;

    StockSymbolController(SymbolRepository symbolRepository){
        this.symbolRepository = symbolRepository;
    }


    @GetMapping("/symbols/{id}")
    public Symbol getSymbolById(@PathVariable("id") Long id){
        return symbolRepository.findById(id).get();
    }

}
