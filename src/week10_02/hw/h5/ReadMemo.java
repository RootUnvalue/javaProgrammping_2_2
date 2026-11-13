package week10_02.hw.h5;

import java.io.FileReader;
import java.io.IOException;

public class ReadMemo {
    public static void main(String[] args) {
        try (FileReader fr = new FileReader("./src/week10_02/hw/h5/hello.txt")) {
            System.out.print("파일 내용 : ");
            int ch;
            while ((ch = fr.read()) != -1) {
                System.out.print((char) ch);
            }
            System.out.println();
        } catch (IOException e) {
            System.out.println("파일을 읽는데에 실패했습니다. " + e.getMessage());
        } catch (Exception e) {
            System.out.println("발생한 예외 내용 : " + e.getMessage());
        } finally {
            System.out.println("종료합니다.");
        }
    }
}
