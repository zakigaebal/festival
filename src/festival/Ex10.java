package festival;

import java.util.Random;

/*
8칸 크기의 배열을 선언하고 랜덤수로 초기화 한 후
가장 큰 수와 작은 수를 각각 출력하시오.
 */
public class Ex10 {
    public static void main(String[] args) {
        int[] a = new int[8];
        Random rd = new Random();
        int max = 0;
        int min = 100;
        System.out.println("배열에 있는 모든 값: ");
        for (int i = 0; i < a.length; i++) {
            a[i] = rd.nextInt(99)+1;
            System.out.print(a[i] + " ");
            // 가장 큰값 찾기
            if(max<a[i]) max= a[i];
            // 가장 작은값 찾기
            if(min>a[i]) min= a[i];
        }
        System.out.println();
            System.out.println("가장 큰 값 :" + max);
        //비교하기
        System.out.println("가장 작은 값 :"+min);
    }
}
