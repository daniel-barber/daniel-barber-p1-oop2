package aufgabe2;

import aufgabe1.bird.Bird;
import aufgabe1.food.Food;
import aufgabe1.food.Water;

import java.util.HashMap;
import java.util.Map;

// TODO Klasse, Variablen und alle Methoden generisch machen, sodass Objekt wie folgt instanziiert werden kann: Birdhouse<Woodpecker, Nut> birdhouse = new Birdhouse<>();
public class Birdhouse<GenericBird extends Bird, GenericFood extends Food> {

    Map<GenericFood, Integer> foodToAmountMap = new HashMap<>();

    public void addFood(GenericFood food, int amount) {
        foodToAmountMap.put(food, amount);
    }

    public void feed(GenericBird bird, GenericFood food) {
        bird.getEaten().add(food);
    }

    public static <GenericBird extends Bird> void feedWater(GenericBird bird) {
        bird.getEaten().add(new Water());
    }

    public Map<GenericFood, Integer> getFoodToAmountMap() {
        return foodToAmountMap;
    }
}
