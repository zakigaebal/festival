package festival;

public class Ex12 {
    public static void main(String[] args) {
        /*
정수 N을 입력받아 N * N 배열에
다음과 같이 숫자를 저장하고 출력하시오.
         */
        int[] list = new int[25];
        int[][] arr = new int[5][5];
        int k =1;
        // 배열저장
        for (int i = 0; i < 5; i++) {
            for (int j = 0; j < 5; j++) {
                arr[i][j] = k;
                k++;
            }
        }

        for (int j = 0; j < 5; j++) {
        for (int i = 0; i < 5; i++) {
                System.out.print(arr[i][j]+"\t");
            }
            System.out.println();
        }

        }

    }


