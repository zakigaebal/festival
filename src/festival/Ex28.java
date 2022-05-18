package festival;

import java.util.Scanner;

/*
문자열 형태의 2진수를 입력받아
10진수로 바꾸는 프로그램을 작성하시오.
 */
public class Ex28 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("2진수 입력 : ");
        String num = sc.next();

        int two = Integer.parseInt(num, 2);
        System.out.println(two);
    }
}
