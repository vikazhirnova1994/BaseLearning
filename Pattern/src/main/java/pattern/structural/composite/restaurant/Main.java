package pattern.structural.composite.restaurant;

import pattern.structural.composite.restaurant.component.Menu;
import pattern.structural.composite.restaurant.component.MenuComponent;
import pattern.structural.composite.restaurant.component.MenuItem;

/**
 * @author Victoria Zhirnova
 * @project LearningPattern
 */

public class Main {
    public static void main(String[] args) {
        MenuComponent pancakeMenu = new Menu("Pancake Menu", "Breakfast");
        MenuComponent dinnerMenu = new Menu("Dinner Menu", "Lunch");
        MenuComponent cafeMenu = new Menu("Cafe Menu", "Dinner");
        MenuComponent dessertMenu = new Menu("Dessert Menu", "DESSERT");
        MenuComponent allMenus = new Menu("All Menu", "All Menu Combined");

        allMenus.add(pancakeMenu);
        allMenus.add(dinnerMenu);
        allMenus.add(cafeMenu);
        dinnerMenu.add(new MenuItem("Pasta", "Spagheti with Marinara Sause", true, 3.89));
        dinnerMenu.add(dessertMenu);
        dessertMenu.add(new MenuItem("Apple Pie", "Apple Pie topped with vanilla ice cream", true, 1.59));
        Waitress waitress = new Waitress(allMenus);
        waitress.printMenu();
    }
}
