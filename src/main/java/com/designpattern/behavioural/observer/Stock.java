package com.designpattern.behavioural.observer;

import lombok.*;

@Getter
@Setter
@AllArgsConstructor
@NoArgsConstructor
@Builder
@ToString
public class Stock {

    private String name;
    private double price;
    private double prevClose;
    private double low;
    private double high;

}
