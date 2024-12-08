package Task2.hmn2;

import java.util.List;

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
        if (keys.contains(key) && car.getLock().unlock(key)) {
            System.out.println("Авто открыто!");
            return true;
        } else {
            System.out.println("Авто не получилось открыть. Неверный ключ!");
            return false;
        }
    }

    public void drive(Car car) {
        if (licenseCategories.contains(car.getLicenseCategory())) {
            System.out.println("Водитель может управлять машиной");
        } else {
            System.out.println("Водитель НЕ может управлять машиной");
        }
    }

    public void takePassengers(int count) {
        System.out.println("Тут " + count + " пассажиров");
    }
}
