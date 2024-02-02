package Week_02.Collection;

import java.util.HashMap;
import java.util.Map;

public class Col6 {
    public static void main(String[] args) {
        //Map : Key - Value 값이 쌍으로 움직임
        //Key 값은 단일이 보장되어야 함
        //Map 또한 HashMap, TreeMap 응용 가능
        Map<String, Integer> intMap = new HashMap<>();
        //Key 세팅
        intMap.put("일", 1);
        intMap.put("이", 1);
        intMap.put("삼", 1);
        intMap.put("삼", 2); //중복 Key
        //Key값 전체출력
        for(String key : intMap.keySet()){
            System.out.println(key);
        }
        for(Integer value : intMap.values()){
            //키값이 중복될 경우 마지막 값으로 덮어쓰기됨
            System.out.println(value);
        }
        //Key 값으로 value 값을 추출하기
        System.out.println(intMap.get("삼"));
    }
}
