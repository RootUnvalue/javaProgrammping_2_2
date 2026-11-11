package week10_02.ch11.sec03.exam03;

public class ExceptionHandlingExample {
    public static void main(String[] args) {
        String[] array = {"100", "1oo", null, "200"};

        for (int i = 0; i < array.length; i++) {
            try {
                int value = Integer.parseInt(array[i]);
                System.out.println(i + " : " + value);
            } catch (ArrayIndexOutOfBoundsException e) {
                System.out.println("Array Index Out Of Bounds " + e.getMessage());
            } catch (NumberFormatException | NullPointerException e) {
                System.out.println("Number Format Or Null Pointer Exception " + e.getMessage());
            }
        }
    }
}
