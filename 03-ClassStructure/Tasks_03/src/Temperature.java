public class Temperature {
    static double celsiusToKelvin(double celsius){
        return celsius + 273.15;
    }
    static double kelvinToCelcius(double kelvin){
        return kelvin - 273.15;
    }
    static double fahrenheitToCelcius(double fahrenhreit){
        return (fahrenhreit -32)/1.8;
    }
    static double celciusToFahrenheit(double celcius){
        return celcius * 1.8 + 32;
    }
    static double farenheitToKelvin(double fahrenheit){
        return (fahrenheit + 459.67) * (5.0/9.0);
    }
    static double kelvinToFahrenheit(double kelvin){
        return kelvin * (9.0 / 5.0) - 459.67;
    }

    public static void main(String[] args) {
        System.out.println(celciusToFahrenheit(25));
        System.out.println(celsiusToKelvin(25));
        System.out.println(farenheitToKelvin(100));
        System.out.println(fahrenheitToCelcius(100));
        System.out.println(kelvinToCelcius(0));
        System.out.println(kelvinToFahrenheit(0));
    }
}
