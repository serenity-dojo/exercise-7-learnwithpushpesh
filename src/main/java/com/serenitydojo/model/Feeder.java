package com.serenitydojo.model;

public class Feeder {
    public FoodType feeds(String animal, boolean isPremium) {
        if (animal.equals("Cat")) {
            return (isPremium) ? FoodType.TUNA :   FoodType.CABBAGE;
        } else if (animal.equals("Dog")) {
            return (isPremium) ? FoodType.DELUXE_DOG_FOOD : FoodType.DOG_FOOD;
        }

        return FoodType.UNKNOWN;

    }
}
