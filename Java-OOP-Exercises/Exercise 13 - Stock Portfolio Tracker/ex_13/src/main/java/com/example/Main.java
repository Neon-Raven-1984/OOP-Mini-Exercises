package com.example;

public class Main {

    public static void main(String[] args) {

        Portfolio portfolio = new Portfolio(10_000);

        Stock apple = new Stock("AAPL", "Apple Inc.", 150);
        Stock google = new Stock("GOOG", "Google", 2800);

        portfolio.buyStock(apple, 20, 150);
        portfolio.buyStock(google, 2, 2800);

        portfolio.printPortfolio();

        apple.setCurrentPrice(170);
        google.setCurrentPrice(3000);

        System.out.println("\n📈 After price update:");
        portfolio.printPortfolio();

        portfolio.sellStock("AAPL", 5);
        portfolio.printPortfolio();
    }
}
