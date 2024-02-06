package Week_03;

public class Main {
    public static void main(String[] args) {
        Car car = new Car(); //객체 생성

        //초기값, 기본값 확인 -> 초기값이 있으면 초기값을, 없으면 기본값이 설정됨
        System.out.println("모델명 = " + car.model);
        System.out.println("색상 = " + car.color);
        System.out.println();
        System.out.println("속도 = " + car.speed);
        System.out.println("기어 = " + car.gear);
        System.out.println("조명 = " + car.light);
        System.out.println();
        System.out.println("타이어 = " + car.tire);
        System.out.println("문 = " + car.door);
        System.out.println();

        //필드 사용
        System.out.println("필드 변경");
        car.color = "blue";
        car.speed = 100;
        car.light = false;
        System.out.println("색상 = " + car.color);
        System.out.println("속도 = " + car.speed);
        System.out.println("조명 = " + car.light);
    }
}
