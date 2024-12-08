package Task2.hmn2;

import java.util.Arrays;

// мэин класс
public class Auto {
    public static void main(String[] args) {
        // Создание движка, колеса и замка
        Engine engine = new Engine(2.0, "Chrysler Neon", "92");
        Wheel wheel = new Wheel(16.5, "Летние", "Goodyear(USA)");
        Lock lock = new Lock("key222");

        // машина (анон)
        Car car = new Car(engine, wheel, 4, "A", lock) {
            @Override
            public void start() {
                System.out.println("Авто заведено");
            }
        };

        // водила
        Driver driver = new Driver(3, Arrays.asList("A", "C"), Arrays.asList("key222", "key444"));

        // Действия
        if (driver.openCar(car, "key222")) {
            car.start();
            driver.drive(car);
            driver.takePassengers(4);
            car.refuel("92");
        }
    }
}
