package festival;

import java.util.Scanner;

public class Ex01 {
    /*
    현재몸무게와 목표몸무게를 각각 입력 받고
    주차 별 감량몸무게를 입력 받아 목표 달성 시
    축하 메세지를 띄우는 프로그램을 구현하시오.
     */

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("현재몸무게를 입력해주세요");
        int 현재몸무게 = scanner.nextInt();
        System.out.println("목표몸무게를 입력해주세요");
        int 목표몸무게 = scanner.nextInt();

        int 감량몸무게 = 0;
        while(목표몸무게 <= 현재몸무게){
            System.out.println("감량몸무게 >> ");
            감량몸무게 = scanner.nextInt();
            현재몸무게 -= 감량몸무게;
        }
        System.out.println("다이어트성공을 축하합니다.");



}

}
