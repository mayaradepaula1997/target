public class SomaAteIndice {


        public static void main(String[] args) {
            int indice = 12;
            int soma = 0;
            int k = 1;

            while (k < indice) {
                k = k + 1; // Incrementa K
                soma = soma + k; // Adiciona K à soma
            }

            System.out.println("O valor da variável SOMA é: " + soma);
        }
    }

