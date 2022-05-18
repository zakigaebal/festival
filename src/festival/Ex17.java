package festival;
/*
숫자를 입력 받아 3의 배수인 숫자를 출력하는 프로그램을 작성하세요.
 */

import java.util.Scanner;

public class Ex17 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int a =1;
        String three = "";
        while(a<=10){
            System.out.print(a+"번째 정수 입력 >>");
            int b = sc.nextInt();
            a++;
            if(b%3==0 && b!=0) three += b+" ";
        }
        System.out.println(three);
    }
}
