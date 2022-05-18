package festival;

import java.util.Scanner;

/*
정수를 입력받아
1의 자리에서 반올림 한 결과를 출력하시오.
 */
public class Ex08 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("숫자입력 : ");
        int a = sc.nextInt();
        System.out.print("반올림 : ");
        if(a%10 >= 5){
            System.out.println((a/10+1)*10);
        }
        else{
            System.out.println(a/10*10);
        }
    }
}
