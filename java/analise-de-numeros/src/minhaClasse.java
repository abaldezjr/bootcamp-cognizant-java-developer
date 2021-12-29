import java.io.IOException;
import java.util.Scanner;

public class minhaClasse {

    public static void main(String[] args) throws IOException {
        Scanner leitor = new Scanner(System.in);

        //declare suas variaveis corretamente
        int n1 = leitor.nextInt();
        int n2 = leitor.nextInt();
        int n3 = leitor.nextInt();
        int n4 = leitor.nextInt();
        int n5 = leitor.nextInt();

        int quantidadePares = 0;
        int quantidadeImpares = 0;
        int quantidadePositivos = 0;
        int quantidadeNegativos = 0;

        int numeros[] = { n1, n2, n3, n4, n5 };

        //continue a solução
        for (int i = 0; i < numeros.length; i++) {
            if (numeros[i] > 0) {
                quantidadePositivos++;
            } else if(numeros[i] < 0) {
                quantidadeNegativos++;
            }
            if (numeros[i] % 2 == 0) {
                quantidadePares++;
            } else {
                quantidadeImpares++;
            }
        }

        //insira suas variaveis corretamente
        System.out.println(quantidadePares + " par(es)");
        System.out.println(quantidadeImpares + " impar(es)");
        System.out.println(quantidadePositivos + " positivo(s)");
        System.out.println(quantidadeNegativos + " negativo(s)");
    }

}