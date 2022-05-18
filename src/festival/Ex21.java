package festival;
/*
아래와 같이 숫자가 담긴 1차원 배열이 주어졌을 때,
두 개의 숫자를 뽑아 서로의 거리를 비교한 후
거리가 가장 작은 숫자의 위치(index)를 출력하시오.
 */
public class Ex21 {
    public static void main(String[] args) {


        int[] point = {92,32,52,9,81,2,68};

        int min = Math.abs(point[0]-point[1]);
        int a = 0;
        int b= 0;
        for (int i = 0; i < point.length; i++) {
            for (int j = 0; j < point.length; j++) {
                if(i!=j){
                    if(min>Math.abs(point[i]-point[j])){
                        min = Math.abs(point[i]-point[j]);
                        a=i;
                        b=j;
                    }
                }
            }
        }
                System.out.println(a+","+b);
//        int min = Math.abs(point[0]-point[1]);
//        int a = 0;
//        int b = 0;
//        for (int i = 0; i < point.length; i++) {
//            for (int j = 0; j < point.length; j++) {
//                if(i!=j)
//                {
//                    if (min > Math.abs(point[i] - point[j]))
//                    {
//                        min = Math.abs(point[i] - point[j]);
//                        a = i;
//                        b = j;
//                    }
//                }
//            }
//        }
//        System.out.println(a + "," +b);
    }
}
