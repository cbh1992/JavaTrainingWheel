package Week_02.Array;

public class Arr08 {
    public static void main(String[] args) {
        //최대값 구하기
        int[] arr = {3,2,1,5,1};
        //최대값 초기화 세팅
        int max = arr[0];
        int min = arr[0];
        //최대값 구하기 로직
        for(int maxnum : arr){
            if(maxnum > max){
                max = maxnum;
            }
        }

        //최소값 구하기 로직
        for(int minnum : arr){
            if(minnum<min){
                min = minnum;
            }
        }
        System.out.println("최대값 : " + max);
        System.out.println("최소값 : " + min);
    }
}
