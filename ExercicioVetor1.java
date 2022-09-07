import java.util.Scanner;

public class ExercicioVetor1 {

    public static void main(String[] args) {

        System.out.println("Quantos números serão informados?");
        Scanner scanner = new Scanner(System.in);
        String input = scanner.next();
        Integer tamanhoVetor = Integer.valueOf(input);
        Integer[] vetor = new Integer[tamanhoVetor];

        Integer valor;

        for (int i = 0; i < tamanhoVetor;i++) {
            System.out.println("Informe o valor do vetor na posição #" + i);
            scanner = new Scanner(System.in);
            input = scanner.next();
            valor = Integer.valueOf(input);
            vetor[i] = valor;
        }

        System.out.println("Números negativos: ");
        for (int i = 0; i < tamanhoVetor;i++) {
            if (vetor[i] < 0) {
                System.out.println(vetor[i]);
            }
        }
    }
}


