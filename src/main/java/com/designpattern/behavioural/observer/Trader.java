package com.designpattern.behavioural.observer;

import lombok.*;

import java.util.Set;

@Getter
@Setter
@AllArgsConstructor
@NoArgsConstructor
@Builder
public class Trader implements Observer{

    public String name;
    public String email;
    public String phone;

    @Override
    public void update(Set<Stock> updatedStockList) {
        System.out.println("Hi "+ this.name + " Below is the new updated stock price" );
        updatedStockList.forEach(stock -> System.out.println(stock.toString()));
        System.out.println("=======================================================");
    }
}
