package models;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.Locale;

public class Recipe {

    private static int idTracking = 0;
    //list of ingredients needed for the recipe
    private ArrayList<Ingredient> ingredientList;


    //list of steps to prepare recipe
    private ArrayList<String> directionList;

    //name of recipe
    private String recipeName;

    private int servingSize;

    private Macro totalMacros;

    private Macro servingMacros;

    //FUTURE - Prep time, cook time, total cook time


    public Recipe(String recipeName, int servingSize) {
        this.recipeName = recipeName;
        this.servingSize = servingSize;
        this.ingredientList = new ArrayList<>();
        this.directionList = new ArrayList<>();
    }

    public void addIngredient(Ingredient ingredient, double ingredientQty) {
        Macro updatedMacros = Macro.macroFactory(ingredient.getMacros(), ingredientQty);
        Ingredient updatedIngredient = new Ingredient(ingredient.getIngredientName(),
                ingredient.getServingWeight(), ingredientQty ,updatedMacros);

        ingredientList.add(updatedIngredient);
    }

    public void addStep(String s) {
        directionList.add(s);
    }

    public void printRecipe() {
        System.out.println(recipeName.toUpperCase());
        System.out.println("Serves: " + servingSize);
        System.out.println();
        System.out.println("Ingredients needed:");
        for (Ingredient i : this.ingredientList) {
            System.out.println(i.getIngredientQty() + " " + i.getIngredientName());
        }
        System.out.println();
        int i = 1;
        for (String s : this.directionList) {
            System.out.println(i++ + ": " + s);
        }
    }


}
