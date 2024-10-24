package builder;

public class Main {
    public static void main(){
        Car car = new Car.CarBuilder().setEnginePower(500).setColor("red").build();
        System.out.println(car);
    }
}
