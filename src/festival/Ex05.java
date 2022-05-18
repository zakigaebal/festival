package festival;

import java.util.Scanner;

/*
행 개수를 입력 받아 다음과 같이 삼각형을 출력하시오.
 */
public class Ex05 {
    public static void main(String[] args) {
        System.out.println("행개수 : ");
        Scanner scanner = new Scanner(System.in);
        int num = scanner.nextInt();
        String star = "";
        for (int i = 0; i < num; i++) {
            star += "*";
            System.out.println(star);
        }
        scanner.close();
    }
}
