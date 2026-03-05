class HeadChef {

    static void cook(String dish) {
        System.out.println("Head Chef cooking: " + dish);
        RecipeBook.getSteps(dish);
    }
}