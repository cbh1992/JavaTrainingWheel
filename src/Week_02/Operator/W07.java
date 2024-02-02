package Week_02.Operator;

public class W07 {
    public static void main(String[] args) {
        //기타연산자
        //형변환
        int intNum1 = 93 + (int)98.8;
        System.out.println(intNum1); //소수점 탈락
        double doubleNum1 = (double) 93 + 98.8;
        System.out.println(doubleNum1); //소수점 유지

        // 삼항연산자.  비교연산자와 함께 쓰인다.  비교연산자의 결과값에 따라 결정됨
        //조건?참 : 거짓
        int x = 1;
        int y = 9;
        boolean b = (x == y) ? true : false;
        System.out.println(b); //int x, y가 같지 않기에 b에는 false 가 저장됨

        String s = (x != y) ? "트루" : "폴스";
        System.out.println(s);

        int max = (x>y) ? x: y; //x가 y보다 크다면 x값을, 아니라면 y값을 저장(두 수의 크기 비교 가능)
        System.out.println(max);

        int min = (x<y)?x:y;
        System.out.println(min);

        // instance of
        // 피연산자가 조건에 명시된 클래스의 객체인지 비교
        // 맞으면 true, 틀리면 false
    }
}
