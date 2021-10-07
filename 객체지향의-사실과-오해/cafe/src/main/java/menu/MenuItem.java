package menu;

public class MenuItem {

    protected String name;
    protected int price;
    protected MenuCategory role;

    public String getName() {
        return name;
    }

    public int getPrice() {
        return price;
    }

    public MenuCategory getCategory() {
        return role;
    }
}
