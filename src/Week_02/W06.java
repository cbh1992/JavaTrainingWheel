package Week_02;

public class W06 {
    public static void main(String[] args) {
        //대입연산자 주의점
        int a = 10;
        int b = 10;
        int val = ++a + b--;
        System.out.println(a); //11
        System.out.println(b); //9
        System.out.println(val); //21
        //대입연산자가 앞에 있으면 연산 후 저장
        //대입연산자가 뒤에 있으면 저장 후 연산
    }
}
