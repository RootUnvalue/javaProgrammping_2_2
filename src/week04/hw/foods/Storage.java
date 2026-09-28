package week04.hw.foods;

import java.util.Arrays;

public class Storage {
    String[] ingredientsName = new String[] {"양배추", "배추", "양파", "파"};
    int[] ingredientsQuantity = new int[] {1000, 1000, 1000, 1000};

    public void getIngredients() {
        System.out.println("재고");
        System.out.println(Arrays.toString(ingredientsName));
        System.out.println(Arrays.toString(ingredientsQuantity));
    }

}