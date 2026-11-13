package week10_02.hw.h7;

import java.io.FileReader;
import java.io.IOException;

public class OpenFile {
    final static String PATH = "./src/week10_02/hw/h7/";

    public static void main(String[] args) {
        try {
            System.out.println("파일을 읽어 들이는 중..");
            openFile("memo.txt");
        }  catch (IOException e) {
            System.out.println("IOException : " + e.getMessage());
        } catch (Exception e) {
            System.out.println("발생한 예외 : " + e.getMessage());
        } finally{
            System.out.println("프로그램 종료");
        }
    }

    static FileReader openFile(String filename) throws IOException {
        return new FileReader(PATH + filename);
    }
}
