package be.SausMeesterXIV.airport;

public class Airplane{
    private final String model;
    private final double fuelLevel;
    private final int maxCapacity;
    //Attributes (type, fuelLevel, maxCapacity)

    public Airplane(String type, double fuelLevel, int maxCapacity){
        this.model = type;
        this.fuelLevel = fuelLevel;
        this.maxCapacity = maxCapacity;
    }

    @Override
    public String toString(){
        return String.format("Airplane[model: %s, fuel %.2f, %d]", model, fuelLevel, maxCapacity);
    }
}

