package Week_02;

import java.util.Scanner;

public class W11 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
//        boolean flag1 = true;
//        if(flag1){
//            //flag가 true일때
//            System.out.println("값이 true 입니다");
//        }else{
//            System.out.println("값이 false 입니다");
//        }
        int a = sc.nextInt();
        int b = sc.nextInt();

        if(a > b){
            System.out.println("a가 크다");
        } else if(a < b){
            System.out.println("b가 크다");
        } else {
            System.out.println("동일하다");
        }

    }
}
