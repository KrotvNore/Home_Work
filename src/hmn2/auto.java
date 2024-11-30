package hmn2;

import java.util.Arrays;
import java.util.List;

abstract class Car {
    protected Engine engine;
    protected Wheel wheel;
    protected int seatCount;
    protected String licenseCategory;
    protected Lock lock;

    public Car(Engine engine, Wheel wheel, int seatCount, String licenseCategory, Lock lock) {
        this.engine = engine;
        this.wheel = wheel;
        this.seatCount = seatCount;
        this.licenseCategory = licenseCategory;
        this.lock = lock;
    }

    public abstract void start();

    public void refuel(String fuelType) {
        if (engine.getCompatibleFuel().contains(fuelType)) {
            System.out.println("Заправлено топливом " + fuelType);
        } else {
            System.out.println("Неподходящее топливо " + fuelType);
        }
    }
}

// Engine
class Engine {
    private double volume;
    private String name;
    private String compatibleFuel;

    public Engine(double volume, String name, String compatibleFuel) {
        this.volume = volume;
        this.name = name;
        this.compatibleFuel = compatibleFuel;
    }

    public double getVolume() {
        return volume;
    }

    public String getName() {
        return name;
    }

    public String getCompatibleFuel() {
        return compatibleFuel;
    }
}

// Wheel
class Wheel {
    private double diameter;
    private String seasonType;
    private String name;

    public Wheel(double diameter, String seasonType, String name) {
        this.diameter = diameter;
        this.seasonType = seasonType;
        this.name = name;
    }

    public double getDiameter() {
        return diameter;
    }

    public String getSeasonType() {
        return seasonType;
    }

    public String getName() {
        return name;
    }
}

//  Lock
class Lock {
    private String key;

    public Lock(String key) {
        this.key = key;
    }

    public boolean unlock(String providedKey) {
        return key.equals(providedKey);
    }
}

// Driver
class Driver {
    private int exp;
    private List<String> licenseCategories;
    private List<String> keys;

    public Driver(int exp, List<String> licenseCategories, List<String> keys) {
        this.exp = exp;
        this.licenseCategories = licenseCategories;
        this.keys = keys;
    }

    public boolean openCar(Car car, String key) {
        if (keys.contains(key) && car.lock.unlock(key)) {
            System.out.println("Авто открыто!");
            return true;
        } else {
            System.out.println("Авто не получилось открыть. Неверный ключ!");
            return false;
        }
    }

    public void drive(Car car) {
        if (licenseCategories.contains(car.licenseCategory)) {
            System.out.println("Водитель может управлять машиной");
        } else {
            System.out.println("Водитель НЕ может управлять машиной");
        }
    }

    public void takePassengers(int count) {
        System.out.println("Тут " + count + " пассажиров");
    }
}

// мэин класс
public class auto {
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
