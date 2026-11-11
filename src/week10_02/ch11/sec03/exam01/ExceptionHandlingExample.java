package week10_02.ch11.sec03.exam01;

public class ExceptionHandlingExample {
    public static void main(String[] args) {
        String[] array = {"100", "1oo"};

        for(int i = 0; i < array.length; i++){
            try {
                int value = Integer.parseInt(array[i]);
                System.out.println(i + " : " + value);
            } catch (ArrayIndexOutOfBoundsException e) {
                System.out.println("Array Index Out Of Bounds " + e.getMessage());
            } catch (NumberFormatException e) {
                System.out.println("Number Format Exception " + e.getMessage());
            }
        }
    }
}
