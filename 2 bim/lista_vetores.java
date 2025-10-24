import java.util.Scanner;

public class lista_vetores {   
    static Scanner s = new Scanner(System.in);
 public static void main(String[] args) {
    ex_o1();
}
     
     /*
      * 1. Declare um vetor do tipo real, com 4 posições. Peça as notas dos 4 bimestres de um aluno e no final
      * calcule a média.
      */
    public static void ex_o1() {
    
        double notas[] = new double[4];
        //preencher o vetor manualmente:
        notas[0] = pedir_numero_double();
        notas[1] = pedir_numero_double();
        notas[2] = pedir_numero_double();
        notas[3] = pedir_numero_double();
        
        //Exibir valores do vetor manualmente:
        System.out.println("Notas informadas:");
        System.out.println("Nota 1: " + notas[0]);
        System.out.println("nota 2: " + notas[1]);
        System.out.println("nota 3: " + notas[2]);
        System.out.println("nota 4: " + notas[3]);
        
        //preencher o vetor com for:
        for (int i =0; i < notas.length; i++){
            notas[i] = pedir_numero_double();
        }
        
        //Exibir valores do vetor com for:
        for (int i =0; i < notas.length; i++){
            System.out.println("Notas: " + notas[i]);
        }
    
    }

    public static double pedir_numero_double() {
      System.out.print("Informe um numero (real): ");
      return s.nextDouble();



    }



}


