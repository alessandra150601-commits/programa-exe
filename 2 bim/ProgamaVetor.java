import java.util.Scanner;

public class ProgamaVetor{

    /**
     * Pede um número ao usuário e valida se ele está entre 1 e 999.
     * Repete a solicitação até que a entrada seja válida.
     * @param scanner Objeto Scanner para leitura de entrada.
     * @return O número inteiro válido informado pelo usuário.
     */

    public static int pedirNumeroValido(Scanner scanner) {
       int numero;
       boolean valido;

       do {
            System.out.print("Informe um numero entre 1 e 999; ");
            
            if (scanner.hasNextInt()) {
                numero = scanner.nextInt();
                if (numero > 0 && numero < 1000) {
                    valido = true;
                    return numero;
                } else {
                    valido = false;
                    System.out.println("Numero invalido. O numero deve ser maior que 0 e menor que 1000.");
                }
            
            } else { 
                System.out.println("Entrada invalida. Por favor informe um numero inteiro. ");
                scanner.next();
                valido = false;

            }
              } while(!valido);
               return 0;
              
            }

            public static void main(String[] args) {
              Scanner sc = new Scanner(System.in);
              int[] VetordeNumeros = new int[24];

              System.out.println("--- preenchendo o vetor de 10 posições ---");
              for (int i = 0; i < 10; i++) {
                System.out.println("\nEntrada para a posição " + i + ":");
                VetordeNumeros[i] = pedirNumeroValido(sc);

            }

                System.out.println("\n--- Numeros Finais Informados ---");
                for (int i = 0; i < 10; i++) {
                    System.out.println("Valor na poisicao [" + i + "]: " + VetordeNumeros[i]);
                }
                sc.close();
    }

}
