package no.ntnu.Models;

import java.util.ArrayList;

// Collection of dishes
public class Menu {
  private final String name;
  private ArrayList<Dish> dishes;

  // Constructor
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

  // Methods
  public void add(Dish d){
    if (d == null) throw new IllegalArgumentException("Dish kan ikke være null.");
    if (!dishes.contains(d)) dishes.add(d);
    dishes.add(d);
  }

  public void remove(Dish d){
    dishes.remove(d);
  }

  public ArrayList<Dish> getAllDishes() {
    return new ArrayList<>(dishes);
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

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("\nMeny: ").append(name).append("\n");
    sb.append("Retter:\n");
    for (Dish d : dishes) {
      sb.append(" - ").append(d.getName())
        .append(" (").append(d.getDishType())
        .append(") ").append(d.getPrice()).append(" kr\n");
    }
    sb.append("Totalpris: ").append(getTotalPrice()).append(" kr\n");
    return sb.toString();
  }
}
