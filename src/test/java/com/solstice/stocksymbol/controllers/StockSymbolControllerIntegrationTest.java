package com.solstice.stocksymbol.controllers;

import com.solstice.stocksymbol.domain.Symbol;
import org.junit.Assert;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.junit4.SpringRunner;

@RunWith(SpringRunner.class)
@SpringBootTest()
public class StockSymbolControllerIntegrationTest {

    @Autowired
    private StockSymbolController stockSymbolController;

    @Test
    public void testGetSymbolNameById(){
        Symbol aSymbol = stockSymbolController.getSymbolById(Long.valueOf("1"));
        Assert.assertEquals("AAPL", aSymbol.getSymbol());
    }

    @Test
    public void testGetIdBySymbol(){
        Symbol aSymbol = stockSymbolController.getIdBySymbol("AAPL");
        Assert.assertEquals(Long.valueOf("1"), aSymbol.getId());
    }
}
