package Week_02.Array;

public class Arr05 {
    public static void main(String[] args) {
        //문자(char), 문자열(String)을 구분
        //String = char[]

        //기본형 변수는 소문자로, 참조형 변수는 대문자로 시작
        //wrapper class에서 기본형 변수를 박싱할때 int->Integer
        //기본형 변수는 값 자체를, 참조형 변수는 별도 공간에 값을 저장하고 해당 주소값을 저장(= 주소형 변수)

        String str = "ABCD";

        //length.  글자 개수
        int strLength = str.length();
        System.out.println(strLength);

        //charAt(int index)
        char strChar = str.charAt(1);
        System.out.println(strChar);

        //substring(int formIdx, int toIdx)
        String strSub = str.substring(0, 3); //0번째 글자부터 3번째 글자 이전까지 추출
        System.out.println(strSub);

        //equals(String str)
        String newStr = "ABCD";
        boolean strEqual = newStr.equals(str);
        System.out.println(strEqual);

        //toCharArray() : String을 Char[]로 변환
        char[] strCharArray = str.toCharArray();

        //char[] 를 String으로 변환
        char[] charArray = {'A', 'B', 'C'};
        String charArrayString = new String(charArray);
        System.out.println(charArrayString);
    }
}
