package aufgabe1;

import aufgabe1.bird.Bird;
import aufgabe1.food.Food;
import aufgabe1.food.Water;

import java.util.HashMap;
import java.util.Map;

public class Birdhouse {
    Map<Food, Integer> foodToAmountMap = new HashMap<>();

    public void addFood(Food food, int amount) {
        if (foodToAmountMap.containsKey(food)) {
            Integer count = foodToAmountMap.get(food);
            foodToAmountMap.put(food, count + amount);
        } else {
            foodToAmountMap.put(food, amount);
        }
    }

    public Map<Food, Integer> getFoodToAmountMap() {
        return foodToAmountMap;
    }

    public Food visit(Bird bird) {
        if(foodToAmountMap.size()==0){
        return new Water();}
        else if(foodToAmountMap.containsKey(bird.getPreferredFoods())){
        }


            return null;
    }
}
