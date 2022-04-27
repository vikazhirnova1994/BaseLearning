package pattern.behavioral.iterator.menu;

/**
 * @author Victoria Zhirnova
 * @project LearningPattern
 */

public class Waitress {

    PancakeMenu pancakeMenu = new PancakeMenu();
    DinerMenu dinerMenu = new DinerMenu();
    CafeMenu cafeMenu = new CafeMenu();

    public Waitress(PancakeMenu pancakeMenu, DinerMenu dinerMenu, CafeMenu cafeMenu) {
        this.pancakeMenu = pancakeMenu;
        this.dinerMenu = dinerMenu;
        this.cafeMenu = cafeMenu;
    }

    public void printMenu(){
        Iterator pancakeIterator = pancakeMenu.createIterator();
        Iterator dinnerIterator = dinerMenu.createIterator();
        Iterator cafeIterator = cafeMenu.createIterator();
        System.out.println("\nMENU\n----Breakfast----\n");
        print(pancakeIterator);
        System.out.println("\n----Dinner----\n");
        print(dinnerIterator);
        System.out.println("\n----CafeMenu----\n");
        print(cafeIterator);
    }

    private void print(Iterator iterator){
        while (iterator.hasNext()){
            MenuItem menuItem = (MenuItem) iterator.next();
            System.out.print(menuItem.getName() + ", ");
            System.out.println(menuItem.getPrice());
        }
    }
}
