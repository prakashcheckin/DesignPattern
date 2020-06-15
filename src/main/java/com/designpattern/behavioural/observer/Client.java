package com.designpattern.behavioural.observer;

import java.util.Set;

public class Client {

    public static void main(String[] args){

        NationalStockExchange nationalStockExchange = NationalStockExchange.getNSEInstance();

        System.out.println(">> Registering Users");
        nationalStockExchange.register(Trader.builder().name("Prakash").phone("5056265408").email("ganaprakashcheckout@gmail.com").build());
        nationalStockExchange.register(Trader.builder().name("Rahul").phone("8056265408").email("ganaprakashcheckout@gmail.com").build());
        nationalStockExchange.register(Trader.builder().name("Cavin").phone("53950634485").email("ganaprakashcheckout@gmail.com").build());
        nationalStockExchange.update();

        System.out.println(">> Stock updating");
        Set<Stock> stocks = nationalStockExchange.getStocks();
        stocks.stream().filter(stock -> stock.getName().equals("IBM")).forEach(stock -> {
            stock.setPrice(197.00);
            stock.setPrevClose(200.00);
            stock.setLow(180.66);
            stock.setHigh(210.20);
        });

        nationalStockExchange.update();

        System.out.println(">> unregister");
        nationalStockExchange.unregister("Prakash");
        nationalStockExchange.update();
    }



}
