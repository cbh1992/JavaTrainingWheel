package Week_02.Collection;

import java.util.LinkedList;
import java.util.Queue;

public class Col4 {
    public static void main(String[] args) {
        //Queue : 선입선출 자료구조
        //add(추가), peek(추출), poll(추출 후 삭제)
        //Queue : 생성자가 없는 인터페이스

        Queue<Integer> intQueue = new LinkedList<Integer>(); //Queue를 선언, 생성
        intQueue.add(1);
        intQueue.add(5);
        intQueue.add(9);
        while (!intQueue.isEmpty()){
            System.out.println(intQueue.poll());
        }
        intQueue.add(1);
        intQueue.add(5);
        intQueue.add(9);
        System.out.println(intQueue.peek());
        System.out.println(intQueue.size());
    }
}
