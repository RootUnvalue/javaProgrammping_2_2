package week10_02.hw.h3;

public class GetScore {
    public static void main(String[] args) {
        int[] scores = new int[] {100, 78, 58, 59, 93};
        int index = 9;

        try {
            System.out.println("학생 성적을 검색합니다.");
            System.out.println((index + 1) + " 번 학생의 점수 : " + scores[index]);
        } catch (ArrayIndexOutOfBoundsException e) {
            System.out.println("잘못된 배열 위치입니다.");
        } finally {
            System.out.println("성적 검색을 종료합니다.");
        }
    }
}
