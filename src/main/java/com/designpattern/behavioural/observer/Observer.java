package com.designpattern.behavioural.observer;

import java.util.Set;

public interface Observer {

    void update(Set<Stock> updatedStockList);

}
