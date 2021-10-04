import maker.Baker;
import maker.Barista;
import maker.Maker;
import maker.Patissier;
import menu.MenuCategory;
import menu.MenuItem;

import java.util.HashMap;
import java.util.Map;

public class Order {

    private Map<MenuCategory, Maker> menuController = new HashMap<>();

    public Order() {
        menuController.put(MenuCategory.BREAD, new Baker());
        menuController.put(MenuCategory.COFFEE, new Barista());
        menuController.put(MenuCategory.COOKIE, new Patissier());
    }

    public MenuItem makeOrder(MenuItem menuItem) {
        Maker maker = menuController.get(menuItem.getCategory());
        return maker.service(menuItem);
    }
}
