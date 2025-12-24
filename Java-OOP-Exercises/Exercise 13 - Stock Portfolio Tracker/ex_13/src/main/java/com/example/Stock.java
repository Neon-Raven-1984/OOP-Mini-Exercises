package com.example;

public class Stock {

    private String symbol;
    private String name;
    private double currentPrice;

    public Stock(String symbol, String name, double currentPrice) {
        this.symbol = symbol;
        this.name = name;
        this.currentPrice = currentPrice;
    }

    public String getSymbol() {
        return symbol;
    }

    public double getCurrentPrice() {
        return currentPrice;
    }

    public void setCurrentPrice(double price) {
        this.currentPrice = price;
    }

    @Override
    public String toString() {
        return symbol + " (" + name + ") - $" + currentPrice;
    }
}
