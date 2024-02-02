package Week_02.Operator;

public class W16 {
    public static void main(String[] args) {
        //while 구문은 무한루프를 조심해야 한다
        //while (조건문) {(연산)}
//        int num = 0;
//        while (num < 3){
//            num++;
//            System.out.println(num+" 출력");
//        }

//        int num = 4;
//        do {
//            //while보다 먼저 실행되는 코드
//            System.out.println(num+" 출력");
//        }while (num < 3);

//        //break (로직 강제종료)
//        //가장 가까운 블록의 for 또는 while, switch 구문을 종료시킨다
//        int num = 0;
//        while (num < 4){
//            num++;
//            if(num == 3){
//                break;
//            }
//            System.out.println(num + " 출력");
//        }

        for (int i = 0; i<10; i++){
            System.out.println("i값은 = "+i);
            if(i ==2){
                break;
            }
            for(int j = 0; j<10; j++){
                System.out.println("j값은 = "+j);
                if(j == 2){
                    break;
                }
            }
        }

        //continue 구문은 하위 로직을 건들지 않는다
        int num = 0;
        while (num < 3){
            num++;
            if(num ==2){
                continue;
            }
            System.out.println(num + " 출력");
        }
    }
}
