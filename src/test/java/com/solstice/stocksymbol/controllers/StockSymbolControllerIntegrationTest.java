package com.solstice.stocksymbol.controllers;

import com.solstice.stocksymbol.domain.Symbol;
import org.junit.Assert;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.junit4.SpringRunner;

@RunWith(SpringRunner.class)
@SpringBootTest(webEnvironment = SpringBootTest.WebEnvironment.RANDOM_PORT)
public class StockSymbolControllerIntegrationTest {

    @Autowired
    private StockSymbolController stockSymbolController;

    @Test
    public void testGetSymbolName(){
        Symbol aSymbol = stockSymbolController.getSymbolById(Long.valueOf("1"));
        Assert.assertEquals("AAPL", aSymbol.getSymbol());
    }
}
