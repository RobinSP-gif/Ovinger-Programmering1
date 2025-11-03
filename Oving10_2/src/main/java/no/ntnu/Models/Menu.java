package no.ntnu.Models;

import java.util.ArrayList;

// Samler retter
public class Menu {
  private final String name;
  private ArrayList<Dish> dishes;

  // Konstruktør
  public Menu(String name) {
    if (name == null || name.isBlank()) {
      throw new IllegalArgumentException("Menu name cannot be empty.");
    }
    this.dishes = new ArrayList<>();
    this.name = name;
  }

  // Getters
  public String getName() {
    return name;
  }

  // Metoder
  public void add(Dish d){
    dishes.add(d);
  }

  public void remove(Dish d){
    dishes.remove(d);
  }

  public ArrayList<Dish> getAllDishes() {
    return dishes;
  }

  public double getTotalPrice() {
    double total = 0;
    for (Dish d : dishes) {
      total += d.getPrice();
    }
    return total;
  }

  public void printMenu() {
    System.out.println("---- Menu ----");
    for (Dish d : dishes) {
      System.out.println(d);
    }
  }
}
