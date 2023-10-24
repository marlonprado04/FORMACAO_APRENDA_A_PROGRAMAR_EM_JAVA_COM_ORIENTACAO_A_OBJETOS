public class ConversorTemperatura {

    public static void main(String[] args) {
        int celsius = 36;

        double farenheit = (celsius * 1.8) + 32;

        System.out.println(String.format("%d graus celsius equivalem a %f2 graus farenheit", celsius, farenheit));
    }
}
