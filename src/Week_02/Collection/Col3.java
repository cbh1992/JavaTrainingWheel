package Week_02.Collection;
import java.util.Stack;

public class Col3 {
    public static void main(String[] args) {
        //Stack : 수직으로 값을 쌓고 넣었다가 뺀다.  선입후출
        //push, peek, pop
        //최근저장된 데이터 나열, 데이터 중복처리 방지가능
        Stack<Integer> intStack = new Stack<Integer>();
        intStack.push(10);
        intStack.push(15);
        intStack.push(1);

        while (!intStack.isEmpty()){
            //pop : 마지막 저장 스택을 추출하고 삭제
            System.out.println(intStack.pop());
        }
        intStack.push(10);
        intStack.push(15);
        intStack.push(1);
        //peek : 마지막 저장값 하나 출력
        System.out.println(intStack.peek());
    }
}
