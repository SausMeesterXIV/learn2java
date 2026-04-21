package be.SausMeesterXIV.airport;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class AirplaneTest {

    @Test
    void toString_ReturnsCorrectFormat(){
        String model = "JAS 39 Gripen";
        double fuelLevel = 15.5;
        int maxRange = 2200;
        Airplane airplane = new Airplane(model, fuelLevel, maxRange);

        String result = airplane.toString();

        assertEquals("Airplane[model: JAS 39 Gripen, fuel: 15.50, max range: 2200]", result);

    }

    @Test
    void tank_shouldIncreaseFuelLevel(){
        Airplane airplane = new Airplane("Eurofighter", 50.0, 1500);
        airplane.tank(100.0);

        assertEquals(150.0, airplane.getFuelLevel());
    }
}
