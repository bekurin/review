package menu;

import java.util.ArrayList;
import java.util.List;

public class Menu {

    private List<MenuItem> items = new ArrayList<>();

    public void addMenu(MenuItem menuItem) {
        items.add(menuItem);
    }

    public void viewMenu() {
        for (MenuItem item : items) {
            System.out.println(item.getName() + ", " + item.getPrice() + "원");
        }
    }

    public MenuItem choose(String menuName) {
        for (MenuItem item : items) {
            if (item.getName().equals(menuName)) {
                return item;
            }
        }
        return null;
    }
}
