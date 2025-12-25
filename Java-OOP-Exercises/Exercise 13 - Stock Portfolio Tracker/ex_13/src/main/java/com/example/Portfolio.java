package com.example;

import java.util.ArrayList;

public class Portfolio {

    private ArrayList<StockHolding> holdings = new ArrayList<>();
    private double cashBalance;

    public Portfolio(double initialCash) {
        this.cashBalance = initialCash;
    }

    public void buyStock(Stock stock, int quantity, double price) {
        double cost = quantity * price;

        if (cost > cashBalance) {
            System.out.println("❌ Not enough cash!");
            return;
        }

        for (StockHolding h : holdings) {
            if (h.getStock().getSymbol().equals(stock.getSymbol())) {
                h.addQuantity(quantity, price);
                cashBalance -= cost;
                System.out.println("✅ Bought more " + stock.getSymbol());
                return;
            }
        }

        holdings.add(new StockHolding(stock, quantity, price));
        cashBalance -= cost;
        System.out.println("✅ Bought " + stock.getSymbol());
    }

    public void sellStock(String symbol, int quantity) {
        for (StockHolding h : holdings) {
            if (h.getStock().getSymbol().equals(symbol)) {
                if (quantity > h.getQuantity()) {
                    System.out.println("❌ Not enough shares!");
                    return;
                }

                double revenue = quantity * h.getStock().getCurrentPrice();
                h.removeQuantity(quantity);
                cashBalance += revenue;

                System.out.println("💰 Sold " + quantity + " of " + symbol);

                if (h.getQuantity() == 0) {
                    holdings.remove(h);
                }
                return;
            }
        }
        System.out.println("❌ Stock not found!");
    }

    public double getPortfolioValue() {
        double total = cashBalance;
        for (StockHolding h : holdings) {
            total += h.getValue();
        }
        return total;
    }

    public void printProfitLoss() {
        for (StockHolding h : holdings) {
            double pl = h.getProfitLoss();
            String status = pl >= 0 ? "Profit" : "Loss";
            System.out.printf("%s: %s $%.2f%n", h.getStock().getSymbol(), status, pl);
        }
    }

    public void printPortfolio() {
        System.out.println("📂 Portfolio:");
        for (StockHolding h : holdings) {
            System.out.println(h);
        }
        System.out.println("💵 Cash: $" + cashBalance);
        System.out.println("📊 Total Value: $" + getPortfolioValue());
    }
}
