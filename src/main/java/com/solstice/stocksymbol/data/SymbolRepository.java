package com.solstice.stocksymbol.data;

import com.solstice.stocksymbol.domain.Symbol;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface SymbolRepository extends JpaRepository<Symbol, Long> {

    Symbol findBySymbol(String symbol);
}
