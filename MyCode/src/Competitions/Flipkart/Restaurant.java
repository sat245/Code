package Competitions.Flipkart;

import java.util.HashMap;
import java.util.Map;

public class Restaurant {
    String name;
    int maxOrder;
    Menu displayMenu = new Menu();
    Map<Integer, Menu> orderMenu = new HashMap<>();
    double rating;

    public boolean canAcceptOrder(Menu order) {
        if (orderMenu.size() < maxOrder) {
            for (Map.Entry<String, Item> obj : order.menu.entrySet()) {
                if (displayMenu.menu.containsKey(obj.getKey())) {

                } else {
                    return false;

                }
            }
            return true;
        }
        return false;
    }

    public static Restaurant updateMenu(Restaurant restaurant, Item item) {
//        Restaurant restaurant = mapOfRestaurants.get(name);

        try {


            Menu menu = restaurant.displayMenu;

            if (menu.menu.containsKey(item.itemName)) {
                Item item1 = menu.menu.get(item.itemName);
                item1.price = item.price;

            } else {
                menu.menu.put(item.itemName, item);
            }
        } catch (Exception e) {
            System.out.println("Updation failed");
        }

        return restaurant;
    }

    public void updateMenu(int orderNumber) {

        orderMenu.remove(orderNumber);
        System.out.println("Order completed");
    }
}
