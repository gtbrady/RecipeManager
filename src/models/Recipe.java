package models;

import java.util.ArrayList;

public class Recipe {
    //list of ingredients needed for the recipe
    ArrayList<Ingredient> ingredientList;
    //using static int variable to initialize ID temporarily
    static int idTracking = 0;
    private int recipeID;

    private String recipeName;

    //description of recipe
    private String recipeDescription;

    //price the recipe is sold for in the restaurant
    private double recipeRetailPrice;
    // total cost of ingredients
    private double recipeCost;
    // profit margin for recipe (retail price - recipe cost
    private double recipeProfit;

    Recipe(String recipeName, String recipeDescription, double recipeRetailPrice) {
        this.recipeID = idTracking++;
        this.recipeName = recipeName;
        this.recipeDescription = recipeDescription;
        this.recipeRetailPrice = recipeRetailPrice;

    }

    Recipe(String recipeName, String recipeDescription, double recipeRetailPrice, ArrayList<Ingredient> list) {
        this.recipeID = idTracking++;
        this.recipeName = recipeName;
        this.recipeDescription = recipeDescription;
        this.recipeRetailPrice = recipeRetailPrice;
        this.ingredientList.addAll(list);

    }

    public String getRecipeName() {
        return recipeName;
    }

    public void setRecipeName(String recipeName) {
        this.recipeName = recipeName;
    }

    public String getRecipeDescription() {
        return recipeDescription;
    }

    public void setRecipeDescription(String recipeDescription) {
        this.recipeDescription = recipeDescription;
    }

    public double getRecipeRetailPrice() {
        return recipeRetailPrice;
    }


    public double getRecipeCost() {
        return recipeCost;
    }


    public double getRecipeProfit() {
        return recipeProfit;
    }

    public void addIngredient(Ingredient ingredient) {
        ingredientList.add(ingredient);


    }

    public double calculateIngredientCost(ArrayList<Ingredient> ingredientList) {
        double totalCost = 0;
        for (Ingredient i : ingredientList) {
            totalCost += i.getPrice();
        }
        return totalCost;
    }


}
