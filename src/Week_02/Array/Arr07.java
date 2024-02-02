package Week_02.Array;

public class Arr07 {
    public static void main(String[] args) {
        //가변배열(배열의 길이 생략)
        int[][] array = new int[3][];

        //배열 원소마다 각기 다른 크기로 지정
        array[0] = new int[2];
        array[1] = new int[4];
        array[2] = new int[1];

        //중괄호로 초기화할때도 가능
        int[][] array2 = {
                {1,2},
                {1,2,3,4},
                {1}
        };
    }
}
