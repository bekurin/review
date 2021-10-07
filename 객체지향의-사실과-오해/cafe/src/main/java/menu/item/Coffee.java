package menu.item;

import menu.MenuCategory;
import menu.MenuItem;

public class Coffee extends MenuItem {

    public Coffee(String name, int price) {
        this.name = name;
        this.price = price;
        this.role = MenuCategory.COFFEE;
    }
}
