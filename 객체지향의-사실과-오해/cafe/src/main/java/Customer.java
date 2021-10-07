import menu.Menu;
import menu.MenuItem;

import java.util.List;

public class Customer {

    public void order(List<String> menuNames, Menu menu, Order order) {
        for (String menuName : menuNames) {
            System.out.println(menuName + "을 주문했습니다.");
            MenuItem menuItem = menu.choose(menuName);
            MenuItem makeMenu = order.makeOrder(menuItem);

            System.out.println("손님이 " + makeMenu.getName() + "을(를) 받았습니다.");
        }
    }
}
