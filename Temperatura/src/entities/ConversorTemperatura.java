package entities;

public class ConversorTemperatura {

    public static double celciusKelvin(double grau){
        return grau + 273.15;
    }

    public static double celsiusFahrenheit(double grau){
        return grau * 1.8 + 32;
    }

    public static double kelvinCelsius(double grau){
        return grau - 273;
    }

    public static double kelvinFahrenheit(double grau){
        return (grau - 273) * 1.8 + 32;
    }

    public static double fahrenheitCelsius(double grau){
        return (grau - 32) / 1.8;
    }

    public static double fahrenheitKelvin(double grau){
        return (grau - 32) * 5 / 9 + 273;
    }

}
