package Week_02;

import java.util.Scanner;

public class W17 {
    public static void main(String[] args) {
        Scanner sc = new Scanner((System.in));

//        //구구단 전체
//        for (int num1 = 2; num1<=9; num1++){
//            for (int num2 = 2; num2 <=9; num2++){
//                System.out.println(num1 + " 곱하기 " + num2 +" 는 " + num1*num2 + " 입니다");
//            }
//        }

        int passNum = sc.nextInt();
//        //입력받는 단을 제외하고 출력
//        for (int num1 = 2; num1<=9; num1++){
//            if(num1 == passNum){
//                continue;
//            }
//            for (int num2 = 2; num2 <=9; num2++){
//                System.out.println(num1 + " 곱하기 " + num2 +" 는 " + num1*num2 + " 입니다");
//            }
//        }

        //입력한 단만 출력
            for(int num1 = 2; num1<=9; num1++){
                System.out.println(passNum + " 곱하기 " + num1 + " 는 " + passNum*num1 + " 입니다");
            }
    }
}
