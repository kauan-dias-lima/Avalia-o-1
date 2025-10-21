import java.util.Scanner;

public class atividade2 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        // Entrada de temperatura em Celsius
        System.out.print("Digite a temperatura em graus Celsius (°C): ");
        double celsius = scanner.nextDouble();

        // Conversões
        double fahrenheit = (celsius * 9 / 5) + 32;
        double kelvin = celsius + 273.15;

        // Saída dos resultados
        System.out.printf("Temperatura em Fahrenheit (°F): %.2f\n", fahrenheit);
        System.out.printf("Temperatura em Kelvin (K): %.2f\n", kelvin);

        scanner.close();
    }
}
