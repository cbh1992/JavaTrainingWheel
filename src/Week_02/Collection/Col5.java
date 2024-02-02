package Week_02.Collection;

import java.util.HashSet;
import java.util.Set;

public class Col5 {
    public static void main(String[] args) {
        //Set : 집합과 비슷함.  순서와 중복 없음
        //순서가 보장되지 않고 중복을 허용하지 않는 프로그램에서 사용할 수 있음
        //Set 단독 사용가능하나 HashSet, TreeSet 등으로 응용사용 가능
        //Set 은 생성자가 없음
        //HashSet 은 생성자가 있음
        Set<Integer> intSet = new HashSet<>(); //생성 및 선언
        intSet.add(1);
        intSet.add(12);
        intSet.add(5);
        intSet.add(9);
        intSet.add(1);
        intSet.add(12);

        for (Integer value : intSet){
            //Set은 중복을 허용하지 않아 4개만 출력된다
            System.out.println(value);
        }

        //contains : 해당 데이터의 포함여부를 true, false로 출력
        System.out.println(intSet.contains(2));
        System.out.println(intSet.contains(5));
    }
}
