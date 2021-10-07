import menu.Menu;
import menu.MenuItem;
import menu.item.Bread;
import menu.item.Coffee;
import menu.item.Cookie;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import java.util.ArrayList;
import java.util.List;

import static org.junit.jupiter.api.Assertions.*;

class OrderTest {

    private Menu menu = new Menu();
    private Order order = new Order();

    @BeforeEach
    public void init() {
        MenuItem bread = new Bread("식빵", 4500);
        MenuItem coffee = new Coffee("아메리카노", 3000);
        MenuItem cookie = new Cookie("초코쿠키", 1500);

        menu.addMenu(bread);
        menu.addMenu(coffee);
        menu.addMenu(cookie);
    }
    
    @Test
    public void makeOrder() throws Exception {
        //given
        MenuItem choose = menu.choose("식빵");

        //when
        MenuItem makeMenu = order.makeOrder(choose);

        //then
        assertEquals(makeMenu.getName(), choose.getName());
        assertEquals(makeMenu.getPrice(), choose.getPrice());
        assertEquals(makeMenu.getCategory(), choose.getCategory());
    }
}