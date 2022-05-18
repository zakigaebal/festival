package festival;
/*
1-2+3-4+…+99-100 를 계산하여
답을 출력하시오.
 */
public class Ex03 {
    public static void main(String[] args) {
        int sum = 0;
        for (int i = 1; i <= 100; i++) {
            if(i%2==1)
            {
                System.out.print(i + " ");
                sum += i;
            }
            else
            {
                System.out.print(-i + " ");
                sum += -i;
            }
        }
        System.out.println("\n결과 : " + sum);
    }
}
