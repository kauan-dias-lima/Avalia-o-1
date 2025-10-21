 import java.util.Scanner;

public class atividade1 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        double[] notas = new double[8];
        double[] mediasBimestrais = new double[4];
        double[] mediasSemestrais = new double[2];
        double mediaFinal;

        // Entrada das 8 notas com validação
        System.out.println("Digite as 8 notas do aluno (de 0 a 10):");
        for (int i = 0; i < 8; i++) {
            double nota;
            do {
                System.out.print("Nota " + (i + 1) + ": ");
                nota = scanner.nextDouble();
                if (nota < 0 || nota > 10) {
                    System.out.println("Nota inválida! Digite um valor entre 0 e 10.");
                }
            } while (nota < 0 || nota > 10);
            notas[i] = nota;
        }

        // Cálculo das médias bimestrais (cada bimestre tem 2 notas)
        for (int i = 0; i < 4; i++) {
            mediasBimestrais[i] = (notas[i * 2] + notas[i * 2 + 1]) / 2;
        }

        // Cálculo das médias semestrais (cada semestre tem 2 bimestres)
        mediasSemestrais[0] = (mediasBimestrais[0] + mediasBimestrais[1]) / 2;
        mediasSemestrais[1] = (mediasBimestrais[2] + mediasBimestrais[3]) / 2;

        // Cálculo da média final (média dos dois semestres)
        mediaFinal = (mediasSemestrais[0] + mediasSemestrais[1]) / 2;

        // Saída
        System.out.println("\nMédias Bimestrais:");
        for (int i = 0; i < 4; i++) {
            System.out.printf("Bimestre %d: %.2f\n", i + 1, mediasBimestrais[i]);
        }

        System.out.println("\nMédias Semestrais:");
        System.out.printf("1º Semestre: %.2f\n", mediasSemestrais[0]);
        System.out.printf("2º Semestre: %.2f\n", mediasSemestrais[1]);

        System.out.println("\nMédia Final:");
        System.out.printf("Média Final: %.2f\n", mediaFinal);

        scanner.close();
    }
}