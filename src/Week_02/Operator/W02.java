package Week_02.Operator;

public class W02 {
    public static void main(String[] args) {
        //사칙연산 +, -, *, /, %
        System.out.println(10 + 5);
        System.out.println(5 - 10);
        System.out.println(4 * 3);
        System.out.println(4 / 2);
        System.out.println(5 / 2);  //나눗셈의 나머지는 구하지 않는다
        System.out.println(4 % 2);
        System.out.println(5 % 2);  //나누기와 다르게 나머지만 구한다

        //우선순위 연산
        System.out.println(2 + 2 * 2);
        System.out.println((2 + 2) * 2);
        System.out.println(2 + (2 * 2));

        //변수연산
        int a = 20;
        int b = 10;
        int c;
        c = a+b;
        System.out.println(c);
        c = a-b;
        System.out.println(c);
        c = a*b;
        System.out.println(c);
        c = a/b;
        System.out.println(c);
        c = a%b;
        System.out.println(c);
    }
}
