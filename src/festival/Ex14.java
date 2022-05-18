package festival;

import java.util.Scanner;

/*
정수 N을 입력받아
N * N 배열에 다음과 같이 숫자를 저장하고 출력하시오.
 */
public class Ex14 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("정수 입력 >>");
        int n = sc.nextInt();
        int[][] arr = new int[n][n];
        int k=1;
        for (int i = 0; i < n; i++) {
            for (int j = 0; j < n; j++) {
                arr[i][j] = k;
                k++;
            }
        }

        for (int i = 0; i < n; i++) {
            for (int j = 0; j < n; j++) {
                System.out.print(arr[i][j]+"\t");
            }
            System.out.println();
        }
    }
}
