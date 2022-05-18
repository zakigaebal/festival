package festival;

import java.util.Scanner;

/*
(세 자리 수) * (세 자리 수)는 다음과 같이 계산된다.
(1), (2)번을 입력 받아 결과 화면처럼 (3), (4), (5), (6)번을 출력하는 프로그램을 작성하시오
 */
public class Ex26 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("첫 번째 숫자 입력 : ");
        int num1 = sc.nextInt();

        System.out.print("두 번째 숫자 입력 : ");
        int num2 = sc.nextInt();

        System.out.println(num1 * (num2%10));
        System.out.println(num1 * ((num2/10)%10));
        System.out.println(num1 * (num2/100));
        System.out.println(num1*num2);

        System.out.println(num1*(num2%10));
        System.out.println(num1*((num2/10)%10));
        System.out.println(num1*(num2/100));
        System.out.println(num1*num2);
    }
}
