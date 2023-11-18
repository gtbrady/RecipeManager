package models;

//Need to figure out a way to make class abstract so I can subclass it
public class Ingredient {
    //using static int variable to initialize ID temporarily
    static int idTracking = 0;

    int ingredientID;
    String ingredientName;
    int stock;
    double price;

    Ingredient(String ingredientName, int stock, double price) {
        ingredientID = idTracking++;
        this.ingredientName = ingredientName;
        this.stock = stock;
        this.price = price;
    }

    public String getIngredientName() {
        return ingredientName;
    }

    public void setIngredientName(String ingredientName) {
        this.ingredientName = ingredientName;
    }

    public int getStock() {
        return stock;
    }

    public void setStock(int stock) {
        this.stock = stock;
    }

    public double getPrice() {
        return price;
    }

    public void setPrice(double price) {
        this.price = price;
    }
}
