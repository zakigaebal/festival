package festival;

import java.util.Scanner;

/*
일한 시간을 입력받아 총 임금을 계산하는 시급계산기입니다.
시급은 5000원이며 8시간보다 초과 근무한 시간에 대해
1.5배의 시급이 책정됩니다.
 */
public class Ex02 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("일한시간을 입력하시오 >> ");
        int 일한시간 = scanner.nextInt();
        int 총임금 = 시급계산(일한시간);
        System.out.println("총임금은 " + 총임금 + "원입니다.");

        scanner.close();
    }

    public static int 시급계산(int 일한시간){
        // 8시간 이상이면 초과지급 아니면 일한만큼지급
        int 시급 = 5000;
        double 초과수당 = (일한시간-8)*(시급*1.5);
        double 총임금 = 일한시간>8 ? 시급*8 + 초과수당 : 일한시간*시급;
        return (int) 총임금;
    }
}
