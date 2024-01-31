package Week_02;

public class W04 {
    public static void main(String[] args) {
        //논리연산자는 비교연산자의 결과를 받을수 있는 boolean 값을 연결하는 연산자
        //조건 연결시 boolean 값을 조합하여 true, false 값을 출력
        //&&(and), ||(or), !(not)

        boolean flag1 = true;
        boolean flag2 = true;
        boolean flag3 = false;

        System.out.println(flag1);
        System.out.println(flag2);
        System.out.println(flag3);
        System.out.println("---------------");
        //피연산자 중 하나라도 true라면 true
        System.out.println(flag1 || flag2);
        System.out.println(flag1 || flag2 || flag3);
        System.out.println("---------------");
        //피연산자가 모두 true이면 true
        System.out.println(flag1 && flag2);
        System.out.println(flag1 && flag2 && flag3);
        System.out.println("---------------");

        System.out.println((5>3) && (3>1));
        System.out.println((5>3) && (3<1));
        System.out.println((5>3) || (3<1));
        System.out.println((5>3) || (3>1));
        System.out.println((5<3) || (3<1));
        System.out.println("---------------");
//        //3개 이상을 동시비교는 불가
//        System.out.println(1<3<5);
        //true, false 값을 뒤집는 NOT 연산자
        System.out.println(!flag1);
        System.out.println(!flag2);
        System.out.println(!flag3);

    }
}
