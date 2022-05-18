package festival;

import java.util.Scanner;

/*
그림과 같이 대시(‘_’)문자로 구성된 형태의 숫자를
주어진 숫자와 같이 출력하고 싶을때 사용되게 되는
대시의 개수를 출력하는 프로그램을 작성하라
 */
public class Ex25 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("첫자리 0을 제외한 숫자입력");
        int num = sc.nextInt();
        System.out.print("대시('-')의 총합 >> ");
        System.out.println(Number(num));
    }

    public static int Number(int num) {
        int result = 0;
        int[] arr = {6,2,5,5,4,5,6,4,7,6};
        while(num>0) {
            int num2 = num%10;
            num/=10;
            result+=arr[num2];
        }return result;
    }
}
