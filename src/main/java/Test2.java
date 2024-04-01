import java.util.Scanner;
public class Test2 {
    public static void main(String[] args){
        Scanner s = new Scanner(System.in);
        int num;

        num = s.nextInt();

        if (num%3 ==0 && num%5 ==0){
            System.out.print("3의 배수, 5의 배수 모두 만족합니다.");
        } else if (num%5 ==0) {
            System.out.print("5의 배수입니다.");
        } else if (num%3 ==0) {
            System.out.print("3의 배수입니다.");
        } else {
            System.out.print("3의 배수, 5의 배수 모두 만족하지 않습니다.");
        }
    s.close();
    }
}
