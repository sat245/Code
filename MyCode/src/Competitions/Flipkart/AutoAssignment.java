package Competitions.Flipkart;

import java.util.List;
import java.util.Map;

public interface AutoAssignment {
    Restaurant getBestRestaurant(Map<Double, List<Restaurant>> mapBasedOnRating, Menu order);
}
