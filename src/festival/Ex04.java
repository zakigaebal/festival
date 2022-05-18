package festival;

import java.util.Scanner;

/*
거스름돈을 입력 받아 내어줘야 하는 지폐의 개수를 출력하는
프로그램을 작성하시오.
단, 최대단위는 10000원, 최소단위는 100원
 */
public class Ex04 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("총 금액 입력 : " );
        int 총금액 = scanner.nextInt();
        잔돈계산(총금액);
        scanner.close();
    }

    public static void 잔돈계산(int 총금액){
        System.out.println();
        System.out.println("잔돈 입력 " + 총금액 + "원");
        int 만원 = 총금액/10000;
        int 오천원 = 총금액%10000/5000;
        int 천원 = 총금액%10000%5000/1000;
        int 오백원 = 총금액%10000%5000%1000/500;
        int 백원 = 총금액%10000%50000%10000%500/100;
        System.out.println("10000원 : " + 만원+"개");
        System.out.println("5000원 : " + 오천원+"개");
        System.out.println("1000원 : " + 천원+"개");
        System.out.println("500원 : " + 오백원+"개");
        System.out.println("100원 : " + 백원+"개");
    }
}
