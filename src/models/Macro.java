package models;

public class Macro {
    private double calories;
    private double carbs;
    private double protein;
    private double fat;

    public Macro(double calories, double carbs, double protein, double fat) {
        this.calories = calories;
        this.carbs = carbs;
        this.protein = protein;
        this.fat = fat;
    }

    public static Macro macroFactory(Macro macros) {
        return  new Macro(macros.getCalories(), macros.getCarbs(), macros.getProtein(), macros.getFat());
    }

    public static Macro macroFactory(Macro macros, double servingSizeFactor) {
        return new Macro(macros.getCalories() * servingSizeFactor, macros.getCarbs() * servingSizeFactor,
                macros.getProtein() * servingSizeFactor, macros.getFat() * servingSizeFactor);

    }


    public double getCalories() {
        return calories;
    }

    public void setCalories(double calories) {
        this.calories = calories;
    }

    public double getCarbs() {
        return carbs;
    }

    public void setCarbs(double carbs) {
        this.carbs = carbs;
    }

    public double getProtein() {
        return protein;
    }

    public void setProtein(double protein) {
        this.protein = protein;
    }

    public double getFat() {
        return fat;
    }

    public void setFat(double fat) {
        this.fat = fat;
    }
}
