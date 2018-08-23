package com.solstice.stocksymbol.domain;

import javax.persistence.Entity;

@Entity
public class Symbol {

    private Long id;
    private String symbol;

    public Symbol(){
    }

    public Symbol(Long id, String symbol) {
        this.id = id;
        this.symbol = symbol;
    }

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getSymbol() {
        return symbol;
    }

    public void setSymbol(String symbol) {
        this.symbol = symbol;
    }
}
