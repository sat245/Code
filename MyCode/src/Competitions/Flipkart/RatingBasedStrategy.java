package Competitions.Flipkart;

import java.util.List;
import java.util.Map;

public class RatingBasedStrategy implements AutoAssignment {
    @Override
    public Restaurant getBestRestaurant(Map<Double,List<Restaurant>> mapBasedOnRating,Menu order) {
        for(double i=5;i>=0;i--){
            if(mapBasedOnRating.containsKey(i)) {
                List<Restaurant> restaurantList = mapBasedOnRating.get(i);

                for (int j = 0; restaurantList!=null && j < restaurantList.size(); j++) {

                    Restaurant restaurant = restaurantList.get(j);
                    if (restaurant.canAcceptOrder(order)) {
                        int size = restaurant.orderMenu.size();
                        restaurant.orderMenu.put(size + 1, order);
                        System.out.println("Order number is"+size);
                        return restaurant;
                    }
                }
            }
            }
        return null;

        }

    }
