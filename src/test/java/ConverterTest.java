public class ConverterTest {

    public static void main(String[] args) {

        assert Converter.celsiusToFahrenheit(0) == 32.0f;
        assert Converter.celsiusToFahrenheit(100) == 212.0f;
        assert Converter.fahrenheitToCelsius(32) == 0.0f;

        System.out.println("All tests passed!");
    }
}