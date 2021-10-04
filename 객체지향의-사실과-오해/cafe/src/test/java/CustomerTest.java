import menu.Menu;
import menu.MenuItem;
import menu.item.Bread;
import menu.item.Coffee;
import menu.item.Cookie;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import java.util.ArrayList;
import java.util.List;

class CustomerTest {

    private List<String> menuNames = new ArrayList<>();
    private Menu menu = new Menu();
    private Order order = new Order();

    @BeforeEach
    public void init(){
        MenuItem bread = new Bread("식빵", 4500);
        MenuItem coffee = new Coffee("아메리카노", 3000);
        MenuItem cookie = new Cookie("초코쿠키", 1500);

        menuNames.add(bread.getName());
        menuNames.add(coffee.getName());
        menuNames.add(cookie.getName());

        menu.addMenu(bread);
        menu.addMenu(coffee);
        menu.addMenu(cookie);
    }

    @Test
    public void order() throws Exception {
        //given
        Customer customer = new Customer();

        //when
        customer.order(menuNames, menu, order);
    }

}