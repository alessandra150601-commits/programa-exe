import java.util.Random;

public class par_impar {
  public static void main(String[] args){
    
    // Declaração e Inicialização do Vetor (Estrutura Homogênea) [2]
    int[] vetorDeNumeros = new int[20];
    
    // Objeto para geração de números aleatórios
    Random gerador = new Random();

    // --- A: Preenchendo o Vetor com números aleatórios (Laço de Repetição 'for') ---
    System.out.println("--- Gerando 20 numeros aleatorios ---");
    
    // O laço 'for' é ideal quando o número de repetições é conhecido (20, neste caso) [11]
    for (int i = 0; i < 20; i++) {
       // Gera um inteiro aleatório entre 0 e 100
       int numeroAleatorio = gerador.nextInt(101); // 0 a 100

       // Armazena no vetor
         vetorDeNumeros[i] = numeroAleatorio;
    
        }
     
        // --- B: Verificando e Exibindo Paridade (Chamando a função Modularizada) ---
        System.out.println("\n--- resultado da verificacao de paridade ---");
         for (int i = 0; i < 20; i++) {
            
            int numeroAtual = vetorDeNumeros[i];

            // Chama a função verificarParImpar para obter o resultado em texto
            String resultadoParidade = verificarParImpar(numeroAtual);

             // Exibe o resultado (Saída de dados) [13]
             System.out.println("Posicao [" + i + "]: Numero " + numeroAtual + " é " + resultadoParidade);
         }
    }
       
    // Implementação da função (Modularização)
    public static String verificarParImpar(int numero) {
        if (numero % 2 == 0) {
            return " par";
        } else {
            return " impar";
        }
    }
}
    
    

