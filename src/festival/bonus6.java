package festival;
/*
2개의 정수 base, n을 받아 base의 n제곱 만큼
값을 반환하는 powerN() 메소드를 작성하세요
 */
public class bonus6 {
    public static void main(String[] args) {
        int base = 2;
        int n = 3;
        int result = powerN(base, n);
        System.out.println("결과 확인 : "+result);

    }
    public static int powerN(int num1,int num2) {
        double result = Math.pow(num1, num2);
        return (int) result;
    }
}

