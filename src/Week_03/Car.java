package Week_03;

//클래스 생성방식
//1. 클래스 선언
//2. 객체 속성(필드) 정의
//3. 생성자 정의
//4. 메소드 정의
public class Car {
    //필드 영역
    //고유데이터 영역
    String company; //제조사
    String model = "GV80"; //모델
    String color; //색상
    double price; //가격

    //상태 데이터 영역
    double speed; //속도
    char gear; //기어상태
    boolean light = true; //조명

    //객체 데이터 영역
    Tire tire = new Tire();
    Door door;
    Handle handle;

    //생성자 구역
    //생성자는 일반적으로 클래스의 이름과 동일하게 가져간다.  객체가 생성(instance)될때 어떤 로직을 수행할지, 어떤값이 필수인지 정의
    public Car(){
        System.out.println("생성자 호출 테스트");
    }
    //메소드 영역
    //gasPedal
    //input : km/h
    //output : speed
    double gasPedal(double kmh, char type){
        changeGear(type); //가속페달을 호출하면 자동으로 기어가 변한다
        speed = kmh;
        return speed;
    }

    //breakPedal
    //input : null
    //output : speed
    double breakPedal(){
        speed = 0;
        return speed;
    }

    //changeGear
    //input : gear(char)
    //output : gear
    char changeGear(char type){
        gear = type;
        return gear;
    }

    //onOffLight
    //input : null
    //output : switch(boolean)
    boolean onOffLight(){
        light = !light;
        return light;
    }

    //horn
    //input : null
    //output : null
    void horn(){
        System.out.println("빵빵");
    }

    //자동차의 속도를 가변길이 메서드로 구하기
    void carSpeed(double ... speeds){
        for (double v : speeds){
            System.out.println("v = "+v);
        }
    }
}
