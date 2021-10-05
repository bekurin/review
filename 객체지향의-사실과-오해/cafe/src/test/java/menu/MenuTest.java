package menu;

import menu.item.Bread;
import menu.item.Coffee;
import menu.item.Cookie;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import java.util.List;

import static org.junit.jupiter.api.Assertions.assertEquals;

class MenuTest {

    private Menu menu = new Menu();

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
    void viewMenu() throws Exception {
        //given

        //when
        List<MenuItem> menuItems = menu.viewMenu();

        //then
        assertEquals(menuItems.size(), 3);
    }

    @Test
    public void choose() throws Exception {
        //given

        //when
        MenuItem chooseMenu = menu.choose("식빵");

        //then
        assertEquals(chooseMenu.getCategory(), MenuCategory.BREAD);
        assertEquals(chooseMenu.getName(), "식빵");
        assertEquals(chooseMenu.getPrice(), 4500);
    }

    @Test
    public void addMenu() throws Exception {
        //given
        MenuItem coffee = new Coffee("카페라떼", 5000);

        //when
        menu.addMenu(coffee);
        MenuItem chooseMenu = menu.choose("카페라떼");
        List<MenuItem> menuItems = menu.viewMenu();

        //then
        assertEquals(menuItems.size(), 4);
        assertEquals(chooseMenu.getCategory(), coffee.getCategory());
        assertEquals(chooseMenu.getName(), coffee.getName());
        assertEquals(chooseMenu.getPrice(), coffee.getPrice());
    }
}