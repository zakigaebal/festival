package festival;
// 다음과 같은 결과를 출력하시오
public class Ex22 {

    public static void main(String[] args) {
    String[][] arr = new String[5][5];
        for (int i = 0; i < arr.length; i++) {
            for (int j = 0; j < arr.length; j++) {
                if(i+j>3)
                {
                    arr[i][j] = "*";
                }
                else arr[i][j] = "";
                    System.out.print(arr[i][j] + "\t");
            }
            System.out.println();
        }
    }
}
