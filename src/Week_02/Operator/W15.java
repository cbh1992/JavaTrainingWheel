package Week_02.Operator;

public class W15 {
    public static void main(String[] args) {
        //for (초기값; 조건문; 증가연산)
        for ( int i = 0; i < 4; i++ ){
            System.out.println(i + "번째 출력");
        }

        //향상된 for문
        //기존에는 for구문안에 초기값, 조건문, 증가연산 3개가 들어감
        //향상된 for문은 2개로 줄임
        int[] numbers = {3,6,9,12,15};
        for (int number1 : numbers){
            System.out.println(number1);
        }
        for (int number2=0; number2<numbers.length; number2++){
            System.out.println(numbers[number2]);
        }
    }
}
