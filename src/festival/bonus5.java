package festival;

import java.util.Arrays;
import java.util.Scanner;

/*
5개의 정수를 입력 받아
오름차순 정렬하여 출력하는 프로그램을 구현하시오.
 */
public class bonus5 {
    public static void main(String[] args) {
        int[] arr = new int[5];
        Scanner sc = new Scanner(System.in);
        for (int i = 0; i < arr.length; i++) {
            System.out.print((i + 1) + "번째 수 입력 : ");
            arr[i] = sc.nextInt();
        }
       // Arrays.sort(arr);
//        sortAcendingArr(arr);
        adsd(arr);

        System.out.println("정렬 후 : ");
        for (int i : arr) {
            System.out.print(i + " ");
        }
    }

    public static void adsd(int[] arr){
        for (int i = 0; i < arr.length; i++) {
            for (int j = 0; j < arr.length - 1 - i; j++) {
                if(arr[j]>arr[j+1]){
                    int temp = arr[j];
                    arr[j] = arr[j+1];
                    arr[j+1] = temp;
                }
            }
        }
    }

    public static void accendingArr(int[] arr){
        for (int i = 0; i < arr.length; i++) {
            for (int j = 0; j < arr.length - 1 - i; j++) {
                if(arr[j]>arr[j+1])
                {
                    int temp = arr[j];
                    arr[j] = arr[j+1];
                    arr[j+1] = temp;
                }
            }

        }
    }


}