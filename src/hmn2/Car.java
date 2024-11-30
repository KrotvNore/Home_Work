package hmn2;

abstract class Car { //Сделать приват и сделать через геттеры и сеттеры
    protected Engine engine; //можно выделить по строчке через колосекор мышьки и shift
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
        if (engine.getCompatibleFuel().equals(fuelType)) {
            System.out.println("Заправлено топливом " + fuelType);
        } else {
            System.out.println("Неподходящее топливо " + fuelType);
        }
    }
}
