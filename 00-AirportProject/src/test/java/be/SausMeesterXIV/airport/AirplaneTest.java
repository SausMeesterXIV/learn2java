package be.SausMeesterXIV.airport;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class AirplaneTest {

    @Test
    void toStringReturnsCorrectFormat(){
        String model = "JAS 39 Gripen";
        double fuelLevel = 15.5;
        int maxRange = 2200;
        Airplane airplane = new Airplane(model, 15.5, maxRange);

        String result = airplane.toString();

        assertEquals("Airplane[model: JAS 39 Gripen, fuel 15.50, 2200]", result);

    }
}
