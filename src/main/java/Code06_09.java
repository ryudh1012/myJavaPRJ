public class Code06_09 {
    public static void main(String[] args) {

        for (int i = 0; i < 3; i++) {
            for (int k = 0; k < 2; k++) {
                System.out.println("난생처음은 쉽습니다.^^" + "(i:" + i + ", k:" + k + ")");
            }

            System.out.println(i + "번째 i 반목문 종료");
        }
        for (int i = 2; i <= 3; i++) {

            for (int j = 1; j <= 9; j++) {
                System.out.println(i + " x " + j + " = " + i * j);
            }
        }
    }
}
