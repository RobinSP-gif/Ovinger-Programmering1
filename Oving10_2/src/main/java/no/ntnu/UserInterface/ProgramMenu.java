package no.ntnu.UserInterface;

import no.ntnu.Models.Dish;
import no.ntnu.Models.Menu;
import no.ntnu.Models.MenuRegistry;
import java.util.Scanner;

public class ProgramMenu {
  private final Scanner sc = new Scanner(System.in);
  private final MenuRegistry registry;

  public ProgramMenu(MenuRegistry registry) {
    this.registry = registry;
  }

  public void run(){
    boolean runProgram = true;

    while (runProgram) {
      int choice;

      userMenu();
      choice = sc.nextInt();
      sc.nextLine();

      switch (choice){
        case 1:
          System.out.println("Gi retten ett navn: ");
          String name = sc.nextLine();

          System.out.println("Hvilken type rett er det? (forrett, hovedrett eller dessert)");
          String type = sc.nextLine();

          System.out.println("Gi retten en pris: ");
          double price = sc.nextDouble();
          sc.nextLine();

          System.out.println("Legg til oppskriften: ");
          String recipe = sc.nextLine();

          Dish newDish = new Dish(name, type, price, recipe);
          registry.registerDish(newDish);
          break;

        case 2:
          System.out.println("Skriv inn navnet på retten du vil finne.");
          String dish = sc.nextLine();
          Dish found = registry.findDish(dish);

          if (found == null){
            System.out.println("Det er ingen rett med dette navnet.");
          } else {
            System.out.println(found);
            System.out.println("Oppskrift: " + found.getRecipe());
          }
          break;

        case 3:
          System.out.println("Hvilken type retter vil du se? (Forrett, Hovedrett eller Dessert)");
          String typeDish = sc.nextLine().toLowerCase();

          switch (typeDish){
            case "forrett":
              System.out.println(registry.getAllDishesByType("Forrett"));
              break;

            case "hovedrett":
              System.out.println(registry.getAllDishesByType("Hovedrett"));
              break;

            case "dessert":
              System.out.println(registry.getAllDishesByType("Dessert"));
              break;

            default:
              System.out.println("Ugyldig valg");
          }
        break;

        case 4:
          System.out.println("Skriv inn navnet på den nye menyen: ");
          String newMenuName = sc.nextLine();
          Menu newMenu = new Menu(newMenuName);

          System.out.println("Disse rettene finnes i systemet: ");
          for (Dish d : registry.getAllDishes()) {
            System.out.println(d.getDishType() + ": " + d.getName());
          }

          boolean adding = true;
          while (adding) {
            System.out.println("Skriv inn navnet på de rettene du ønsker å legge til i menyen.\nEller skriv ferdig om du har lagt til alt.");
            String dishName = sc.nextLine();

            if (dishName.equalsIgnoreCase("ferdig")) {
              adding = false;
            } else {
              Dish found1 = registry.findDish((dishName));
              if (found1 == null) {
                System.out.println("Fant ingen rett med dette navnet: " + dishName);
              } else {
                newMenu.add(found1);
                System.out.println(found1.getName() + " ble lagt til i menyen.");
              }
            }
          }

          registry.registerMenu(newMenu);
          System.out.println("Meny " + newMenuName + " ble registrert.");

          break;

        case 5:
          System.out.println("Du skal nå velge intervallet du ønsker å finne. Skriv inn det minste summen: ");
          double sumMinimum = sc.nextDouble();
          sc.nextLine();

          System.out.println("Skriv inn den høyeste summen: ");
          double sumMaximum = sc.nextDouble();
          sc.nextLine();

          if (registry.findAllMenusWithTotalPriceWithin(sumMinimum, sumMaximum) == null) {
            System.out.println("Det er ingen menyer i dette intevallet.");
          } else {
            System.out.println(registry.findAllMenusWithTotalPriceWithin(sumMinimum, sumMaximum));
          }
          break;

        case 0:
          runProgram = false;
          System.out.println("Programmet avsluttes.");
          sc.close();
          break;

        default:
          System.out.println("Ugyldig valg, prøv igjen.");
          break;
      }
    }
  }

  private void userMenu() {
    System.out.println("""
      \nHva ønsker du å gjøre idag?
      1. Registrere en ny rett
      2. Finne en rett.
      3. Finne alle retter av en gitt type.
      4. Registrere en ny meny
      5. Finne alle menyer som har en totalpris innenfor ett gitt intervall.
      0. Avslutt programmet.
      """);
  }

}
