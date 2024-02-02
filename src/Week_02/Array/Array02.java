package Week_02.Array;

import java.util.Arrays;

public class Array02 {
    public static void main(String[] args) {
        //초기화

        //배열에 특정값 대입하여 선언
        int[] intArray = {1,2,3,4,5};
        String[] stringArray = {"a", "b", "c"};

        //for문을 통한 대입
        for (int i=0; i<intArray.length; i++){
            intArray[i] = i;
        }
        //다건출력
//        for (int i = 0; i<intArray.length; i++){
//            System.out.println(intArray[i]);
//        }

        //향상된 for문
        for(int j: intArray) {
            System.out.println(j);
        }

        //배열의 주소를 모두 같은 값으로 초기화
        Arrays.fill(intArray, 1);
    }
}
