package models;

public class RecipeManager {

    public static void main(String[] args) {

        Ingredient beef = new Ingredient("Beef", 20, 8.95);
        Ingredient chicken = new Ingredient("Chicken", 20, 6.95);
        Ingredient salmon = new Ingredient("Salmon", 20, 7.95);
        Ingredient mushroom = new Ingredient("Mushrooms", 50, 1.49);

        Recipe testRecipe = new Recipe("Beef and Mushrooms", "Braised beef with sauteed mushrooms",
                16.95);
        testRecipe.addIngredient(beef);
        testRecipe.addIngredient(mushroom);
        System.out.println(testRecipe);

    }
}
