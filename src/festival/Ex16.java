package festival;

import java.util.Scanner;

/*
8자리 정수를 입력받아 반복문을 활용하여
입력받은 정수의 합을 구하여
출력하는 프로그램을 작성하시오.
 */
public class Ex16 {
    public static void main(String[] args) {
        System.out.print("정수 입력 : ");
        Scanner sc = new Scanner(System.in);
        String a = sc.next();
        String arr[] = a.split("");
        int sum = 0;
        if (arr.length != 8) {
            System.out.println("다시입력");
        } else {
            for (int i = 0; i < arr.length; i++) {
                sum += Integer.parseInt(arr[i]);
            }
            System.out.println("합은" + sum + "입니다.");
        }
    }
}
