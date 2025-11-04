package no.ntnu.Models;

import java.util.ArrayList;

// Collection of menus
public class MenuRegistry {
  private final ArrayList<Dish> dishes;
  private final ArrayList<Menu> menus;

  public MenuRegistry() {
    dishes = new ArrayList<>();
    menus = new ArrayList<>();
  }

  public ArrayList<Dish> getAllDishes(){
    return new ArrayList<>(dishes);
  }

  // Register Dish
  public void registerDish(Dish dish){
    if (dish == null) {
      throw new IllegalArgumentException("Dish kan ikke være null.");
    }

    for (Dish d : dishes) {
      if (d.getName().equalsIgnoreCase(dish.getName())) {
        throw new IllegalArgumentException("Det finnes en rett med dette navnet: " + dish.getName());
      }
    }
    dishes.add(dish);
  }

  // Find a dish, with name
  public Dish findDish(String name) {
    if (name == null)
      return null;

    for (Dish d : dishes) {
      if(d.getName().equalsIgnoreCase(name))
        return d;
    }
    return null;
  }

  // Find all dishes by type
  public ArrayList<Dish> getAllDishesByType(String type) {
    ArrayList<Dish> result = new ArrayList<>();
    if (type == null) {
      return result;
    }

    for (Dish d : dishes){
      if (d.getDishType().equalsIgnoreCase(type)) {
      result.add(d);
      }
    }
    return result;
  }

  // Register a new menu
  public void registerMenu(Menu menu) {
    if (menu == null) {
      throw new IllegalArgumentException("Meny maa ha ett navn.");
    }

    for (Menu m : menus) {
      if (m.getName().equalsIgnoreCase(menu.getName())) {
        throw new IllegalArgumentException("Det finnes en meny med dette navnet: " + menu.getName());
      }
    }
    menus.add(menu);
    }
    // Find all menus with total price within two numbers
    public ArrayList<Menu> findAllMenusWithTotalPriceWithin(double priceLow, double priceHigh){
    ArrayList<Menu> result = new ArrayList<>();
    if (priceLow < 0 || priceHigh < 0) {
      throw new IllegalArgumentException("Priser kan ikke være negative");
    }
    if (priceHigh < priceLow) {
      throw new IllegalArgumentException("Lav pris kan ikke være høyere enn høypris");
    }
    for (Menu m : menus) {
      if (m.getTotalPrice() >= priceLow && m.getTotalPrice() <= priceHigh) {
        result.add(m);
      }
    }
    return result;
    }
  }
