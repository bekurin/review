package maker;

import menu.MenuItem;
import menu.item.Coffee;

public class Barista implements Maker {

    @Override
    public MenuItem service(MenuItem menuItem) {
        System.out.println("바리스타가 " + menuItem.getName() + "을(를) 만들었습니다.");
        return new Coffee(menuItem.getName(), menuItem.getPrice());
    }
}
