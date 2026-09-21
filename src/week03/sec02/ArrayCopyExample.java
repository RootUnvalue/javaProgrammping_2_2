package week03.sec02;

public class ArrayCopyExample {
    public static void main(String[] args) {
        String[] oldStrArray = {"java", "array", "copy"};
        String[] newString = new String[5];
        System.arraycopy(oldStrArray, 0, newString, 0, oldStrArray.length);
        for(String s : newString) {
            System.out.println(s);
        }
    }
}
