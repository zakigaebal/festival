package festival;

import java.util.Random;
import java.util.Scanner;

//중복이 없이 숫자를 뽑는 로또 프로그램을 만드시오
public class Ex18 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        Random rd = new Random();
        int[] a = new int[6];
        for (int i = 0; i < a.length; i++) {
            a[i] = rd.nextInt(45)+1;

            for (int j = 0; j < i; j++) {
                if(a[i] == a[j]){
                    i--;
                    break;
                }
            }
        }
        // 출력
        for (int i = 0; i < 6; i++) {
            System.out.println("행운의 숫자 : " + a[i]);
        }


    }
}
/*
//스캐너
        Scanner scanner = new Scanner(System.in);
        // 랜덤
        Random rd = new Random();
        // 배열선언
        int[] a = new int[6];
        //저장
        for (int i = 0; i < 6; i++) {
            a[i] = rd.nextInt(6)+1;
            // 중복확인
            for  (int j = 0; j < i; j++) {
                    if(a[i]==a[j]){
                    i--;
                    break;
                }
            }
        }
 */