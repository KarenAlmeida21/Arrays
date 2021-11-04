import java.util.Arrays;
import java.util.Scanner;

public class Sistema {


    public static void main(String[] args) {
        Scanner leitor = new Scanner(System.in);
        System.out.print("Quantas notas?");
        int qtdeNotas = leitor.nextInt();

        double[] notas = new double[qtdeNotas];
        for (int i = 0; i < notas.length; i++) {
            System.out.println("Informe a " + (i + 1) + ":");
            notas[i] = leitor.nextInt();
        }
       double total = 0;
        for (double nota: notas){
            total  += nota;

        }
        System.out.println("média "+total/2);


    }
}
