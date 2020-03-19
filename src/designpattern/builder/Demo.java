package designpattern.builder;

/**
 * @author zq.huang
 * @date 2020/3/18
 */
public class Demo {

    public static void main(String[] args) {
        MealBuilder mealBuilder = new MealBuilder();

        Meal vegMeal = mealBuilder.prepareVegMeal();
        System.out.println("Veg Meal");
        vegMeal.showItems();
        System.out.println("Total Cost:" + vegMeal.getCost());

        Meal nonVegMeal = mealBuilder.prepareNonVagMeal();
        System.out.println("\n\n Non-veg Meal");
        nonVegMeal.showItems();

        System.out.println("Total Cost:" + nonVegMeal.getCost());
    }
}
