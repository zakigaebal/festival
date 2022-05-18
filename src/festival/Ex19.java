package festival;

import java.util.Scanner;

/*
단 수와 곱해지길 원하는 수를

입력하여 이와 같이 출력되게 하시오

 */
public class Ex19 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("단수 입력 : ");
        int a = sc.nextInt();
        System.out.println("어느 수 까지 출력 : ");
        int b = sc.nextInt();
        System.out.println(a + "단");
        for (int i = 1; i <= b; i++) {
            System.out.println(a+ "*" + i + "=" +(a*i));
            
        }

    }
}
