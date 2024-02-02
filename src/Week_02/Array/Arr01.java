package Week_02.Array;

public class Arr01 {
    public static void main(String[] args) {
        //배열 생성
        int[] intArray = new int[3];
        boolean[] boolArray = new boolean[3];
        String[] stringArray = new String[3];

        //배열 순회(값을 하나씩 뽑아서 조회)
        //단건 조회
        System.out.println(intArray[1]);
        //다건 조회
        for (int i = 0; i<intArray.length; i++){
            System.out.println(intArray[i]);
        }
    }
}
