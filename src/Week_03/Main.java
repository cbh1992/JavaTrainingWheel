package Week_03;

public class Main {
    public static void main(String[] args) {
        Car car = new Car(); //객체 생성

        //메서드 호출 및 반환값 지정
        System.out.println("기어 : " + car.gear);
        double speed = car.gasPedal(100,'D');
        System.out.println("속도 : "+speed);
        boolean lights = car.onOffLight();
        System.out.println("조명 : "+lights);
        System.out.println();
        System.out.println("기어 : " + car.gear);
        System.out.println();
        car.carSpeed(100,80);
        System.out.println();
        car.carSpeed(110,120,150);
    }
}
