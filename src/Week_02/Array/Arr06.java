package Week_02.Array;

public class Arr06 {
    public static void main(String[] args) {
        //다차원 배열.  반복문을 통한 초기화
        int[][] array = new int[2][3];

        for (int i = 0; i<array.length; i++){
            for(int j = 0; j <array[i].length; j++){
                System.out.println("출력값 : "+i + "," + j);
                array[i][j] = 0;
            }
        }
    }
}
