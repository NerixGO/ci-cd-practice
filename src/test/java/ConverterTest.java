import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;


public class ConverterTest {


    @Test
    void convertsCelsiusToFahrenheit() {

        assertEquals(32.0f, Converter.celsiusToFahrenheit(0));
        assertEquals(212.0f, Converter.celsiusToFahrenheit(100));

    }


    @Test
    void convertsFahrenheitToCelsius() {

        assertEquals(0.0f, Converter.fahrenheitToCelsius(32));
        assertEquals(100.0f, Converter.fahrenheitToCelsius(212));

    }


    @Test
    void convertsKilometersToMiles() {

        assertEquals(0.621371f, Converter.kmToMiles(1));

    }


    @Test
    void convertsMilesToKilometers() {

        assertEquals(1.60934f, Converter.milesToKm(1));

    }


    @Test
    void convertsKilogramsToPounds() {

        assertEquals(2.20462f, Converter.kgToPounds(1));

    }
}
