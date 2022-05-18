package festival;
//String score = “A,A,B,C,D,A,C,D,D,D,F”
/*
아래와 같이 학생들의 성적정보가 문자열로
선언되어 있을 때 각 성적 별 학생 수를 출력하시오.
 */
public class Ex13 {
    public static void main(String[] args)
    {
        String score = "A,A,B,C,D,A,C,D,D,D,F";
        String[] spl = score.split(",");
        int a = 0;
        int b = 0;
        int c = 0;
        int d = 0;
        int f = 0;

        for (int i = 0; i < spl.length; i++) {
            //System.out.println(spl[i]);
            if(spl[i].equals("A")) a++;
            if(spl[i].equals("B")) b++;
            if(spl[i].equals("C")) c++;
            if(spl[i].equals("D")) d++;
            if(spl[i].equals("F")) f++;

        }
        System.out.println("A : "+a+"명");
        System.out.println("B : "+b+"명");
        System.out.println("C : "+c+"명");
        System.out.println("D : "+d+"명");
        System.out.println("F : "+f+"명");
    }
}
