package festival;
/*
다음과 같은 프로그램을 작성하시오.

A,B 숫자를 입력 받는다.
A-B를 출력한다.
A와 B가 모두 0을 입력 받으면 프로그램이 종료된다.

 */

import java.util.Scanner;

public class bonus1 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int a=1;
        int b=1;
        while (!(a == 0) && !(b ==0))
        {
            System.out.print("A입력 >>");
            a = scanner.nextInt();
            System.out.print("B입력 >>");
            b = scanner.nextInt();
            System.out.print("결과 >> ");
            int print = a - b;
            System.out.print(print);
            System.out.println();
        }
        scanner.close();
    }
}
