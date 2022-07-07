package p2java;

import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        Pitagoras pitaguinho = new Pitagoras();

        System.out.println("------------------------------------------------");
        System.out.println("     Calculadora de Pitágoras ULTIMATE 3000");
        System.out.println("------------------------------------------------");
        System.out.println();
        System.out.print("Digite o valor do Cateto Adjacente: ");
        double catadUser = input.nextDouble();
        System.out.print("Digite o valor da Cateto Oposto: ");
        double catopUser = input.nextDouble();
        System.out.println();
        System.out.println("O valor da Hipotenusa é: ");
        System.out.println(pitaguinho.calcula_Trigonometria(catadUser, catopUser));
    }
}
