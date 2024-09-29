import java.util.Scanner;

public class ConteA {

        public static void main(String[] args) {
            Scanner scanner = new Scanner(System.in);

            System.out.println("Digite uma string:");
            String entrada = scanner.nextLine();

            int contador = 0;

            // Convertendo a string para minúsculas para facilitar a comparação
            String entradaLower = entrada.toLowerCase();

            // Contando as ocorrências da letra 'a'
            for (char c : entradaLower.toCharArray()) {
                if (c == 'a') {
                    contador++;
                }
            }

            if (contador > 0) {
                System.out.println("A letra 'a' (ou 'A') aparece " + contador + " vezes.");
            } else {
                System.out.println("A letra 'a' (ou 'A') não foi encontrada.");
            }

            scanner.close();
        }
    }



