package DesignPatterns.Behavioural.Observer;

import java.util.ArrayList;
import java.util.List;

public class Product implements Observable {
    private String name;
    private boolean inStock = false;
    private List<Observer> observers = new ArrayList<>();

    public Product(String name) {
        this.name = name;
    }

    public void setInStock(boolean inStock) {
        this.inStock = inStock;
        if (inStock) {
            notifyObservers("Product '" + name + "' is now back in stock!");
        }
        notifyObservers("Product '" + name + "' is now out of stock!");
    }

    @Override
    public void addObserver(Observer observer) {
        observers.add(observer);
    }

    @Override
    public void removeObserver(Observer observer) {
        observers.remove(observer);
    }

    @Override
    public void notifyObservers(String message) {
        for (Observer observer : observers) {
            observer.update(message);
        }
    }
}