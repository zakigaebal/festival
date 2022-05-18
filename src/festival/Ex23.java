package festival;
/*
아래와 같은 2차원 배열을 왼쪽으로 90도 회전하여
출력하시오.
 */
public class Ex23 {
    public static void main(String[] args) {
        int[][] arr = new int[5][5];
        int k =1;
            for (int j = 0; j <= 4; j++) {
        for (int i = 4; i >= 0; i--) {
                arr[i][j] = k;
                k++;
            }
        }

        //출력
        for (int i = 0; i < arr.length; i++) {
            for (int j = 0; j < arr[i].length; j++) {
                System.out.print(arr[i][j] + "\t");
            }
            System.out.println();
        }
    }
}
