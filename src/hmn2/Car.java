package hmn2;

abstract class Car { //Сделать приват и сделать через геттеры и сеттеры
    private Engine engine; //можно выделить по строчке через колосекор мышьки и shift
    private Wheel wheel;
    private int seatCount;
    private String licenseCategory;
    private Lock lock;

    public Engine getEngine() {
        return engine;
    }

    public void setEngine(Engine engine) {
        this.engine = engine;
    }

    public Wheel getWheel() {
        return wheel;
    }

    public void setWheel(Wheel wheel) {
        this.wheel = wheel;
    }

    public int getSeatCount() {
        return seatCount;
    }

    public void setSeatCount(int seatCount) {
        this.seatCount = seatCount;
    }

    public String getLicenseCategory() {
        return licenseCategory;
    }

    public void setLicenseCategory(String licenseCategory) {
        this.licenseCategory = licenseCategory;
    }

    public Lock getLock() {
        return lock;
    }

    public void setLock(Lock lock) {
        this.lock = lock;
    }


    public Car(Engine engine, Wheel wheel, int seatCount, String licenseCategory, Lock lock) {
        this.engine = engine;
        this.wheel = wheel;
        this.seatCount = seatCount;
        this.licenseCategory = licenseCategory;
        this.lock = lock;
    }

    public abstract void start();

    public void refuel(String fuelType) {
        if (engine.getCompatibleFuel().equals(fuelType)) {
            System.out.println("Заправлено топливом " + fuelType);
        } else {
            System.out.println("Неподходящее топливо " + fuelType);
        }
    }
}
