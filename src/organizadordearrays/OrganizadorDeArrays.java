/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package organizadordearrays;

import java.util.Arrays;
import java.util.Scanner;

/**
 *
 * @author Thiago Aguiar
 */
public class OrganizadorDeArrays {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);

        System.out.println("**** CRIANDO UM VETOR ****");
        System.out.println("Quantos números deseja digitar?");
        int qtdNumerosParaOrdenar = input.nextInt();
        int[] listaNumerosParaOrdenar = new int[qtdNumerosParaOrdenar];

        for (int i = 0; i < listaNumerosParaOrdenar.length; i++) {

            System.out.println("Digite um número inteiro: ");
            listaNumerosParaOrdenar[i] = input.nextInt();

        };

        System.out.println("**** VETOR ORIGINAL ****");
        for (int numero : listaNumerosParaOrdenar) {

            System.out.print(numero + " ");

        };
        System.out.println("");

        Arrays.sort(listaNumerosParaOrdenar);
        int[] listaNumerosOrdenados = listaNumerosParaOrdenar;

        System.out.println("**** VETOR ORDENADO ****");
        for (int numero : listaNumerosOrdenados) {

            System.out.print(numero + " ");

        };
        System.out.println("");

        System.out.println("**** RECUPERANDO UM VALOR ****");
        System.out.println("Qual número do vetor deseja recuperar?");
        int numeroParaRecuperar = input.nextInt();

        int posicaoNumeroRecuperado = Arrays.binarySearch(listaNumerosOrdenados, numeroParaRecuperar);

        if (posicaoNumeroRecuperado < 0) {

            System.out.println("Número não existe no vetor!!!");

        } else {

            System.out.println("O número " + numeroParaRecuperar + " está na posição " + posicaoNumeroRecuperado);

        }

        System.out.println("**** SOBRESCREVENDO UM VETOR ****");
        System.out.println("Digite um número padrão para preencher todo o vetor:");
        int numeroPadrao = input.nextInt();

        Arrays.fill(listaNumerosOrdenados, numeroPadrao);

        System.out.println("Novo vetor:");
        for (int numero : listaNumerosOrdenados) {

            System.out.print(numero + " ");

        }

    }

}
