package Task2.hmn2;

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
