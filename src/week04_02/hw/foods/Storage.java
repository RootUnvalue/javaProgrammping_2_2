package week04_02.hw.foods;

public class Storage {
    String[] ingredientsName = new String[] {"김치찌개", "된장찌개", "제육볶음", "계란찜"};
    int[] ingredientsQuantity = new int[] {5, 5, 5, 5};

    public void getIngredients() {
        System.out.println("재고 상황");
        for(int i = 0; i < ingredientsName.length; i++) {
            System.out.println(ingredientsName[i] + " : " + ingredientsQuantity[i] + " 개");
        }
    }
    public void useIngredient(int fd, int count) {
        if(count <= ingredientsQuantity[fd]) {
            ingredientsQuantity[fd] -= count;
            System.out.println(ingredientsName[fd] + "를 " + count + " 개 소진하여 " +  ingredientsQuantity[fd] + " 개 남았습니다.");
        } else {
            System.out.println(ingredientsName[fd] + "의 재고가 부족합니다.\n재고 : " +  ingredientsQuantity[fd] + " 개 남았습니다.");
        }
    }
}