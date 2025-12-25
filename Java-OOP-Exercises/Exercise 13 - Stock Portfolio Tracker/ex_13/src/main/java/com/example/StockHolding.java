package com.example;

public class StockHolding {

    private Stock stock;
    private int quantity;
    private double averageBuyPrice;

    public StockHolding(Stock stock, int quantity, double price) {
        this.stock = stock;
        this.quantity = quantity;
        this.averageBuyPrice = price;
    }

    public Stock getStock() {
        return stock;
    }

    public int getQuantity() {
        return quantity;
    }

    public void addQuantity(int qty, double price) {
        averageBuyPrice =
            ((averageBuyPrice * quantity) + (price * qty)) / (quantity + qty);
        quantity += qty;
    }

    public void removeQuantity(int qty) {
        quantity -= qty;
    }

    public double getProfitLoss() {
        return (stock.getCurrentPrice() - averageBuyPrice) * quantity;
    }
    
    public double getValue() {
        return quantity * stock.getCurrentPrice();
    }

    @Override
    public String toString() {
        return stock.getSymbol() +
                " | Qty: " + quantity +
                " | Value: $" + getValue();
    }
}
