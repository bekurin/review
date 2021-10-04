package menu.item;

import menu.MenuCategory;
import menu.MenuItem;

public class Cookie extends MenuItem {

    public Cookie(String name, int price) {
        this.name = name;
        this.price = price;
        this.role = MenuCategory.COOKIE;
    }
}
