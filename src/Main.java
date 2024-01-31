import java.util.Scanner;
import static java.awt.SystemColor.text;

//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
//        //char는 문자 하나를 지정하고 작은따옴표로 선언한다
//        char alpha = 'a';
//        //String은 문자열을 지정하고 저장시 끝에 \0, Null값을 저장한다
//        String text = "text";
//
//        //숫자를 입력하면 아스키 문자로
//        int ascii = sc.nextInt();
//        char ch = (char) ascii;
//        System.out.println(ch);
//
//        //문자를 입력하면 아스키 코드로
//        char ch = sc.nextLine().charAt(0);
//        int ascii = (int) ch;
//        System.out.println(ascii);

//        //형 변환
//        //실수->정수
//        double doubleNum = 20.020;
//        float floatNum = 10.010F;
//        int intNum1;
//        intNum1 = (int)doubleNum;
//        int intNum2;
//        intNum2 = (int)floatNum;
//        System.out.println("더블타입 " + doubleNum);
//        System.out.println("더블을Int로 " + intNum1);
//        System.out.println("float타입 " + floatNum);
//        System.out.println("float을Int로 " + intNum2);
//
//        //정수->실수
//        int intNum1 = 10;
//        int intNum2 = 20;
//        double doubleNum = (double) intNum1;
//        float floatNum = (float) intNum2;
//        System.out.println(doubleNum);
//        System.out.println(floatNum);
//        //char -> 정수.  알파벳의 아스키코드를 int로 변환
//        char alpha = 'A';
//        int intNum = alpha; //(int)없이도 암시적 변환
//        System.out.println(intNum);
//        //형 변환과 계산은 같이 가능
//        int intNum = 10;
//        double doubleNum = 5.5;
//        double result = intNum+doubleNum;
//        System.out.println("더하기 "+ result);
//        //나누기
//        int iResult = intNum/2;
//        double dResult = intNum/2.0;
//        System.out.println("int나누기 "+ iResult);
//        System.out.println("더블나누기 "+ dResult);
        String title = sc.nextLine();   //제목
        double rating = sc.nextDouble();    //점수
        int intRating = (int) rating;    //점수를 정수로
        if (rating < 1) {  //별점이 1점 미만
            System.out.println("별점은 1점 이상 부여해야 합니다");
        }else if(rating > 5){  //별점이 5점 초과
            System.out.println("별점은 5점 이하로 부여해야 합니다");
        }else { //별점이 1~5점일때 나올문구
            String line1 = sc.next();   //1번째 줄
            String line2 = sc.next();   //2번째 줄
            String line3 = sc.next();   //3번째 줄
            String line4 = sc.next();   //4번째 줄
            String line5 = sc.next();   //5번째 줄
            String line6 = sc.next();   //6번째 줄
            String line7 = sc.next();   //7번째 줄
            String line8 = sc.next();   //8번째 줄
            String line9 = sc.next();   //9번째 줄
            String line10 = sc.next();   //10번째 줄

            System.out.println("[ " + title + " ]");
            System.out.println("별점 : " + intRating + "  (" + rating * 20 + "%)");
            System.out.println("1. " + line1);
            System.out.println("2. " + line2);
            System.out.println("3. " + line3);
            System.out.println("4. " + line4);
            System.out.println("5. " + line5);
            System.out.println("6. " + line6);
            System.out.println("7. " + line7);
            System.out.println("8. " + line8);
            System.out.println("9. " + line9);
            System.out.println("10. " + line10);
        }
    }
}