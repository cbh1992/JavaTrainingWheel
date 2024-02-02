package Week_02.Collection;
import java.util.ArrayList;

public class Col1 {
    public static void main(String[] args) {
        //List : 순서가 있는 데이터 집합(Array와 유사하나 최초 길이를 몰라도 됨)
        //Array -> 정적배열
        //List(ArrayList) -> 동적배열(크기가 가변적임)
        //생성 시점에 작은 연속된 공간을 요청, 참조형 변수를 저장함
        //값이 추가될때 추가공간을 받아 저장하게 된다

        //선언과 생성을 동시에 처리
        ArrayList<Integer>intList = new ArrayList<Integer>();
        intList.add(1);
        intList.add(2);
        intList.add(3);
        System.out.println(intList.get(1));

        //2번째의 값 교체
        intList.set(1,10);
        System.out.println(intList.get(1));

        //삭제
        intList.remove(1);

        System.out.println(intList.toString());
        intList.clear();//전체삭제
        System.out.println(intList.toString());
    }
}
