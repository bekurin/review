package maker;

import menu.MenuItem;
import menu.item.Cookie;

public class Patissier implements Maker {

    @Override
    public MenuItem service(MenuItem menuItem) {
        System.out.println("제과사가 " + menuItem.getName() + "을(를) 만들었습니다.");
        return new Cookie(menuItem.getName(), menuItem.getPrice());
    }
}
