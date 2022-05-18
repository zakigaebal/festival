package festival;

import java.util.Scanner;

/*
정수 n을 입력받아
1, 2, 4, 7, 11 과 같은 수열의
n번째 항까지 출력하시오.
 */
public class Ex15 {
    public static void main(String[] args) {
        System.out.print("n 입력 : ");
        Scanner sc = new Scanner(System.in);
        int input = sc.nextInt();
        int k = 0;
        for (int i = 1; i < input; i++) {
            for (int j = 1; j < input+1; j++) {
                System.out.print(i + " ");
                i = i+j;
            }
        }
    }
}
