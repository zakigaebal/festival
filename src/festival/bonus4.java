package festival;

import java.util.Scanner;

/*
사용자에게 입력받아 배열의
인덱스의 수 만큼 별을 출력해보세요.
 */
public class bonus4 {
    public static void main(String[] args) {
        int[] arr = new int[5];
            int starCount = 0;
        Scanner scanner = new Scanner(System.in);

        //저장
        for (int i = 0; i < arr.length; i++) {
            System.out.print(i + "번째 별의 수 : ");
            starCount = scanner.nextInt();
            arr[i] = starCount;
        }

        //출력
        for (int i = 0; i < arr.length; i++) {
            System.out.print(arr[i] + ": ");
            for (int j = 0; j < arr[i]; j++) {
                System.out.print("*");
            }
            System.out.println();
        }
    }
}
