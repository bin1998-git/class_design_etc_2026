package com.tenco.adapter;

interface IElectronic220v {
    void connect();
}

interface IElectronic110v {
    void connect();
}

public class MyHouse {

    public static void homeConnect(IElectronic220v iElectronic220v) {
        // 벽에 콘센트 스펙 220v
        iElectronic220v.connect();
    }


    public static void main(String[] args) {
        HairDryer hairDryer = new HairDryer();
        AirConditioner airConditioner = new AirConditioner();

        // 기기를 연결해보자
        homeConnect(airConditioner);
        ElectronicAdapter electronicAdapter = new ElectronicAdapter(hairDryer);
        homeConnect(electronicAdapter);
        // 인터페이스가 서로 호환이 되지 않아서 철물점에 가서 돼지코를 사와야함
        // 어댑터 패턴으로 해결이 가능하다
        //homeConnect(hairDryer);

    // homeConnect 통해서 가전기기를 연결하게 만들어 보자

    } // end of main
} // end of MyHouse

class HairDryer implements IElectronic110v{

    @Override
    public void connect() {
        System.out.println("헤어 드라이어 연결 110v");
    }
}

class AirConditioner implements IElectronic220v {
    @Override
    public void connect() {
        System.out.println("에어컨 연결 220v");
    }
}