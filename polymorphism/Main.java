package polymorphism;

public class Main {
    public static void main(String[] args) {
        Car car = new Infiniti();
        System.out.println(car.getBrand());
        car = new Mazda();
        System.out.println(car.getBrand());
    }
}
