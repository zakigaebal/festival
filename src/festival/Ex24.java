package festival;

import java.util.Scanner;

/*
다음과 같은 프로그램을 작성하시오.
N과 X를 입력 받는다.
N개의 정수를 입력 받는다.
N개의 숫자 중 X보다 작은 수만 출력 한다.
 */
public class Ex24 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("N 입력 >> ");
        int a = sc.nextInt();
        System.out.println("X 입력 >> ");
        int b= sc.nextInt();
        int[] arr = new int[a];
        for (int i = 0; i < arr.length; i++) {
            System.out.println(i+1 + "번째 정수 입력 >> ");
            int input = sc.nextInt();
            arr[i] = input;
        }

        System.out.print("결과 : ");
        for (int i = 0; i < arr.length; i++) {
            if(arr[i]<b){
                System.out.print(arr[i] + " ");
            }
        }
    }
}
