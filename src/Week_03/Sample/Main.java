package Week_03.Sample;

public class Main {
    public static void main(String[] args) {
        //생략 가능한 내장된 기본 생성자
        Main main = new Main();
        System.out.println(main.getNumber());
        //휘발되지 않는다면 3이 나와야 한다ㅑ
        System.out.println(main.getNumber());
    }

    //메서드 선언
    public int getNumber(){
        //지역(로컬) 변수 <-> 전역변수
        //해당 메서드가 실행 될 때 마다 독립적인 값을 저장, 관리
        //이 지역변수는 메서드 내부에서 정의될떄 생성, 메서드 종료시 소멸
        int num = 1;
        num += 1; // num = num+1
        return num;
    }
}
