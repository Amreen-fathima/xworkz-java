class RecipeBook {

    static void getSteps(String dish) {
        System.out.println("Getting recipe steps for: " + dish);
        IngredientList.checkStock(dish);
    }
}