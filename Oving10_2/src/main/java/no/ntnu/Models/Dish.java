package no.ntnu.Models;

// Representerer en rett
public class Dish {
  private final String name;
  private final String dishType;
  private double price;
  private final String recipe;

  public Dish(String name, String dishType, double price, String recipe){

    if (name == null || name.isBlank()) {
      throw new IllegalArgumentException("Dish name cannot be empty.");
    }
    if (dishType == null || dishType.isBlank()) {
      throw new IllegalArgumentException("Dish type cannot be empty.");
    }
    if (price < 0) {
      throw new IllegalArgumentException("Price cannot be negative.");
    }
    if (recipe == null) {
      throw new IllegalArgumentException("Recipe cannot be null.");
    }

    this.name = name;
    this.dishType = dishType;
    this.price = price;
    this.recipe = recipe;
  }

  // Getters
  public String getName() {
    return name;
  }

  public String getDishType(){
    return dishType;
  }

  public double getPrice() {
    return price;
  }

  public String getRecipe() {
    return recipe;
  }

  // Setters

  public void setPrice(double price) {
    this.price = price;
  }

  @Override
  public String toString() {
    return (dishType + ": " + name + " " + price + "kr");
  }
}
