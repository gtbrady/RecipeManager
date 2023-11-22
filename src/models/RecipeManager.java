package models;

public class RecipeManager {

    public static void main(String[] args) {

        //testing app logic prior to GUI
        //user will enter ingredient name and macros for ingredient on ingredient screen
        Macro eggMacros = new Macro(78, 0.6, 6, 5);
        Macro mayoMacros = new Macro(95, 0.1, 0.1, 10);
        Macro mustardMacros = new Macro(5, 0.3, 0.2, 0.3);

        Ingredient egg = new Ingredient("Egg", 50, eggMacros);
        Ingredient mayo = new Ingredient("Mayonnaise", 14, mayoMacros);
        Ingredient mustard = new Ingredient("Mustard", 5, mustardMacros);

        //once ingredients are added to table, user can begin creating recipe

        Recipe deviledEggs = new Recipe("Deviled Eggs", 6);


        String step1 = "Bring a pot of water to a boil. Reduce the heat to low (or off) to ensure " +
                "the water is no longer boiling or has bubbles and use a skimmer to place the eggs " +
                "in the water. Then increase the heat back to high and set a timer for 14 minutes.";

        String step2 = "While the eggs are boiling prepare an ice water bath and set aside. " +
                "After 14 minutes, remove the eggs from the water and place in the ice water bath.";

        String step3 = "Once the eggs have cooled completely, peel them and slice in half lengthwise. " +
                "Remove the yolk to a small bowl with a spoon and place the egg whites on a plate.";

        String step4 = "Mash the yolks with a fork and add the mayonnaise, mustard, vinegar, salt and pepper." +
                " Stir everything together until it's smooth.";

        String step5 = "Use a spoon to add a portion of the deviled egg mixture back into the hole of each egg" +
                " white. Sprinkle on paprika for garnish.";


    }
}
