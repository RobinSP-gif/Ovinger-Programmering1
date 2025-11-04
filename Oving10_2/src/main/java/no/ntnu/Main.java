package no.ntnu;

import no.ntnu.Models.Dish;
import no.ntnu.Models.Menu;
import no.ntnu.Models.MenuRegistry;
import no.ntnu.UserInterface.ProgramMenu;

public class Main {
  public static void main(String[] args) {
    // Creating menuregistry
    MenuRegistry registry = new MenuRegistry();

    // creating dishes
    Dish dish = new Dish("Tomatsuppe", "Forrett", 85, "Tomatsuppe oppskrift");
    Dish dish1 = new Dish("Spekemat", "Forrett", 119, "Spekemat oppskrift");
    Dish dish2 = new Dish("Pizza", "Hovedrett", 189, "Pizza oppskrift");
    Dish dish3 = new Dish("Biff", "Hovedrett", 399, "Biff oppskrift");
    Dish dish4 = new Dish("Sjokoladekake", "Dessert", 99, "Sjokoladekake oppskrift");
    Dish dish5 = new Dish("Is", "Dessert", 79, "Is oppskrift");

    // adding dishes to the menuregistry
    registry.registerDish(dish);
    registry.registerDish(dish1);
    registry.registerDish(dish2);
    registry.registerDish(dish3);
    registry.registerDish(dish4);
    registry.registerDish(dish5);

    // testmenu 1
    Menu dagens = new Menu("Dagens meny");
    dagens.add(dish);   // Tomatsuppe
    dagens.add(dish3);  // Biff
    dagens.add(dish4);  // Sjokoladekake
    registry.registerMenu(dagens);

    // testmenu 2
    Menu italiensk = new Menu("Italiensk aften");
    italiensk.add(dish1); // Spekemat
    italiensk.add(dish2); // Pizza
    italiensk.add(dish5); // Is
    registry.registerMenu(italiensk);

    // Starting the UI
    ProgramMenu program = new ProgramMenu(registry);
    program.run();
  }
}