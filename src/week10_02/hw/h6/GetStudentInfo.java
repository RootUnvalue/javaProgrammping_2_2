package week10_02.hw.h6;

import java.io.*;
import java.nio.charset.StandardCharsets;

public class GetStudentInfo {
    public static void main(String[] args) throws FileNotFoundException {
        try (
            FileInputStream fis = new FileInputStream("./src/week10_02/hw/h6/student.txt");
            InputStreamReader isr = new InputStreamReader(fis, StandardCharsets.UTF_8);
            BufferedReader br = new BufferedReader(isr)
        ) {
            String line;
            while ((line = br.readLine()) != null) {
                System.out.println(line);
            }
        } catch (IOException e) {
            System.out.println("IOException 발생 : " +  e.getMessage());
        } catch (Exception e) {
            System.out.println("발생한 예외 : " + e.getMessage());
        } finally {
            System.out.println("종료.");
        }
    }
}
