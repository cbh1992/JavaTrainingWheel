package Week_02.Collection;

import java.util.LinkedList;

public class Col2 {
    public static void main(String[] args) {
        //Linked List
        //메모리에 잔여공간을 요청, 실제값을 나누어서 저장
        //실제값이있는 주소값으로 목록을 구성, 저장
        //기본적 기능은 ArrayList와 동일하나 LinkedList는 값을 분산하기에 조회속도가 느리다
        //값을 추가, 삭제시에는 빠름

        LinkedList<Integer> linkedList = new LinkedList<Integer>();

        linkedList.add(10);
        linkedList.add(20);
        linkedList.add(30);

        System.out.println(linkedList.get(0));
        System.out.println(linkedList.get(1));
        System.out.println(linkedList.get(2));
        System.out.println(linkedList.toString());

        //리스트 마지막에 값 추가
        linkedList.add(200);
        System.out.println(linkedList.toString());

        //리스트 특정 위치에 값 추가
        linkedList.add(2,4);
        System.out.println(linkedList.toString());

        //리스트 특정 위치의 값 변경
        linkedList.set(1,30);
        System.out.println(linkedList.toString());

        //리스트 특정 값 삭제
        linkedList.remove(1);
        System.out.println(linkedList.toString());

        //리스트 값 전체삭제
        linkedList.clear();
        System.out.println(linkedList.toString() + "값 삭제");
    }
}
