package festival;

import java.util.Scanner;

/*
행 개수를 입력 받아 다음과 같이 삼각형을 출력하시오.
 */
public class Ex07 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("행 개수 : ");
        int a = sc.nextInt();
        for (int i = a; i > 0; i--) {
            for (int j = 0; j < i; j++) {
                System.out.print("*");
            }
            System.out.println();
        }







        sc.close();
    }
}
