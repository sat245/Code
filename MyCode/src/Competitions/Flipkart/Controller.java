package Competitions.Flipkart;

import java.util.*;

public class Controller {
    public static Map<String,Restaurant> mapOfRestaurants= new HashMap();
    public static Map<Double,List<Restaurant>> mapBasedOnRating = new HashMap<>();

    public static  void main(String [] args){

        try {
            System.out.println("Start onBoarding");
            Restaurant restaurant = onBoard();
            mapOfRestaurants.put(restaurant.name, restaurant);
            List list = mapBasedOnRating.get(restaurant.rating);
            if (list == null) {
                list = new ArrayList();
            }
            list.add(restaurant);
            mapBasedOnRating.put(restaurant.rating, list);

            printDisplayMenuAll(restaurant);

            Restaurant restaurant1 = onBoard();
            mapOfRestaurants.put(restaurant1.name, restaurant1);
            List list1 = mapBasedOnRating.get(restaurant1.rating);
            list.add(restaurant1);
            mapBasedOnRating.put(restaurant1.rating, list1);

            printDisplayMenuAll(restaurant1);

            System.out.println("Start Updating restaurant menu");
            Scanner scanner = new Scanner(System.in);
            System.out.println(" restaurant name");
            String name = scanner.next();
            if(mapOfRestaurants.containsKey(name)) {
                System.out.println(" item name");

                Item item = new Item();
                item.itemName = scanner.next();
                System.out.println(" item price");

                item.price = scanner.nextDouble();

                Restaurant res = mapOfRestaurants.get(name);
                res.updateMenu(res, item);
                //  res.updateMenu(res,item);

                printDisplayMenuAll(res);
            }else {
                System.out.println("We dont have any such restaurants ");
            }

            System.out.println("Place Order");
            System.out.println("user name");
            String username = scanner.next();
            System.out.println("How many items to order");
            Integer count = scanner.nextInt();
            Menu orderNow = new Menu();
            for (int i = 0; i < count; i++) {
                Item item1 = new Item();
                System.out.println("Item name");

                item1.itemName = scanner.next();
                System.out.println("Item quantity");

                item1.quantity = scanner.nextInt();

                orderNow.menu.put(item1.itemName, item1);
            }

            System.out.println("Selection type");
            System.out.println(java.util.Arrays.asList(StrategyName.values()));

            String selectiontype = scanner.next();
            if (selectiontype.equals(StrategyName.RATINGBASED)) {
                // for now default
            }

            AutoAssignment autoAssignment = new RatingBasedStrategy();
            Restaurant restaurant2 = autoAssignment.getBestRestaurant(mapBasedOnRating, orderNow);
            if (restaurant2 != null) {
                System.out.println("Order Placed to " + restaurant2.name);
                printOrderMenuAll(restaurant2);
            } else {
                System.out.println("no matching restaurant");

            }


            System.out.println("Complete order");
            System.out.println("Enter restaurant name");

            String rest = scanner.next();
            Restaurant restaurant3 = mapOfRestaurants.get(rest);

            System.out.println("Order number to be removed");
            int orderNum = scanner.nextInt();
            restaurant3.updateMenu(orderNum);
            printOrderMenuAll(restaurant3);
        }catch (InputMismatchException e){
            System.out.println("Wrong input given");
        }

    }

    public static Restaurant onBoard(){
        Scanner scan = new Scanner(System.in);
        Restaurant restaurant = new Restaurant();
        try {
            System.out.println("Restaurant name");
             restaurant.name = scan.next();

            System.out.println("Max order capacity");
                restaurant.maxOrder = scan.nextInt();
                for(int i=0;i<restaurant.maxOrder;i++){
                    Item item = new Item();
                    System.out.println("Item name");
                    item.itemName = scan.next();

                    System.out.println("Item Price in double");
                    item.price = scan.nextDouble();

                    restaurant.displayMenu.menu.put(item.itemName,item);
                }

            System.out.println("Rating of restaurant");
                restaurant.rating = scan.nextDouble();

            System.out.println("Onboarded");


        }
        catch (Exception e){
            System.out.println("ONboarding failed");

        }
        return restaurant;



    }

    public static void printDisplayMenuAll(Restaurant rest) {
        System.out.println("name "+rest.name);
        System.out.println("maxOrder "+rest.maxOrder);
        System.out.println("rating "+rest.rating);

        for (Map.Entry<String, Item> obj : rest.displayMenu.menu.entrySet()) {
            System.out.println("Item name "+obj.getKey());
        }
    }

    public static void printOrderMenuAll(Restaurant rest) {
        System.out.println("name"+rest.name);
        System.out.println("Current number of orders"+rest.orderMenu.size());
        for (int i = 1; i <= rest.orderMenu.size(); i++) {
            Menu menu1 = rest.orderMenu.get(i);
        for (Map.Entry<String, Item> obj : menu1.menu.entrySet()) {
            System.out.println("Item name "+obj.getKey());
        }
        }

    }
}
