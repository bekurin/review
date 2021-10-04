package menu.item;

import menu.MenuCategory;
import menu.MenuItem;

public class Bread extends MenuItem {

    public Bread(String name, int price) {
        this.name = name;
        this.price = price;
        this.role = MenuCategory.BREAD;
    }
}
