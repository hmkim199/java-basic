package class1.study;

public class CarMain {
    public static void main(String[] args) {
        Car myCar = new Car();
        myCar.brand = "테슬라";
        myCar.year = 2024;

        System.out.println("[내 차 정보] 브랜드: " + myCar.brand + ", 년도: " + myCar.year);
    }
}


