package maker;

import menu.MenuItem;
import menu.item.Bread;

public class Baker implements Maker {
    @Override
    public MenuItem service(MenuItem menuItem) {
        System.out.println("제빵사가 " + menuItem.getName() + "을(를) 만들었습니다.");
        return new Bread(menuItem.getName(), menuItem.getPrice());
    }
}
