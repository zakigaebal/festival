package festival;

import java.util.Scanner;

/*
10진수 정수를 입력받아
2진수로 변환해서 출력하시오.
 */
public class Ex20 {
    public static void main(String[] args) {
    //이로 나눈 나머지?
        System.out.println("숫자 입력 >> ");
        Scanner sc = new Scanner(System.in);
        int num = sc.nextInt();
        String ans = "";

        while(num>0){
            ans = num%2 + ans;
            num /= 2;
        }
//        while (num>0){
//            ans = (num%2) + ans;
//            num /= 2;
//        }
        System.out.println(ans);

//        String binary = Integer.toBinaryString(num);
//        System.out.println(binary);
    }
}
