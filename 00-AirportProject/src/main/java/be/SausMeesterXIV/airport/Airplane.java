package be.SausMeesterXIV.airport;

public class Airplane{
    private final String model;
    private  double fuelLevel;
    private int maxRange;
    //Attributes (type, fuelLevel, maxCapacity)

    public Airplane(String model, double fuelLevel, int maxRange){
        this.model = model;
        this.fuelLevel = fuelLevel;
        this.maxRange = maxRange;
    }

    @Override
    public String toString(){
        return String.format("Airplane[model: %s, fuel %.2f, %d]", model, fuelLevel, maxRange);
    }
}

