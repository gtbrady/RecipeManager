package models;

//Need to figure out a way to make class abstract so I can subclass it
public class Ingredient {
    //using static int variable to initialize ID temporarily
    private static int idTracking = 0;

    //name of ingredient
    private String ingredientName;

    //Serving Size in grams
    private double servingWeight;

    private Macro macros;

    public Ingredient(String ingredientName, double servingWeight, Macro macros) {
        this.ingredientName = ingredientName;
        this.servingWeight = servingWeight;
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
}
