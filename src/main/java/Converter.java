import java.util.Scanner;

public class Converter {

    public static float celsiusToFahrenheit(float c) {
        return c * (9.0f / 5) + 32;
    }

    public static float fahrenheitToCelsius(float f) {
        return (f - 32) * 5.0f / 9;
    }

    public static float kmToMiles(float km) {
        return km * 0.621371f;
    }

    public static float milesToKm(float miles) {
        return miles * 1.60934f;
    }

    public static float kgToPounds(float kg) {
        return kg * 2.20462f;
    }

    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);

        System.out.println("Choose what do you want to convert:\n1. Celsius to Fahrenheit\n2. Fahrenheit to Celsius\n3. Kilometers to miles\n4. Miles to kilometers\n5. Kilograms to pounds\n");

        int operator = input.nextInt();

        switch (operator) {

            case 1 -> {
                System.out.print("C = ");
                System.out.println(celsiusToFahrenheit(input.nextFloat()) + " F");
            }

            case 2 -> {
                System.out.print("F = ");
                System.out.println(fahrenheitToCelsius(input.nextFloat()) + " C");
            }

            case 3 -> {
                System.out.print("Km = ");
                System.out.println(kmToMiles(input.nextFloat()) + " miles");
            }

            case 4 -> {
                System.out.print("Miles = ");
                System.out.println(milesToKm(input.nextFloat()) + " km");
            }

            case 5 -> {
                System.out.print("Kg = ");
                System.out.println(kgToPounds(input.nextFloat()) + " pounds");
            }

            default -> System.out.println("Wrong operator");
        }

        input.close();
    }
}
