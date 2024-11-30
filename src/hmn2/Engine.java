package hmn2;

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
