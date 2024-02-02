package Week_02.Array;

import java.util.Arrays;

public class Arr04 {
    public static void main(String[] args) {
        //Arrays.copyOf() 메소드
        int[] a = {1,2,3,4};
        int[] b = Arrays.copyOf(a, a.length);
        //배열 a 와 a의 length를 b에 담는다

        a[3] = 0;
        System.out.println(a[3]);
        System.out.println(b[3]);
    }
}
