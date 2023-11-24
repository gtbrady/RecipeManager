package models;

//Need to figure out a way to make class abstract so I can subclass it
public class Ingredient {
    //using static int variable to initialize ID temporarily
    private static int idTracking = 0;

    //name of ingredient
    private String ingredientName;

    //Serving Size in grams
    private double servingWeight;

    private double ingredientQty;



    private Macro macros;

    //constructor used when adding to recipe
    public Ingredient(String ingredientName, double servingWeight, double ingredientQty, Macro macros) {
        this.ingredientName = ingredientName;
        this.servingWeight = servingWeight;
        this.ingredientQty = ingredientQty;
        this.macros = Macro.macroFactory(macros);
    }

    //constructor used for adding ingredients to ingredient table
    public Ingredient(String ingredientName, double servingWeight, Macro macros) {
        this.ingredientName = ingredientName;
        this.servingWeight = servingWeight;
        this.ingredientQty = 1;
        this.macros = Macro.macroFactory(macros);
    }

    public String getIngredientName() {
        return ingredientName;
    }

    public void setIngredientName(String ingredientName) {
        this.ingredientName = ingredientName;
    }

    public double getServingWeight() {
        return servingWeight;
    }

    public void setServingWeight(double servingWeight) {
        this.servingWeight = servingWeight;
    }

    public Macro getMacros() {
        return macros;
    }

    public void setMacros(Macro macros) {
        this.macros = macros;
    }

    public double getIngredientQty() {
        return ingredientQty;
    }

    public void setIngredientQty(double ingredientQty) {
        this.ingredientQty = ingredientQty;
    }

}
