package festival;

public class Ex06 {
    public static void main(String[] args) {
        int a = 77;
        int b = 1;
        int sum = 0;
        for (int i = 0; i < 77; i++) {
            System.out.print(a +"*");
            System.out.print(b + " ");
            sum += a*b;
            a--;
            b++;
        }
        System.out.println();
        System.out.println(sum);
    }
}
