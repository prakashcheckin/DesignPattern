package com.designpattern.behavioural.observer;

import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

import java.util.HashSet;
import java.util.Set;

@Getter
@Setter
@NoArgsConstructor
public class NationalStockExchange implements NSEActivities {

    private static NationalStockExchange nationalStockExchange;
    private static Set<Stock> stockSet = new HashSet<>();
    private Set<Trader> traderSet = new HashSet<>();

    public static NationalStockExchange getNSEInstance(){

        if(nationalStockExchange == null){
            intializeStock();
            return new NationalStockExchange();
        }
        return nationalStockExchange;
    }

    @Override
    public void register(Trader trader) {
        if (trader != null) {
            traderSet.add(trader);
        }
    }

    @Override
    public void unregister(String name) {
        if (name != null) {
            traderSet.removeIf(trader -> trader.getName().equals(name));
        }
    }

    @Override
    public void update() {
        notifyAllObserver();
    }

    private void notifyAllObserver() {
        traderSet.forEach(trader -> trader.update(stockSet));
    }

    private static void intializeStock(){
        stockSet.add(Stock.builder().name("Tata_Comnunications").price(154).prevClose(150).low(148).high(160).build());
        stockSet.add(Stock.builder().name("IBM").price(154).prevClose(150).low(148).high(160).build());
        stockSet.add(Stock.builder().name("TCS").price(154).prevClose(150).low(148).high(160).build());
        stockSet.add(Stock.builder().name("Infosys").price(154).prevClose(150).low(148).high(160).build());
        stockSet.add(Stock.builder().name("Cognizant").price(154).prevClose(150).low(148).high(160).build());
    }

    public static Set<Stock> getStocks(){
        return stockSet;
    }
}
